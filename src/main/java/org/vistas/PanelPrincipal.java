package org.vistas;
import javax.swing.*;
import java.awt.*;
import org.modelos.*;
public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp; //static
    private JButtonCompra botonComprar;

    public PanelPrincipal () {
        this.exp = new PanelExpendedor (5);
        this.com = new PanelComprador();
        this.botonComprar = new JButtonCompra(exp, com);

        setLayout(new BorderLayout());
        add(exp, BorderLayout.CENTER);
        add(com, BorderLayout.NORTH);
        add(botonComprar, BorderLayout.SOUTH);

        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        PanelPrincipal panelPrincipal = new PanelPrincipal();
        frame.add(panelPrincipal);

        frame.setVisible(true);
    }
}
