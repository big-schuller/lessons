package com.company.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<ILet> lets = new ArrayList<ILet>(Arrays.asList(
                new Wall(1, 4),
                new Wall(2, 15),
                new Treadmill(1, 5),
                new Treadmill(2, 15),
                new Wall(3, 6)));

        List<IModel> participants = new ArrayList<IModel>(Arrays.asList(
                new Cat(1, 10, 30),
                new Cat(2, 4, 12),
                new People(1, 30, 50),
                new Cat(3, 1, 1),
                new Robot(1, 25, 25),
                new People(2, 40, 40),
                new Robot(2, 400, 8),
                new Robot(3, 4000, 8000)));

        participants.forEach(participant -> {
            lets.forEach(let -> {
                if(participant.isStop()) return;
                participant.jump(let);
                participant.toRun(let);
            });
            if(!participant.isStop()){
                System.out.println(participant + " прошел полосу препятствий!!!");
            }
        });
    }
}
