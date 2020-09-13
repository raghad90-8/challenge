/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of player");
        int numofp = scan.nextInt();

        Player[] player = new Player[numofp];
        Checker checker = new Checker();
         System.out.println("enter name and score of player with a space between them");
        for (int i = 0; i < numofp; i++) {
           
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        System.out.println("player after sorting");
        for (Player player1 : player) {
            System.out.printf("%s %s\n", player1.name, player1.score);
        }
    }
}


class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        } else {
            return p2.score - p1.score; // descending order
        }
    }
}
    
 class Player {
    String name;
    int score;
    
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}   

