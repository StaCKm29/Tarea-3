package org.vistas;
import org.modelos.NoHayProductoException;
import org.modelos.PagoIncorrectoException;
import org.modelos.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Clase que representa el panel principal de la interfaz gráfica.
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private JButtonCompra botonComprar;

    public PanelPrincipal () {
        this.com = new PanelComprador();
        this.exp = new PanelExpendedor (5);
        this.botonComprar = new JButtonCompra(exp,com);
        this.setBackground(Color.WHITE);

        add(exp);
        add(com);
        add(botonComprar, BorderLayout.SOUTH);

        setLayout(new FlowLayout());
    }

    /**
     * Método que se encarga de pintar los componentes del panel.
     * @param g
     */
    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
    }

    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException, IOException {
        JFrame frame = new JFrame("Panel Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        PanelPrincipal panelPrincipal = new PanelPrincipal();
        frame.add(panelPrincipal);

        frame.setVisible(true);
    }
}
