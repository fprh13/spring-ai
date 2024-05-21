package com.example.springai.openai.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalResponse(@JsonPropertyDescription("수도의 이름") String answer) {
}
