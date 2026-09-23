
package org.example;

public class StandardCalculator {
    
    private double result;

    public void add(double a, double b){
        result = a + b;
    }

    public void subtract(double a, double b){
        result = a-b;
    }

    public void multiply(double a, double b){
        result = a*b;
    }

    public void divide(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            result = a/b;
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
