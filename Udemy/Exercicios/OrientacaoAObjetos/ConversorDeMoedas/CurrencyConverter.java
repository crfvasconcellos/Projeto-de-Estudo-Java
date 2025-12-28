public class CurrencyConverter {

    public static double RealConverter(double DollarPrice, double ManyDollar){
        double reais = DollarPrice * ManyDollar;
        reais = reais  + (( reais * 6 ) / 100);
        return reais;
    }


}
