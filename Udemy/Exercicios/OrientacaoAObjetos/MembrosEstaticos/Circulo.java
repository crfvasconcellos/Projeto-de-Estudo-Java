public class Circulo {

    public static double circunferencia(double Raio){
        double c = 2 * 3.14 * Raio;
        return c;

    }

    public static double volume(double Raio){
        double v = ((Raio*Raio*Raio) * 3.14 * 4 ) / 3;
        return v;
    }

    public static double PiValue(){
        return 3.14;
    }

}
