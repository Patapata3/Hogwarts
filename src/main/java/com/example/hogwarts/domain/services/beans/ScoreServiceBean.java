package com.example.hogwarts.domain.services.beans;

import com.example.hogwarts.domain.model.entities.Transaction;
import com.example.hogwarts.domain.model.valueObjects.Score;
import com.example.hogwarts.domain.services.interfaces.ScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceBean implements ScoreService {
    @Override
    public Score countScore(List<Transaction> transactions) {
        int gryffindorScore = 0;
        int hufflepuffScore = 0;
        int ravenclawScore = 0;
        int slytherinScore = 0;

        for(Transaction transaction : transactions) {
            switch(transaction.getRecipient().getHouse()) {
                case GRYFFINDOR: {
                    gryffindorScore += transaction.getPoints();
                    continue;
                }
                case HUFFLEPUFF: {
                    hufflepuffScore += transaction.getPoints();
                    continue;
                }
                case RAVENCLAW: {
                    ravenclawScore += transaction.getPoints();
                    continue;
                }
                case SLYTHERIN: slytherinScore += transaction.getPoints();
            }
        }
        return new Score(gryffindorScore, hufflepuffScore, ravenclawScore, slytherinScore);
    }
}
