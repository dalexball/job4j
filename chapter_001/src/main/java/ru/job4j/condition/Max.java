package ru.job4j.condition;

public class Max {
    public static int max(int firstVal, int secondVal){
        int result;
        boolean higher=firstVal>=secondVal;
        result=higher?firstVal:secondVal;
        return result;
    }
}
