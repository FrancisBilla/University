package test;


import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
  /*  @Test
    public void testCaseForSum(){
       boolean sumTest = Numbers.isSum()
               assertFalse(sumTest);
    }
*/
    @Test
    public void testCaseForPositiveOrNegative(){
        boolean numberTest = Numbers.isPositive(5);
        assertTrue(numberTest);
    }
}