public class Main {
    public static void main(String[] args){


        double celsiutemp = 30;
        double fahtemp = (celsiutemp*1.8)+32;

        System.out.println(String.format("A temperatura de %.1f celsius em Fahrenheit é %.1f", celsiutemp,fahtemp));
    }
}