package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элиментов");
        int cout = in.nextInt();
        Stored stored = new Stored(cout);
        Stored.Min();
        Stored.Max();
        Stored.Avg();
        System.out.println("Геометричес: " + Stored.Gvg());
        System.out.print("Медиана: " + Stored.Median());
    }
}
