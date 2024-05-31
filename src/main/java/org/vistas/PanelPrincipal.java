package org.vistas;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;
    private JButtonCompra botonComprar;

    public PanelPrincipal () {
        this.com = new PanelComprador();
        this.exp = new PanelExpendedor (5);

        setLayout(new FlowLayout());
        add(exp);
        add(com);

        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
    }

    public void iniciarButtonCompra() {
        this.botonComprar = new JButtonCompra(exp.getExpendedor(), com.getPanel(), com.getMonedero());
        add(botonComprar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        PanelPrincipal panelPrincipal = new PanelPrincipal();
        panelPrincipal.iniciarButtonCompra();
        frame.add(panelPrincipal);

        frame.setVisible(true);
    }
}
