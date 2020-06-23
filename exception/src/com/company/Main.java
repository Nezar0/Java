package com.company;

import java.util.Scanner;
public class Main {
    private static boolean lock;
    public static void Password(){
        System.out.println("введите пароль ");
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        switch (pass) {
            case 0000:
                lock = true;
                break;
            default:
                lock = false;
                System.out.println("неверный пароль");
                break;
        }
    }

    public static void main(String[] args) throws MyException {
        int size = 10;
        ILocker lc = new MyLocker();
        lc.set(size);
        lc.get();
        System.out.println("хотите изменить размер ящика? 1-да 2-нет");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        if (b==1)
        {
            Password();
            try
            {
                lc.lock(lock);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (b==2)
        {
            System.out.println("ok");
            lc.lock(false);
        }
        lc.get();
    }
}

