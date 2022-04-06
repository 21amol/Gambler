package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        // welcome to gambling problem.

        int stake = 100;
        int bet = 1;

        int result;
        result = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println("result: " +result);
        if (result == 0)
            System.out.println("Loss");
        else
            System.out.println("Win");
    }
}