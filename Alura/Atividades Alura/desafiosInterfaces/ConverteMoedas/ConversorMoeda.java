public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public void converterDolarParaReal(double valordolar) {
        double cotacao = 5.20;
        double valorReal= cotacao *  valordolar;
        System.out.println("O valor em Reais é " + valorReal);

    }
}
