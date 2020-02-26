package com.company.lesson2;

import com.company.lesson2.Exceptions.MyArrayDataException;
import com.company.lesson2.Exceptions.MyArraySizeException;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        String[][] inputCorrect = {
            {"1", "3", "4", "8"},
            {"12", "4", "33", "21"},
            {"155", "2", "3", "-5"},
            {"23", "-4", "-10", "-190"}
        };

        String[][] inputUnCorrect = {
                {"1", "3", "4", "8"},
                {"12", "4", "sdsd", "21"},
                {"sadasd", "2", "3", "-5"},
                {"23", "-4", "-10", "-190"}
        };

        String[][] inputUnCorrect2 = {
                {"1", "3", "4", "8", "123"},
                {"12", "4", "sdsd", "21", "123"},
                {"sadasd", "2", "3", "-5", "123"},
                {"23", "-4", "-10", "-190", "123"}
        };

        List<String[][]> inputs = new LinkedList<String[][]>();
        inputs.add(inputCorrect);
        inputs.add(inputUnCorrect);
        inputs.add(inputUnCorrect2);

        inputs.forEach(item  -> {
            System.out.println("Начало обработки водной массив " + Arrays.deepToString(item));
            try {
                System.out.println("Результат: " + Handler.calculateArray4x4(item));
            }catch (MyArrayDataException | MyArraySizeException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Не знаем такое");
            }
            finally {
                System.out.println("Работа с массивом завершена\n");
            }
        });
    }
}
