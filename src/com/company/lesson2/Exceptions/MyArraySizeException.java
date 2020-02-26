package com.company.lesson2.Exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String message){
        super(message);
    }
}
