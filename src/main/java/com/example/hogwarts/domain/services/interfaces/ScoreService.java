package com.example.hogwarts.domain.services.interfaces;

import com.example.hogwarts.domain.model.entities.Transaction;
import com.example.hogwarts.domain.model.valueObjects.Score;

import java.util.List;

public interface ScoreService {
    Score countScore(List<Transaction> transactions);
}
