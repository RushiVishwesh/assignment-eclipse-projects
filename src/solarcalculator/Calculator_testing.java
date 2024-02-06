package solarcalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Calculator_testing {
   
   @Test
   public void testSum() {
        assertEquals(50, calculator.add(20, 30));
   }
   
   @Test
   public void testSub() {
       assertEquals(-10, calculator.subtract(20, 30));
   }
   
   @Test
   public void testMul() {
       assertEquals(600, calculator.multiply(20, 30));
   }
   
   @Test
   public void testDiv() {
       assertEquals(0, calculator.divide(20, 30));
   }
}