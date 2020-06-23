package com.company;

import java.util.Arrays;

public class Stored {
    private static int[]Mas;

    public Stored(int length) {
        Mas = new int[length];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = ((int) (Math.random() * 10) + 1);
            System.out.print(" " + Mas[i] + " ");
        }
        System.out.println(" ");
        Arrays.sort(Mas);
        for (int i = 0; i < Mas.length; i++) {
            System.out.print(" " + Mas[i] + " ");
        }
        System.out.println(" ");
    }
    public static void Min(){
        int buf = Integer.MAX_VALUE;
        for (int i = 0; i < Mas.length; i++) {
            buf = Math.min(buf, Mas[i]);
        }
        System.out.println("Минимум " + buf);
    }
    public static void Max(){
        int buf = Integer.MIN_VALUE;
        for (int i = 0; i < Mas.length; i++) {
            buf = Math.max(buf, Mas[i]);
        }
        System.out.println("Максимум " + buf);
    }
    public static void Avg(){
        double sum = 0;
        for (int x: Mas) {
            sum += x;
        }
        System.out.println("среднее арифметическое чисел равно: " + sum/Mas.length);
    }
    public static float Median(){
        Arrays.sort(Mas);
        if(Mas.length % 2 == 0){
            return (Mas[Mas.length / 2]  + Mas[(Mas.length / 2) - 1]);
        }
        return (Mas[Mas.length / 2]);
    }
    public static double Gvg(){
        double buf = 1f;
        for (int i = 0; i < Mas.length; i++) {
            buf *= (double) Mas[i];
        }
        return (Math.pow(buf, 1d/Mas.length));
    }
}

