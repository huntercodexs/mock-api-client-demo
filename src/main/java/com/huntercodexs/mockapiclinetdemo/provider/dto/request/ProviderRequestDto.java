package com.huntercodexs.mockapiclinetdemo.provider.dto.request;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProviderRequestDto {

    String name;
    String email;
    String document;

}
