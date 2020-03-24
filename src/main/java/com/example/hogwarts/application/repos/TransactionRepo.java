package com.example.hogwarts.application.repos;

import com.example.hogwarts.domain.model.entities.Transaction;
import com.example.hogwarts.domain.model.enums.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
