package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ScientificCalculatorTest {
    
    private ScientificCalculator scientificCalculator;

    @BeforeEach
    public void setUp() {
        scientificCalculator = new ScientificCalculator();
    }


    //Test case for cos function
    @Test 
    @DisplayName("Test case for cos function at 0 degrees")
    public void testCos() {
        scientificCalculator.cos(0);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(1, result, 0.0001);
    }

    @Test 
    @DisplayName ("Test case for cos function at 90 degrees")
    public void testCos90() {
        scientificCalculator.cos(90);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001); 
    }

    @Test 
    @DisplayName("Test case for cos function at 180 degrees")
    public void testCos180() {
        scientificCalculator.cos(180);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(-1, result, 0.0001); 
    }

    @Test
    @DisplayName("Test case for cos function at angle > 360 degrees")
    public void testCosGreaterThan360() {
        scientificCalculator.cos(450);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001);
    }  
    
    @Test 
    @DisplayName("Test case for cos function at negative angle")
    public void testCosNegativeAngle() {
        scientificCalculator.cos(-90);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001);   
    }

    @Test 
    @DisplayName ("Test case for cos function at angle < -360 degrees")
    public void testCosLessThanNegative360() {
        scientificCalculator.cos(-450);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001);
    }

    //Test case for tan function
    @Test 
    @DisplayName("Test case for tan function at 0 degrees")
    public void testTan() {
        scientificCalculator.tan(0);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001);
    }

    @Test 
    @DisplayName ("Test case for tan function at 90 degrees")
    public void testTan90() {
        scientificCalculator.tan(90);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result, 0.0001); 
    }

    @Test 
    @DisplayName("Test case for tan function at 180 degrees")
    public void testTan180() {
        scientificCalculator.tan(180);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001); 
    }

    @Test
    @DisplayName("Test case for tan function at angle > 360 degrees")
    public void testTanGreaterThan360() {
        scientificCalculator.tan(450);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }  
    
    @Test 
    @DisplayName("Test case for tan function at negative angle")
    public void testTanNegativeAngle() {
        scientificCalculator.tan(-90);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, result, 0.0001);   
    }

    @Test 
    @DisplayName ("Test case for tan function at angle < -360 degrees")
    public void testTanLessThanNegative360() {
        scientificCalculator.tan(-450);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, result, 0.0001);
    }

    //test case for sin function
    @Test 
    @DisplayName("Test case for sin function at 0 degrees")
    public void testSin() {
        scientificCalculator.sin(0);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001);
    }

    @Test 
    @DisplayName ("Test case for sin function at 90 degrees")
    public void testSin90() {
        scientificCalculator.sin(90);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(1, result, 0.0001); 
    }

    @Test 
    @DisplayName("Test case for sin function at 180 degrees")
    public void testSin180() {
        scientificCalculator.sin(180);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001); 
    }

    @Test
    @DisplayName("Test case for sin function at angle > 360 degrees")
    public void testSinGreaterThan360() {
        scientificCalculator.sin(450);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(1, result, 0.0001);
    }  
    
    @Test 
    @DisplayName("Test case for sin function at negative angle")
    public void testSinNegativeAngle() {
        scientificCalculator.sin(-90);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(-1, result, 0.0001);   
    }

    @Test 
    @DisplayName ("Test case for sin function at angle < -360 degrees")
    public void testSinLessThanNegative360() {
        scientificCalculator.sin(-450);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(-1, result, 0.0001);
    }

    //Test case for square function
    @Test
    @DisplayName("Test case for square function")
    public void testSquare() {
        scientificCalculator.square(5);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(25, result, 0.0001);
    }

    @Test 
    @DisplayName("Test case for square function with negative input")
    public void testSquareNegativeInput() {
        scientificCalculator.square(-5);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(25, result, 0.0001);
    }

    @Test 
    @DisplayName ("Test case for square function with 0 input")
    public void testSquareZeroInput() {
        scientificCalculator.square(0);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(0, result, 0.0001);
    }

    @Test 
    @DisplayName("Test case for square function with decimal input")
    public void testSquareDecimalInput() {
        scientificCalculator.square(2.5);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(6.25, result, 0.0001);
    }

    @Test 
    @DisplayName("Test case for square function with large input")
    public void testSquareLargeInput() {
        scientificCalculator.square(1e10);
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(1e20, result, 0.0001);
    }

    @Test 
    @DisplayName("Test case for square function with double MAX_VALUE input")
    public void testSquareMaxValueInput() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            scientificCalculator.square(Double.MAX_VALUE);
        });
    }
    @Test 
    @DisplayName("Test case for square function with double sqrt of MAX_VALUE input")
    public void testSquareMaxValueInput2() {
        scientificCalculator.square(Math.sqrt(Double.MAX_VALUE));
        double result = scientificCalculator.getResult();
        Assertions.assertEquals(Double.MAX_VALUE,result,1E300);
    }
}
