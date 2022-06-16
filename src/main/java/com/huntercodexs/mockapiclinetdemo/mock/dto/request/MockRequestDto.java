package com.huntercodexs.mockapiclinetdemo.mock.dto.request;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MockRequestDto {

    String name;
    String email;
    String document;

}
