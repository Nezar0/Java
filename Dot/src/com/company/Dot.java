package com.company;

public class Dot implements Proc {
    private double x;
    private double y;
    private double z;

    public Dot(double a,double b, double c){
        x = a;
        y = b;
        z = c;
    }
    public Dot(double a, double b) {
        x = a;
        y = b;
    }

    public void lenght(Dot other){
        System.out.print("Длина: ");
        System.out.println(Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y-this.y,2)+Math.pow(other.z-this.z,2)));
    }
}
