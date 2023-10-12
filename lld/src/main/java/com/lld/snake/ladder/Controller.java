package com.lld.snake.ladder;

import com.lld.snake.ladder.entity.Board;
import com.lld.snake.ladder.entity.Player;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Controller {
//class->
    //1.Board (Snake_positions,ladder_positions,player_positions,size)
    //2.Snake (int head,int tail)
    //3. Ladder (int start, int end)
    //4. Player (name,position, moves)->(roll dice, moves)
      List<Player> players=new ArrayList<>();
      Board board;


     public void playGame(){

        initializeData();

//         while (true){
//             for (Player player:players) {
//                 System.out.println(player.getPlayerName()+" Chance");
//
//                 int roll=player.rollDice();
//                 System.out.println(player.getPlayerName()+" Rolled "+roll);
//                 board.movePlayers(player,roll);
//                 if(board.winner(player))
//                 {
//                     System.out.println(player.getPlayerName()+" Won");
//                    return;
//                 }
//             }
//
//         }
    }

    private  void initializeData() {
//        Player player1=new Player("Arti",0,0);
//        Player player2=new Player("Vaibhav",0,0);
//
//        this.players.add(player1);
//        this.players.add(player2);
        this.board=new Board(100);
        Map<Integer,Integer> ladder=new HashMap<>();
        ladder.put(4,44);
        ladder.put(14,24);
        ladder.put(34,44);
        ladder.put(45,46);
        ladder.put(47,44);
        ladder.put(8,48);
        ladder.put(33,44);
        ladder.put(12,58);
        ladder.put(34,94);
        this.board.setLadder(ladder);

        Map<Integer,Integer> snake=new HashMap<>();
        snake.put(45,10);
        snake.put(88,48);
        snake.put(92,58);
        snake.put(54,24);
        this.board.setSnake(snake);


    }



}
