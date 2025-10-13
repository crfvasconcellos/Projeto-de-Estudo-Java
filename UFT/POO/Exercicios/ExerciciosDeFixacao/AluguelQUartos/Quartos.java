package ExerciciosDeFixacao.AluguelQUartos;

public class Quartos {
    private String nome;
    private String email;
    private int numeroquarto;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getNumeroquarto() {
        return numeroquarto;
    }


    public Quartos(String nome, String email, int numeroquarto){
        this.nome = nome;
        this.email= email;
        this.numeroquarto = numeroquarto;
    }

    @Override
    public String toString() {
        return nome + "," + email;
    }
}
