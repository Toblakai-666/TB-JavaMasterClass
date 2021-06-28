package com.aposoft.section3;

public class Challenge {


    public void doStuff() {

        double firstDouble = 20d;
        double secondDouble = 80d;
        double sum = (firstDouble + secondDouble) * 100;
        double remainder = sum % 40;
        System.out.println(remainder);
        boolean myBoolean = remainder == 0 ? true : false;
        System.out.println(myBoolean);
        if (!myBoolean) {
            System.out.println("Got some reminder");
        }

    }
}
