package com.huntercodexs.mockapiclinetdemo.provider.service;

import com.huntercodexs.mockapiclinetdemo.provider.dto.request.ProviderRequestDto;
import com.huntercodexs.mockapiclinetdemo.provider.dto.response.ProviderResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static com.huntercodexs.mockapiclinetdemo.provider.mapper.ProviderResponseMapper.mapperResponseProviderDto;

@Service
public class ProviderService {

    @Value("${provider.security.type}")
    String providerSecurityType;

    @Value("${provider.basic-auth}")
    String providerBasicAuth;

    @Value("${provider.api-key.app-name}")
    String providerApiKeyAppName;

    @Value("${provider.api-key.secret}")
    String providerApiKeySecret;

    @Value("${provider.api-key.token}")
    String providerApiKeyToken;

    @Value("${provider.api-key.additional}")
    String providerApiKeyAdditional;

    private boolean isAuth(HttpServletRequest headers) {

        String authHeader = headers.getHeader("Authorization");
        String apiKeyAppName = headers.getHeader("Api-Key-App-Name");
        String apiKeySecret = headers.getHeader("Api-Key-Secret");
        String apiKeyToken = headers.getHeader("Api-Key-Token");
        String apiKeyAdditional = headers.getHeader("Api-Key-Additional");

        if (providerSecurityType.equals("api-key")) {
            return (
                    apiKeyAppName.equals(providerApiKeyAppName) &&
                    apiKeySecret.equals(providerApiKeySecret) &&
                    apiKeyToken.equals(providerApiKeyToken) &&
                    apiKeyAdditional.equals(providerApiKeyAdditional)
                    );
        } else {
            return authHeader.equals(providerBasicAuth);
        }
    }

    public ResponseEntity<ProviderResponseDto> byDto(
            HttpServletRequest headers,
            @Valid ProviderRequestDto providerRequestDto
    ) {
        if (!isAuth(headers)) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        return ResponseEntity.ok().body(mapperResponseProviderDto(providerRequestDto));
    }
}
