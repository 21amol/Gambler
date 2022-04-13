package com.bridgelabz;

public class Main {

    static int stake = 100;
    static int bet = 1;
    static int result;
    static int winCount = 0;
    static int loseCount = 0;


    public static void winLose() {
        int wonAmtAfter20Days = 0;
        int lossAmtAfter20Days = 0;
        int[] totalLossAmount = new int[20];
        int[] totalWinAmount = new int[20];
        int[] profitLoss = new int[20];
        int min = 0;
        int max = 0;
        int max_index = 0;
        int min_index = 0;
        //   int[] loss = new int[20];

        for (int i = 0; i < 20; i++) {                                            // calculating for 20 days.
            System.out.println("\nDay: " + (i + 1));
            int winAmount = 0;
            int loseAmount = 0;

            while (winAmount != (stake / 2) || loseAmount != (stake / 2)) {       // Calculating for single day
                result = (int) Math.floor(Math.random() * 10) % 2;
                //     System.out.println("result: " + result);

                if (result == 0) {
                    //     System.out.println("Win");
                    winAmount++;
                } else {
                    //    System.out.println("Loss");
                    loseAmount++;
                }
// Resigning for day.....

                if (winAmount == stake / 2) {
                    System.out.println("Win Stake reached 50%. So, Gambler wil resign for the day.");
                    winCount++;
                    break;

                } else if (loseAmount == stake / 2) {
                    System.out.println("Lose Stake reached 50%. So, Gambler will resign for the day");
                    loseCount++;
                    break;
                }
            }
            //    System.out.println("Won amount: " + winAmount);
            //    System.out.println("Loss amount: " + loseAmount);
            totalLossAmount[i] = loseAmount;
            totalWinAmount[i] = winAmount;
        }


        for (int j = 0; j < 20; j++) {
            System.out.println("\nDay: " + (j + 1) + " won amount: " + totalWinAmount[j]);
            System.out.println("Day: " + (j + 1) + " loss amount: " + totalLossAmount[j]);
            wonAmtAfter20Days = wonAmtAfter20Days + totalWinAmount[j];
            lossAmtAfter20Days = lossAmtAfter20Days + totalLossAmount[j];

            profitLoss[j] = totalWinAmount[j] - totalLossAmount[j];
            //    loss[j] = totalLossAmount[j] - totalWinAmount[j];

            if (profitLoss[j] > 0) {
                System.out.println("Day: " + (j + 1) + "--> profit of Rs " + (profitLoss[j]));

            } else {
                System.out.println("Day: " + (j + 1) + "--> loss of Rs " + (profitLoss[j]) * -1);
            }
        }

        // for luckiest and unluckiest day...........

        for (int i = 0; i < profitLoss.length; i++) {
            if (profitLoss[i] > max) {
                max = profitLoss[i];
                max_index = i;
            }
        }

        for (int i = 0; i < profitLoss.length; i++) {
            if (profitLoss[i] < min) {
                min = profitLoss[i];
                min_index = i;
            }
        }

        System.out.println("\nTotal won amount after 20 days is Rs " + wonAmtAfter20Days);
        System.out.println("Total loss amount after 20 days is Rs " + lossAmtAfter20Days);

        if ((wonAmtAfter20Days - lossAmtAfter20Days) > 0) {
            System.out.println("Gambler won Rs " + (wonAmtAfter20Days - lossAmtAfter20Days) + " after 20 days\n");
        } else if ((wonAmtAfter20Days - lossAmtAfter20Days) < 0) {
            System.out.println("Gambler lost Rs " + (lossAmtAfter20Days - wonAmtAfter20Days) + " after 20 days\n");
        } else {
            System.out.println("No loss, No profit\n");
        }
        System.out.println("Total won days in a month: " + winCount);
        System.out.println("Total lost day in a month: " + loseCount);
        System.out.println("\nLuckiest Day is: " + (max_index + 1));
        System.out.println("Unluckiest Day is: " + (min_index + 1));

    }


    public static void main(String[] args) {
        // welcome to gambling problem.
        winLose();

    }
}