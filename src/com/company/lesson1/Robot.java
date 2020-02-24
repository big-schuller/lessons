package com.company.lesson1;

public class Robot extends AModel {
    Robot(int id, int length, int height){
        super(id, length, height);
    }

    @Override
    public String toString() {
        return "Робот №" + this.getId();
    }
}
