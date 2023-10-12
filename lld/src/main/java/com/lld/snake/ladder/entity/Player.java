package com.lld.snake.ladder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
public class Player {

    String playerName;

    int position;

    int moves;



    public int rollDice(){
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(7);
            if(rand !=0) break;
        }
        return rand;
    }

    public void move(int steps){
        position+=steps;
        moves++;
    }
}
