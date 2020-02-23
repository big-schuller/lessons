package com.company.lesson1;

public class Wall implements ILet {
    private int height = 0;
    private int id = 0;

    Wall(int id, int height){
        this.id = id;
        this.height = height;
    }

    @Override
    public String toString() {
        return "стену №" + this.id;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
