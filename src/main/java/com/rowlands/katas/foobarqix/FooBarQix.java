package com.rowlands.katas.foobarqix;

public class FooBarQix {

    public String calculcateResponse(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(appendFooBarQixIfDivisibleByThreeFiveZero(number));

        stringBuilder.append(appendFooBarQixStarIfContainsThreeFiveSevenZero(number));

        if(stringBuilder.toString().equals("")) {
            return String.valueOf(number);
        }
        else {
            return stringBuilder.toString();
        }
    }

    private String appendFooBarQixStarIfContainsThreeFiveSevenZero(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        String numberAsString =  String.valueOf(number);

        for (int i = 0; i < numberAsString.length(); i++) {
            Character ch = numberAsString.charAt(i);

            if(ch.equals('3')) {
                stringBuilder.append("Foo");
            }
            if(ch.equals('5')) {
                stringBuilder.append("Bar");
            }
            if(ch.equals('7')) {
                stringBuilder.append("Qix");
            }
            if(ch.equals('0')) {
                stringBuilder.append("*");
            }
        }
        return stringBuilder.toString();
    }

    private String appendFooBarQixIfDivisibleByThreeFiveZero(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if(number % 3 == 0) {
            stringBuilder.append("Foo");
        }
        if(number % 5 == 0) {
            stringBuilder.append("Bar");
        }
        if(number % 7 == 0) {
            stringBuilder.append("Qix");
        }

        return stringBuilder.toString();
    }
}
