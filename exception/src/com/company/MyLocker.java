package com.company;

import java.util.Scanner;

public class MyLocker implements ILocker{
public int val;
    @Override
    public Void set(int value) {
        val =value;
        return null;
    }

    @Override
    public int get() {
        System.out.println("размер ящика "+val);
        return 0;
    }

    @Override
    public boolean lock(boolean lock) throws MyException {
        if (lock==false)
        {
            throw new MyException("нельзя");
        }
        else
        {
            unlock();
        }
        return false;
    }

    @Override
    public Void unlock() {
        System.out.println("новый размер ящика");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        set(a);
        return null;
    }
}
