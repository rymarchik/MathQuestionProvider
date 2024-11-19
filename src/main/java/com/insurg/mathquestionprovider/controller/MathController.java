package com.insurg.mathquestionprovider.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurg.mathquestionprovider.model.Question;
import com.insurg.mathquestionprovider.service.MathService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MathController {

    private final MathService mathService;

    @GetMapping("/question")
    public List<Question> getRandomQuestions(@RequestParam int amount) {
        List<Question> questions = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            questions.add(mathService.getRandom());
        }
        return questions;
    }
}
