package com.company;

import static java.lang.Thread.sleep;

public class Main
{

    public static void main(String[] args) throws InterruptedException {

        Enemy mAnotherCar = new Enemy();

        System.out.println("Гонка начата...");
        mAnotherCar.start();
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}


            System.out.println("Я обогнал!");
        }



        if(mAnotherCar.isAlive())
        {
            mAnotherCar.join();
            System.out.println("Ты проиграл!");
        }
        else
        {
            System.out.println("Ты выйграл!");
        }
        System.out.println("Гонка окончена!");
    }
}