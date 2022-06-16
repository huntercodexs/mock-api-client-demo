package com.huntercodexs.mockapiclinetdemo.mock.dto.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MockResponseDto {

    String name;
    String lastname;
    String email;
    String document;
    String age;
    String active;
    String createdAt;
    String updatedAt;

}
