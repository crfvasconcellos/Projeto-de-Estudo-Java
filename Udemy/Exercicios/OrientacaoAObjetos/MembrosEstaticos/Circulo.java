package OrientacaoAObjetos.MembrosEstaticos;

public class Circulo {

    public static final double PI = 3.14;

    public static double circunferencia(double Raio){
        double c = 2 * PI * Raio;
        return c;

    }

    public static double volume(double Raio){
        double v = ((Raio*Raio*Raio) * PI * 4 ) / 3;
        return v;
    }

    public static double PiValue(){
        return PI;
    }

}
