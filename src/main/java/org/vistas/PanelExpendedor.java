package org.vistas;

import org.modelos.Expendedor;
import org.vistas.paneldepositos.JPanelDepositos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class PanelExpendedor extends JPanel implements MouseListener {
    private Expendedor exp;
    private JPanelDepositos panelDepositos;
    private DepositoEspecial depositoEspecial;
    private ImageIcon icon;
    private Image backgroundImage;


    public PanelExpendedor(int size) {
        this.exp = new Expendedor(size);
        this.panelDepositos = new JPanelDepositos();
        panelDepositos.setPreferredSize(new Dimension(375,500));
        depositoEspecial = new DepositoEspecial(exp.getProducto());
        add(depositoEspecial);
        add(panelDepositos);

        this.addMouseListener(this);
        URL imageUrl = getClass().getClassLoader().getResource("expendedor.png");
        ImageIcon icon = new ImageIcon(new ImageIcon(imageUrl).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        backgroundImage = icon.getImage();

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
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar la imagen de fondo
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        }

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
        updateUI();
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
