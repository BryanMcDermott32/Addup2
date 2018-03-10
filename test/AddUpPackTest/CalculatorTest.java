package AddUpPackTest;

import AddUpPack.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    int a;
    int b;
    Calculator calculator;
    @Before
    public void setUp() throws Exception {
    a=12;
    b=17;
    calculator= new Calculator();
    }

    @Test
    public void addUp(){
        int actual=a+b;
        int expected=calculator.addUp(a,b);
        assertEquals(expected,actual);
    }

    @Test
    public void subtract(){
        int actual=a-b;
        int expected=calculator.subtract(a,b);
        assertEquals(expected,actual);
    }

    @Test
    public void multiply(){
        int actual=a*b;
        int expected=calculator.multiply(a,b);
        assertEquals(expected,actual);
    }

    @Test
    public void divide(){
        int actual=a/b;
        int expected=calculator.divide(a,b);
        assertEquals(expected,actual);
    }

}