package com.example.springai.service;


import com.example.springai.model.Answer;
import com.example.springai.model.GetCapitalRequest;
import com.example.springai.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
