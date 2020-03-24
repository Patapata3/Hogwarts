package com.example.hogwarts.application.services.interfaces;

import com.example.hogwarts.domain.model.entities.Transaction;
import com.example.hogwarts.domain.model.enums.House;
import com.example.hogwarts.domain.model.valueObjects.Score;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    void save(Transaction transaction);
    Optional<Transaction> getById(Long id);
    Score getScore();
    boolean isValid(Transaction transaction);
}
