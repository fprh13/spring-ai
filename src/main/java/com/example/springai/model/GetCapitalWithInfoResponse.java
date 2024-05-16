package com.example.springai.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfoResponse(@JsonPropertyDescription("수도의 이름") String city,
                                         @JsonPropertyDescription("수도의 인구") Integer population,
                                         @JsonPropertyDescription("수도의 위치") String region,
                                         @JsonPropertyDescription("수도의 언어") String language,
                                         @JsonPropertyDescription("수도의 통화") String currency) {
}
