package com.aposoft.section3;

public class Operators {

    public void doStuff() {
        int result = 1 + 2;
        System.out.println("Result = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " +result);
        System.out.println("Previous result = " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //remainder of (4 / 3 = 1)
        System.out.println("Modulo 4 % 3 = " + result);

        // == Abbreviating Operators ==
        result++;
        System.out.println("1++ = " + result);
        result--;
        System.out.println("2-- = " + result);

        //result + 2 - (-=, *=, /=)
        result += 2;
        System.out.println("result+=2: " + result);

        // == if-then ==
        System.out.println("==If-Then==\n");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien");
        }
        int topScore = 80;
        if  (topScore == 100) {
            System.out.println("You got the high score!");
        }
        int secondScore = 60;
        if (topScore > secondScore && topScore < 100) {
            System.out.println("Greaten than second top score and less than 100");
        }

        // == and & or ==
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (true || false));

        boolean isCar = false;

        boolean wasCar = isCar? true : false;
    }
}
