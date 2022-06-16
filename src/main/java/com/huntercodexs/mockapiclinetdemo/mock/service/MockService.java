package com.huntercodexs.mockapiclinetdemo.mock.service;

import com.huntercodexs.mockapiclinetdemo.mock.client.MockClient;
import com.huntercodexs.mockapiclinetdemo.mock.dto.request.MockRequestDto;
import com.huntercodexs.mockapiclinetdemo.mock.dto.response.MockResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MockService {

    @Autowired
    MockClient mockClient;

    public ResponseEntity<String> byName(String username) {
        return ResponseEntity.ok().body("Username is Tester");
    }

    public ResponseEntity<String> byEmail(String mail) {
        return ResponseEntity.ok().body("Email is email@tester.com");
    }

    public ResponseEntity<String> byDocument(String document) {
        return ResponseEntity.ok().body("Document is 1234567890000-1");
    }

    public ResponseEntity<MockResponseDto> byDto(MockRequestDto mockRequestDto) {
        return mockClient.findUserByDto(mockRequestDto);
    }
}
