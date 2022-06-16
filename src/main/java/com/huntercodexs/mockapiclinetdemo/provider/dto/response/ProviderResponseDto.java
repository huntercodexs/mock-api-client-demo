package com.huntercodexs.mockapiclinetdemo.provider.dto.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProviderResponseDto {

    String name;
    String lastname;
    String email;
    String document;
    String age;
    String active;
    String createdAt;
    String updatedAt;

}
