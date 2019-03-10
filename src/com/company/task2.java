package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class task2 {
    private int Value;


    int getValue() {
        return Value;
    }

    public void setValue(int Value,int swt) {
        Scanner scanner = new Scanner(System.in);
        switch (swt) {
            case 1: {
                System.out.println("Гривны - Доллары" + "\n" + "Введите значение в Гривнах");
                Value *= 0.038;
                break;
            }
            case 2: {
                System.out.println("Доллары гривны" + "\n" + "Введите значение в Долларах");
                Value *= 26.33;
                break;
            }
        }
        this.Value = Value;
    }

    task2(int _value) {
        this.Value = _value;

    }

}
