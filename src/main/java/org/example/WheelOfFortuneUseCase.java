package org.example;

import java.util.Scanner;

import static org.example.Color.BLACK;
import static org.example.Color.RED;

public class WheelOfFortuneUseCase {
    public static void startGame(){

        Player player = new Player();
        WheelOfFortune wheel = new WheelOfFortune();

        System.out.println("Welcome to Jonathans Casino");
        System.out.println("Enter player name:");

        Scanner scanner = new Scanner(System.in);
        player.setName(scanner.nextLine());

        System.out.println("Hi " + player.getName());
        while (player.getBalance() != 0){
            System.out.println("Please make a bet. RED or BLACK?");
            player.setBetType(null);
            while (player.getBetType() == null) {
                String input = scanner.nextLine().trim().toUpperCase();
                try {
                    player.setBetType(Color.valueOf(input));
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid bet. Please choose RED or BLACK.");
                }
            }

            System.out.println("How much do you want to bet?");
            player.setBetSize(scanner.nextInt());
            String bet = scanner.nextLine();

            if (wheel.spin() == player.getBetType()){
                System.out.println("You won!" + player.getBetSize() * 2);
                player.won(player.getBetSize() * 2);
                System.out.println("You have balance " + player.getBalance());
            }else {
                System.out.println("You lost! " + player.getBetSize());
                player.lost(player.getBetSize());
                System.out.println("You have balance " + player.getBalance());
            }
        }
    }
}
