package ExercicioDePolimorfismo;

public class PessoaFisica extends Contribuinte {
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcularImposto() {
        double impostoBase;
        if (getRendaAnual() < 20000.0) {
            impostoBase = getRendaAnual() * 0.15;
        } else {
            impostoBase = getRendaAnual() * 0.25;
        }
        impostoBase -= gastosSaude * 0.5;
        if (impostoBase < 0) impostoBase = 0; // evitar imposto negativo
        return impostoBase;
    }



}
