package unitTest;

public class Calculator {
    int a, b, c;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.div(20,3));
        System.out.println((double) 1/3);
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int diff(int a, int b){
        return a - b;
    }

   public int multiply(int a, int b){
        return a * b;
    }


public  double div(double a, double b){

        return a/b;
    }






}
