import dev.claudio.devflix.models.Filme;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Scanner leitor = new Scanner(System.in);
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracao(180);

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
