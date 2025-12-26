package Entities;

public class Triangulo {
    public double a, b, c;


    public double getArea(){

        double p = (a + b + c)/2;

        double result = p * (p-a) * (p - b) * (p-c);
        result = Math.sqrt(result);

        return  result;

    }

}
