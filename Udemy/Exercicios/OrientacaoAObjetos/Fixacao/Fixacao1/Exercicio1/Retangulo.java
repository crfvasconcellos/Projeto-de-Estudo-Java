package Fixacao1.Exercicio1;

public class Retangulo {

    private double largura;
    private double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){

        double area = altura * largura;
        return area;


    }

    public double getPerimeter(){
        double perimetro =  2 * (altura + largura);
        return  perimetro;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt((altura*altura) + (largura*largura));
        return diagonal;

    }


}
