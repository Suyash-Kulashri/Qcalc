package org.example;

public class ScientificCalculator extends StandardCalculator {

    public void sin(double a){
        result = Math.sin(a);
        setResult(result);
    }
    
    public void cos(double a){
        result = Math.cos(a);
        setResult(result);
    }

    public void tan(double a){
        result = Math.tan(a);
        setResult(result);
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
        result = Math.log(a);
        setResult(result);
    }

    public void sqrt(double a){
        if(a<0){
            throw new IllegalArgumentException("Square root is undefined for negative values"); 
        }
        result = Math.sqrt(a);
        setResult(result);
    }

    public void cbrt(double a){
        result = Math.cbrt(a);
        setResult(result);
    }

    public void exp(double a){
        result = Math.exp(a);
        setResult(result);
    }

    public void pow(double a, double b){
        result = Math.pow(a, b);
        setResult(result);
    }
}
