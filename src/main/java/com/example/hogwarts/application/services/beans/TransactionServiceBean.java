package com.example.hogwarts.application.services.beans;

import com.example.hogwarts.application.repos.TransactionRepo;
import com.example.hogwarts.application.services.interfaces.TransactionService;
import com.example.hogwarts.domain.model.entities.Transaction;
import com.example.hogwarts.domain.model.enums.House;
import com.example.hogwarts.domain.model.enums.Role;
import com.example.hogwarts.domain.model.valueObjects.Score;
import com.example.hogwarts.domain.services.interfaces.ScoreService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceBean implements TransactionService {
    @Autowired
    TransactionRepo transactionRepo;
    @Autowired
    ScoreService scoreService;

    @Override
    public void save(Transaction transaction) {
        transactionRepo.saveAndFlush(transaction);
    }

    @Override
    public Optional<Transaction> getById(Long id) {
        return transactionRepo.findById(id);
    }

    @Override
    public Score getScore() {
        return scoreService.countScore(transactionRepo.findAll());
    }

    public boolean isValid(Transaction transaction) {
        switch(transaction.getAuthor().getRole()) {
            case TUTOR: return transaction.getRecipient().getRole() != Role.TUTOR;
            case STUDENT: return false;
            case PREFECT: return transaction.getPoints() <= 0 && transaction.getRecipient().getRole() == Role.STUDENT;
        }
        return false;
    }
}
