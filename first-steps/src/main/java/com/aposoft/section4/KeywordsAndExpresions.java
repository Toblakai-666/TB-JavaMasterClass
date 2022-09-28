package com.aposoft.section4;

public class KeywordsAndExpresions {

    public void doStuff() {

        double kilometers = (100* 1.609344); //expression everything but dataType

        // == whitespace ==
        System.out.println("This is" +
                " another" +
                " still more.");
        System.out.println("A");System.out.println("B");

        // == Code blocks ==
        boolean gameOver = true;
        int score = 4999;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000 but more than 1000!");
        } else if (score < 1000) {
            System.out.println("your score is less than 1000");
        } else {
            System.out.println();
        }

        if (gameOver) {
            calculateScore(gameOver, score,levelCompleted,bonus);
        }

        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);

        displayHighScorePosition("Stando", 1500);
    }

    // == methods ==
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        System.out.println("Method Called");
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }


    // == challenge ==

    public void displayHighScorePosition(String name, int score) {
        System.out.println(name + " achieved position: " + calculateHighScorePosition(score));
    }

    public int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        }
        if (score > 500) {
            return 2;
        }
        if (score > 100) {
            return 3;
        }
        return 4;
    }

    // method overloading
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored "+ score + " points");
        return score *1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored "+ score + " points");
        return score *1000;
    }

    

}
