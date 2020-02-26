package com.company.lesson2;

import com.company.lesson2.Exceptions.MyArrayDataException;
import com.company.lesson2.Exceptions.MyArraySizeException;

public class Handler {
    public static int calculateArray4x4(String[][] data) throws MyArrayDataException, MyArraySizeException {
        if(data.length != 4 || data[0].length != 4){
            throw new MyArraySizeException("Массив должен быть 4x4");
        }

        int result = 0;
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                try {
                    result += Integer.parseInt(data[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArraySizeException(String.format("В ячейки [%d][%d] произошло ошибка преобразования типа", i, j));
                }
            }
        }
        return result;
    }
}
