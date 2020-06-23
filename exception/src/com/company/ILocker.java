package com.company;

public interface ILocker {
    Void set( int value);
    int get();
    boolean lock(boolean lock) throws MyException;
    Void unlock();

}
