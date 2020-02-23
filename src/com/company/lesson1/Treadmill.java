package com.company.lesson1;

public class Treadmill implements ILet {
    private int length = 0;
    private int id = 0;

    Treadmill(int id, int length){
        this.id = id;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Беговая дорожка №" + this.id;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getLength() {
        return this.length;
    }
}
