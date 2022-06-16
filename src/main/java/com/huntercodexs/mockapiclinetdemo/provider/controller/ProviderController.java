package com.huntercodexs.mockapiclinetdemo.provider.controller;

import com.huntercodexs.mockapiclinetdemo.provider.dto.request.ProviderRequestDto;
import com.huntercodexs.mockapiclinetdemo.provider.dto.response.ProviderResponseDto;
import com.huntercodexs.mockapiclinetdemo.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@ControllerAdvice
@RestController
@RequestMapping("${provider.api.prefix}")
@CrossOrigin(origins = "*")
public class ProviderController {

    @Autowired
    ProviderService providerService;

    /**
     * Read User by DTO (using body details): [POST] /huntercodexs/provider/api/v1/by-dto {BODY}
     */
    @PostMapping(path = "/by-dto")
    public ResponseEntity<ProviderResponseDto> providerByDto(
            HttpServletRequest headers,
            @Valid @RequestBody(required = true) ProviderRequestDto providerRequestDto
    ) {
        return providerService.byDto(headers, providerRequestDto);
    }
}
