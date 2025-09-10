import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingUtilities.paintComponent;

public class GamePrototipo {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Protótipo de Jogo");

        JPanel quadrado = new JPanel();
        janela.setBounds(0,0,600,600);

        quadrado.setBounds(0,0,50,50);
        paintComponent()

        janela.add(quadrado);
        janela.setVisible(true);


    }

    private static void paintComponent() {
    }

}
