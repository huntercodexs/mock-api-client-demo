package com.huntercodexs.mockapiclinetdemo.mock.client;

import com.huntercodexs.mockapiclinetdemo.mock.dto.request.MockRequestDto;
import com.huntercodexs.mockapiclinetdemo.mock.dto.response.MockResponseDto;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MockClient {

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

    @Value("${provider.base-uri.by-dto}")
    String urlByDto;

    private final RestTemplate restTemplate = new RestTemplate();

    protected HttpHeaders httpRequestHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", providerBasicAuth);
        httpHeaders.set("Api-Key-App-Name", providerApiKeyAppName);
        httpHeaders.set("Api-Key-Secret", providerApiKeySecret);
        httpHeaders.set("Api-Key-Token", providerApiKeyToken);
        httpHeaders.set("Api-Key-Additional", providerApiKeyAdditional);
        return httpHeaders;
    }

    protected HttpComponentsClientHttpRequestFactory httpClientFactory() {
        HttpClient httpClient = HttpClientBuilder.create().build();
        return new HttpComponentsClientHttpRequestFactory(httpClient);
    }

    public ResponseEntity<MockResponseDto> findUserByDto(MockRequestDto mockRequestDto) {
        HttpEntity<MockRequestDto> httpEntity = new HttpEntity<>(mockRequestDto, httpRequestHeaders());
        try {
            return restTemplate.postForEntity(this.urlByDto, httpEntity, MockResponseDto.class);
        } catch (RuntimeException re) {
            throw new RuntimeException("Error on trying read user: " + re.getMessage());
        }
    }

}
