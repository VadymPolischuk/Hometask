package com.company;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Currency;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        task1();
        //task22();
        //task3();
        //task4();


    }

    private static void task4() {
        Random random = new Random();
        sort a[] = new sort[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new sort(random.nextInt(50));
        }
        System.out.println(Arrays.toString(a));
    }


    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        task3 number = new task3(1);
        while (number.getNumber() != 0) {
            System.out.println("Введите число");
            number.Number(scanner.nextInt());
            System.out.println("Для выхода введите 0");

        }

    }

    private static void task22() {
        Scanner scanner = new Scanner(System.in);
        task2 value = new task2(0);
        int a = 1;

        while (a > 0) {

            System.out.println("Введите сумму: (сумма,валюта) 1: Гривна - Доллар 2:Доллар - Гривна");
            value.setValue(scanner.nextInt(), scanner.nextInt());
            System.out.println(value.getValue());
            System.out.println("Для выхода введите 0");
            a = scanner.nextInt();

        }
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        int credit = 0;
        Credit user = new Credit("Noname", 0, 0);
        System.out.println(user.getCredit());
        System.out.println(user.getUser());
        System.out.println(user.getCreditStatus());
        while (user.getCredit() < 700) {
            user.setCredit(credit = scanner.nextInt());
            if (user.getCreditStatus() < 700) {
                System.out.println("Кредит не погашен");
                System.out.println("До погашения кредита нужно внести:" + (700 - user.getCreditStatus()));
            } else if (user.getCreditStatus() > 700)
                System.out.println("Кредит переплачен на: " + (user.getCreditStatus() - 700));
            System.out.println(user.getCreditStatus());

        }

    }
}