package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    /**
     * Check if method calculate works with number 3
     */
    @Test
    public void whenBound3Then149(){
        int bound=3;
        Square ar3=new Square();
        int[] result=ar3.calculate(bound);
        int[] expect=new int[]{1,4,9};
        assertThat(result,is(expect));
    }

    /**
     * Check if method calculate works with number 4
     */
    @Test
    public void whenBound4Then14916(){
        int bound=4;
        Square ar3=new Square();
        int[] result=ar3.calculate(bound);
        int[] expect=new int[]{1,4,9,16};
        assertThat(result,is(expect));
    }

    /**
     * Check if method calculate returns empty array if bound equals zero;
     */
    @Test
    public void whenBound0ThenNull(){
        int bound=0;
        Square ar3=new Square();
        int[] result=ar3.calculate(bound);
        int[] expect=new int[]{};
        assertThat(result,is(expect));
    }
}
