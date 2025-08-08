public class condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoplano = "Plus";

        if (anoDeLancamento > 2024){
            System.out.println("Lançamentos que os Clientes estão Curtindo!");
        }
        else {
            System.out.println("Vale a Pena Assistir!");
        }

        if (incluidoNoPlano == true || tipoplano.equals("Plus")){
            System.out.println("Filme Liberado!!");
        }
        else {
            System.out.println("Deve Pagar a Locação!");
        }


    }
}
