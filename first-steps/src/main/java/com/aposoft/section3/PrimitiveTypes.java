package com.aposoft.section3;

public class PrimitiveTypes {

    public void doStuff() {

        // == byte ==
        System.out.println("Byte min: " + Byte.MIN_VALUE);
        System.out.println("Byte max: " + Byte.MAX_VALUE);

        // == short ==
        System.out.println("Short min: " + Short.MIN_VALUE);
        System.out.println("Short max: " + Short.MAX_VALUE);

        // == int ==
        System.out.println("Integer min: " + Integer.MIN_VALUE);
        System.out.println("Integer max: " + Integer.MAX_VALUE);

        // == long ==
        System.out.println("Long min: " + Long.MIN_VALUE);
        System.out.println("Long max: " + Long.MAX_VALUE);

        // == overflow & underflow ==
        System.out.println("Busted Integer Max Value = " + (Integer.MAX_VALUE + 1));
        System.out.println("Busted Integer Min Value = " + (Integer.MIN_VALUE - 1));

        // == casting ==
        int prettySmallInt = 200;
        byte myByteValue = (byte)(prettySmallInt / 2);
        System.out.println(myByteValue);

        // == CHALLENGE ==
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000 + 10 * (myByte + myShort + myInt);
        System.out.println(myLong);

        System.out.println(" === FLOAT & DOUBLE ===\n");

        float myFloat = 5f;
        double myDouble = 10d;

        System.out.println("Float min: " + Float.MIN_VALUE);
        System.out.println("Float max: " + Float.MAX_VALUE);

        System.out.println("Double min: " + Double.MIN_VALUE);
        System.out.println("Double max: " + Double.MAX_VALUE);

        System.out.println("Int value: " + myInt);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);

        System.out.println("Int = " + 5 / 3);
        System.out.println("Float = " + 5f / 3f);
        System.out.println("Double = " + 5d / 3d);

        // == Challenge! ==
        double pounds = 120;
        System.out.println(pounds + " pounds is " + pounds * 0.45359237 + " kg\n");

        // == char & boolean ==
        System.out.println("=== char & boolean ===\n");

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("My char: " + myChar);
        System.out.println("My unicodeChar: " + myUnicodeChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        // == String ==
        System.out.println("=== String ===\n");
        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49,95";
        System.out.println(numberString);
        String lastString = "10";
        int myLastInt = 5;
        System.out.println(lastString + myLastInt);
    }
}
