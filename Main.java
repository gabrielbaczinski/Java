import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

class BordaArredondada extends AbstractBorder {
    private int raio;

    public BordaArredondada(int raio) {
        this.raio = raio;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        g2d.drawRoundRect(x, y, width - 1, height - 1, raio, raio);
    }
}

public class Main {
    public static void main(String[] args) {
        // componente JFrame
        JFrame miJFrame = new JFrame("Casino");
        miJFrame.setSize(1280, 720);
        miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        miJPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // componente JLabel
        JLabel miJLabel = new JLabel("Qual jogo você deseja jogar?");
        miJPanel.add(miJLabel, gbc);

        gbc.insets = new Insets(15, 0, 10, 0);

        // Adicionando e personalizando botao1 com borda arredondada
        gbc.gridy = 1;
        JButton botao1 = new JButton("Roleta");
        botao1.setFont(new Font("Arial", Font.BOLD, 16));
        botao1.setPreferredSize(new Dimension(100, 30));
        botao1.setFocusPainted(false);
        botao1.setBorder(new BordaArredondada(20)); // Define a borda arredondada com raio 20
        miJPanel.add(botao1, gbc);

        gbc.insets = new Insets(5, 0, 10, 0);

        gbc.gridy = 2;
        JButton botao2 = new JButton("Bingo");
        botao2.setFont(new Font("Arial", Font.BOLD, 16));
        botao2.setPreferredSize(new Dimension(100, 30));
        botao2.setFocusPainted(false);
        botao2.setBorder(new BordaArredondada(20)); // Define a borda arredondada com raio 20
        miJPanel.add(botao2, gbc);

        gbc.insets = new Insets(5, 0, 10, 0);

        gbc.gridy = 3;
        JButton botao3 = new JButton("Poker");
        botao3.setFont(new Font("Arial", Font.BOLD, 16));
        botao3.setPreferredSize(new Dimension(100, 30));
        botao3.setFocusPainted(false);
        botao3.setBorder(new BordaArredondada(20)); // Define a borda arredondada com raio 20
        miJPanel.add(botao3, gbc);

        gbc.insets = new Insets(5, 0, 10, 0);

        gbc.gridy = 4;
        JButton botao4 = new JButton("BackJack");
        botao4.setFont(new Font("Arial", Font.BOLD, 16));
        botao4.setPreferredSize(new Dimension(100, 30));
        botao4.setFocusPainted(false);
        botao4.setBorder(new BordaArredondada(20)); // Define a borda arredondada com raio 20
        miJPanel.add(botao4, gbc);

        gbc.insets = new Insets(5, 0, 10, 0);

        gbc.gridy = 5;
        JButton botao5 = new JButton("Caça Níquel");
        botao5.setFont(new Font("Arial", Font.BOLD, 16));
        botao5.setPreferredSize(new Dimension(100, 30));
        botao5.setFocusPainted(false);
        botao5.setBorder(new BordaArredondada(20)); // Define a borda arredondada com raio 20
        miJPanel.add(botao5, gbc);

        // conectar JPanel a JFrame
        miJFrame.add(miJPanel);

        // fazer visível JFrame
        miJFrame.setVisible(true);
    }
}
