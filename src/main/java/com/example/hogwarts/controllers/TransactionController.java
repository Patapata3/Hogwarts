package com.example.hogwarts.controllers;

import com.example.hogwarts.application.services.interfaces.TransactionService;
import com.example.hogwarts.domain.model.entities.Transaction;
import com.example.hogwarts.domain.model.valueObjects.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/score")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/add")
    public ResponseEntity addTransaction(Transaction transaction){
        if (!transactionService.isValid(transaction))
            return new ResponseEntity<String>("You don't have rights for making this transaction", HttpStatus.UNAUTHORIZED);
        transactionService.save(transaction);
        return ResponseEntity.ok("");
    }

    @GetMapping("/get")
    public ResponseEntity getScore() {
        return ResponseEntity.ok(transactionService.getScore());
    }
}
