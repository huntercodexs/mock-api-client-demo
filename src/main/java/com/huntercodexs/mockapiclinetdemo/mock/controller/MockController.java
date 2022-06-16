package com.huntercodexs.mockapiclinetdemo.mock.controller;

import com.huntercodexs.mockapiclinetdemo.mock.dto.request.MockRequestDto;
import com.huntercodexs.mockapiclinetdemo.mock.dto.response.MockResponseDto;
import com.huntercodexs.mockapiclinetdemo.mock.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@ControllerAdvice
@RestController
@RequestMapping("${mock.api.prefix}")
@CrossOrigin(origins = "*")
public class MockController {

    @Autowired
    MockService mockService;

    /**
     * Welcome: [GET] /huntercodexs/mock/api/v1/welcome
     */
    @GetMapping(path = "/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok().body("Welcome to Mock");
    }

    /**
     * Read User by name: [GET] /huntercodexs/mock/api/v1/users/by-name/{username}
     */
    @GetMapping(path = "/users/by-name/{username}")
    public ResponseEntity<String> byName(@PathVariable("username") String username) {
        return mockService.byName(username);
    }

    /**
     * Read User by email: [GET] /huntercodexs/mock/api/v1/users/by-mail/{mail}
     */
    @GetMapping(path = "/users/by-mail/{mail}")
    public ResponseEntity<String> byEmail(@PathVariable("mail") String mail) {
        return mockService.byEmail(mail);
    }

    /**
     * Read User by document: [GET] /huntercodexs/mock/api/v1/users/by-document/{document}
     */
    @GetMapping(path = "/users/by-doc/{document}")
    public ResponseEntity<String> byDocument(@PathVariable("document") String document) {
        return mockService.byDocument(document);
    }

    /**
     * Read User by DTO (using body details): [POST] /huntercodexs/mock/api/v1/users/by-dto {BODY}
     */
    @PostMapping(path = "/users/by-dto")
    public ResponseEntity<MockResponseDto> byDto(@Valid @RequestBody(required = true) MockRequestDto mockRequestDto) {
        return mockService.byDto(mockRequestDto);
    }
}
