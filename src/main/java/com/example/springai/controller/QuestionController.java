package com.example.springai.controller;

import com.example.springai.model.*;
import com.example.springai.service.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    /**
     * 나라 정보
     */
    @PostMapping("/capital-with-info")
    public GetCapitalWithInfoResponse getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapitalWithInfo(getCapitalRequest);
    }

    /**
     * 나라의 수도 질문
     */
    @PostMapping("/capital")
    public GetCapitalResponse getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapital(getCapitalRequest);
    }

    /**
     * Chat GPT 질문 응답
     */
    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
