package org.example;

public class ScientificCalculator extends StandardCalculator {
    
    private double radian;

    public double getRadian() {
        return radian;
    }
    public void setRadian(double radian) {
        this.radian = radian;
    }

    public void degreesToRadian(double a){
        radian = Math.toRadians(a);
    }
    public void sin(double a){
        degreesToRadian(a);
        setResult(Math.sin(radian));
    }
    
    public void cos(double a){
        degreesToRadian(a);
        setResult(Math.cos(radian));
    }

    public void tan(double a){
        degreesToRadian(a);
        setResult(Math.tan(radian));
    }

    public void square(double a){
        multiply(a, a);
    }

    public void cube(double a){
        multiply(a, a);
        multiply(getResult(), a);
    }

    public void log(double a){
        if(a <= 0){
            throw new IllegalArgumentException("Logarithm is undefined for non-positive values");
        }
        setResult(Math.log(a));
    }

    public void sqrt(double a){
        if(a<0){
            throw new IllegalArgumentException("Square root is undefined for negative values"); 
        }
        setResult(Math.sqrt(a));
    }

    public void cbrt(double a){
        setResult(Math.cbrt(a));
    }

    public void exp(double a){
        setResult(Math.exp(a));
    }

    public void pow(double a, double b){
        setResult(Math.pow(a, b));
    }
}
