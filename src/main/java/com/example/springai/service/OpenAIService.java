package com.example.springai.service;


import com.example.springai.model.*;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);

    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
