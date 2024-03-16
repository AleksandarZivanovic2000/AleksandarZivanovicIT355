package com.sun.mail;


public class Kvadrat implements Oblik {
    private double a;

    public Kvadrat(double a) {
        this.a = a;
    }

    public double obim() {
        return 4 * a;
    }

    public double povrsina() {
        return a * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a>=0){
            this.a = a;
        }else{
            throw new IllegalArgumentException("Broj ne sme biti negativan");
        }
    }

}