
package org.example;

public class StandardCalculator {
    
    private int result;

    public void add(int a, int b){
        result = a + b;
    }

    public void subtract(int a, int b){
        result = a-b;
    }

    public void multiply(int a, int b){
        result = a*b;
    }

    public void divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            result = a/b;
        }
    }

    public int getResult(){
        return result;
    }

    public void setResult(int result){
        this.result = result;
    }

    public void clearResult(){
        result = 0;
    }
}
