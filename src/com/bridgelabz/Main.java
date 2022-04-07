package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        // welcome to gambling problem.

        int stake = 100;
        int bet = 1;

        int winAmount = 0;
        int loseAmount = 0;
        int result;

        while (true) {
            result = (int) Math.floor(Math.random() * 10) % 2;
            //     System.out.println("result: " + result);

            if (result == 0) {
                //        System.out.println("Loss");
                winAmount++;

            } else {
                //        System.out.println("Win");
                loseAmount--;
            }

            if (winAmount == stake / 2) {
                System.out.println("Win Stake reached 50%. So, Gambler wil resign for the day.");
                break;
            } else if (loseAmount == stake / 2) {
                System.out.println("Lose Stake reached 50%. So, Gambler will resign for the day");
                break;
            }
        }
    }
}