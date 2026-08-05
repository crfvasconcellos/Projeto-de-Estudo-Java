package testeBibliotecaRandomDate;


import org.apache.commons.math3.random.RandomDataGenerator;

public class main {
    public static void main(String[] args) {

        RandomDataGenerator random = new RandomDataGenerator();

        System.out.println("Numero aleatorio: " + random.nextInt(1,10));


    }
}
