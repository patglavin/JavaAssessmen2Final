package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator{
    public int input;

    public WuTangConcatenator(int input){
        this.input = input;
    }

    public boolean isWu(){
        if (input % 3 == 0) return true;
        return false;
    }

    public boolean isTang(){
        if (input % 5 == 0) return true;
        return false;
    }

    public boolean isWuTang(){
        if (input % 3 == 0 && input % 5 == 0) return true;
        return false;
    }
}