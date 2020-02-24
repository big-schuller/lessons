package com.company.lesson1;

public class People extends AModel {
    People(int id, int length, int height){
        super(id, length, height);
    }

    @Override
    public String toString() {
        return "Человек №" + this.getId();
    }
}
