package com.sun.mail;

public class Krug implements Oblik {
    private double r;

    public Krug(double r) {
        this.r = r;
    }

    public double obim() {
        return 2 * Math.PI * r;
    }

    public double povrsina() {
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r>=0){
            this.r = r;
        }else{
            throw new RuntimeException("Broj ne sme biti negativan");
        }
    }

}