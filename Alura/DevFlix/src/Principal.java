import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Scanner leitor = new Scanner(System.in);
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracao= 180;

        meuFilme.exibirFicha();

        System.out.println("Qual nota você daria?");
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(2);

        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacao());

        System.out.println("A média das avaliações é "+ meuFilme.obtemMedia());

        

    }
}
