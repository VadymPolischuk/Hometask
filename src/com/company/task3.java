package com.company;

import sun.font.NativeFont;

public class task3 {
    private int Number;
    int getNumber(){
        return Number;
    }
    public void Number(int number)
    {   this.Number = number;
        int c =0;

        if(this.Number > 0)
            System.out.println("Положительное");
        else System.out.println("Отрицательное");
        for (int i = 2; i <= number ; i++) {
            if (number%i == 0)
            {c++;
            }




        }
        if (c>1)
            System.out.println("Не простое");
        else if(c == 1)
            System.out.println("Простое");

        if (this.Number%2 == 0 || this.Number%3 == 0 || this.Number%5 == 0 || this.Number%6 == 0 || this.Number%9 == 0)
            System.out.println("T");

    }


    task3(int _number){
        this.Number = _number;
    }
}
