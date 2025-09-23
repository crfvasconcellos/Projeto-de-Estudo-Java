package ExesClassEstrutMetodos.Att2.src.entities;

public class Employee {
    public String name;
    public double salario;
    public double imposto;

    public double salarioLiquido(){
        return salario-imposto;

    }

    public void aumento(double porcentagem){
        salario = salario + salario * porcentagem/100;

    }


    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
