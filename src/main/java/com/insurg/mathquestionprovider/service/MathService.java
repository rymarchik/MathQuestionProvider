package com.insurg.mathquestionprovider.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.insurg.mathquestionprovider.model.Question;

@Service
public class MathService {
    private final Random random = new Random();
    private final int MAX = 10;

    public Question getRandom() {
        int a = random.nextInt(MAX);
        int b = random.nextInt(MAX);
        return Question.builder()
            .question("%d + %d = ?".formatted(a, b))
            .answer(String.valueOf(a + b))
            .build();
    }
}
