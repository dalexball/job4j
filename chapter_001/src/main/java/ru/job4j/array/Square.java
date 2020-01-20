package ru.job4j.array;

/**
 * @author Alex Dotsyak
 * @version 1
 * Class works with squares of numbers
 */
public class Square {
    /**
     * Calculates squares of numbers
     * @param bound - bound
     * @return array of squares from 1 to bound
     */
    public int[] calculate(int bound){
        int[] rst=new int[bound];
        for (int index=0;index!=bound;index++){
            rst[index]=(index+1)*(index+1);
        }
        return rst;
    }
}
