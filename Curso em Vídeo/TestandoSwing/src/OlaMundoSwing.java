import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoSwing {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Teste da Biblioteca Swing");
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setBounds(0,0,400,500);
        janela.setLayout(null);

        JButton botao = new JButton("Clique");
        botao.setBounds(99,250,200,30);

        JLabel texto = new JLabel();
        texto.setBounds(170,180,100,100);



        JTextField caixa = new JTextField("Insira seu nome",20);


        caixa.setBounds(100,100,200,50);

        //Configurando o Botao

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("Olá " + caixa.getText());
                System.out.println("Olá Mundo!!!!!");
            }
        });

        //Add
        janela.add(texto);
        janela.add(botao);
        janela.add(caixa);

        //Deixou visivel
        janela.setVisible(true);




    }
}