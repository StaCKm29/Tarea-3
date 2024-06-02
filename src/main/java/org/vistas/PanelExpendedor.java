package org.vistas;

import org.modelos.Expendedor;
import org.vistas.paneldepositos.JPanelDepositos;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanelExpendedor extends JPanel implements MouseListener {
    private Expendedor exp;
    private JPanelDepositos panelDepositos;
    private DepositoEspecial depositoEspecial;

    public PanelExpendedor(int size) {
        this.exp = new Expendedor(size);
        this.panelDepositos = new JPanelDepositos();
        panelDepositos.setPreferredSize(new Dimension(440, 500));
        depositoEspecial = new DepositoEspecial(exp.getProducto());
        add(depositoEspecial);
        add(panelDepositos);

        this.addMouseListener(this);
    }

    public Expendedor getExpendedor(){
        return exp;
    }

    public JPanelDepositos getPanelDepositos(){
        return panelDepositos;
    }

    public DepositoEspecial getDepositoEspecial(){
        return depositoEspecial;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        depositoEspecial.paintComponent(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            PanelExpendedor panelExpendedor = new PanelExpendedor(5);
            DepositoEspecial depositoEspecial = new DepositoEspecial(panelExpendedor.getExpendedor().getProducto());
            frame.add(panelExpendedor);
            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        exp.rellenarDepositos();
        panelDepositos.rellenarImagenes();
        System.out.println("Me presionaste!");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
