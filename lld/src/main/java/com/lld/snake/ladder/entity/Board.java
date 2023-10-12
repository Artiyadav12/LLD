package com.lld.snake.ladder.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Board {

    int size;
    Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer,Integer> ladder = new HashMap<>();





    public Board(int size) {
        this.size = size;
    }

    public void movePlayers(Player player, int steps){

        int newPos= player.getPosition()+steps;

        if(newPos>size)
            return;




            if (snake.containsKey(newPos)) {
                System.out.println(player.getPlayerName()+" Snake bike");
                newPos = snake.get(newPos);
            }


            if(ladder.containsKey(newPos)){
                System.out.println(player.getPlayerName()+" ladder ");
                newPos=ladder.get(newPos);
            }

        System.out.println(player.getPlayerName()+" position "+newPos);
        player.setPosition(newPos);
    }

    public Boolean winner(Player player) {
        if (player.getPosition() == size)
            return true;
        return false;
    }

}
