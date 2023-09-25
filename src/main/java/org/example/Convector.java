package org.example;

public class Convector {

    public int convertTimeIntoSeconds(int hour){
        if (hour==0) {
            throw  new IllegalArgumentException();
        }
        return hour*3600;
    }

    public int sumDigitsInNumber(int number) {
        if (number==0) {
            throw  new IllegalArgumentException();
        }

        number = (number / 100) + (number / 10 % 10) + (number % 10);
        return number;

    }

    public String massIndex(double weight, double height) {
        double res = weight/(height*height);

        if (res<18.5){
            return "light";
        }

        else if (res>=18.5 && res<=24.9){
           return "normal";
        }

        else if (res>=25 && res<=29.9 ){
            return "fet";
        }
           return "to fet";
    }
}
