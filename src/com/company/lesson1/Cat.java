package com.company.lesson1;

public class Cat extends AModel {
    Cat(int id, int length, int height){
        super(id, length, height);
    }

    @Override
    public String toString() {
        return "Кот №" + this.getId();
    }
}
