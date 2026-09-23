
package org.example;

public class StandardCalculator {
    
    private double result;

    public void add(double a, double b){
        double result = a + b;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Overflow occurred during addition");
        }else if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Underflow occurred during addition");
        }
        this.result = result;
    }

    public void subtract(double a, double b){
        double result = a-b;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Overflow occurred during subtraction");
        }else if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Underflow occurred during subtraction");
        }
        this.result = result;
    }

    public void multiply(double a, double b){
        double result = a*b;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Overflow occurred during multiplication");
        }else if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Underflow occurred during multiplication");
        }
        this.result = result;
    }

    public void divide(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            double result = a/b;
            if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
                throw new ArithmeticException("Overflow occurred during division");
            }else if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
                throw new ArithmeticException("Underflow occurred during division");
            }
            this.result = result;
        }
    }

    public double getResult(){
        return result;
    }

    public void setResult(double result){
        this.result = result;
    }

    public void clearResult(){
        result = 0;
    }
}
