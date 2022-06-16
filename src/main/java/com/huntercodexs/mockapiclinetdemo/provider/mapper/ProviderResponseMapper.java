package com.huntercodexs.mockapiclinetdemo.provider.mapper;

import com.huntercodexs.mockapiclinetdemo.provider.dto.request.ProviderRequestDto;
import com.huntercodexs.mockapiclinetdemo.provider.dto.response.ProviderResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minidev.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ProviderResponseMapper {

    public static ProviderResponseDto mapperResponseProviderDto(ProviderRequestDto providerRequestDto) {

        Date now = new Date();
        String currentDate = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(now);

        ProviderResponseDto result = new ProviderResponseDto();
        result.setName(providerRequestDto.getName());
        result.setLastname("Vasquez");
        result.setEmail(providerRequestDto.getEmail());
        result.setDocument(providerRequestDto.getDocument());
        result.setAge("45");
        result.setActive("yes");
        result.setCreatedAt("01/01/2020 10:01:00");
        result.setUpdatedAt(currentDate);
        return result;
    }

    public static JSONObject mapperAllProviderDto(List<ProviderRequestDto> users) {

        JSONObject results = new JSONObject();
        int counter = 0;

        for (ProviderRequestDto user : users) {
            counter++;
            results.appendField(Integer.toString(counter), mapperResponseProviderDto(user));
        }

        results.appendField("total", counter);

        return results;
    }

}
