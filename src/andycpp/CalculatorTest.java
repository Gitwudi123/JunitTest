package andycpp;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase{

 private static Calculator calculator = new Calculator();

     @Before
     public void setUp() throws Exception
     {
      calculator.clear();
     }

     public void testAdd()   {
      calculator.add(2);
      calculator.add(3);
      assertEquals(5, calculator.getResult());
     }
     @Test
     public void testSubstract()
     {
      calculator.add(10);
      calculator.substract(8);
      System.out.println(calculator.getResult());
      assertEquals(9, calculator.getResult());
     }

    @Test
     public void testMultiply() {
         System.out.println("");
    }

    @Test
    public void testDivide()
     {
      calculator.add(8);
      calculator.divide(2);
      assertEquals(4, calculator.getResult());
     }

}
