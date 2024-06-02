package org.vistas;

import org.modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DepositoEspecial extends JPanel implements MouseListener {
    private Producto producto;
    private ImageIcon icon;

    public DepositoEspecial(Producto producto){
        this.producto = producto;
        this.setPreferredSize(new Dimension(150, 150));
        this.addMouseListener(this);
        this.setBackground(Color.GRAY);

        setIcon();
    }

    private void setIcon() {
        if(producto == null) {
            icon = null;
        } else if (producto instanceof Cocacola) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/Coca-Cola.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Fanta) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/fanta.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Sprite) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/sprite.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Snickers) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/snickers.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Super8) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/super8.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Alfajor) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/alfajor.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        //analizar que consiumio el comprador
        super.paintComponent(g);
        if(icon != null) {
            g.drawImage(icon.getImage(), 0, 0,getWidth(), getHeight(), this);
        }
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        setIcon();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setProducto(null);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(producto != null)
            JOptionPane.showMessageDialog(this, "N° de serie: " + producto.getSerie());
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        // Crear el JFrame
        JFrame frame = new JFrame("Deposito Especial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear instancias de Expendedor y Selector
        Expendedor exp = new Expendedor(5);
        Selector seleccion = Selector.COCACOLA; // Puedes cambiar esto a la selección que desees
        Moneda moneda2000 = new Moneda2000(123);
        exp.comprarProducto(moneda2000, seleccion);

        // Inicializar la instancia de DepositoEspecial
        DepositoEspecial depositoEspecial = new DepositoEspecial(exp.getProducto());

        // Añadir el panel de DepositoEspecial al frame
        frame.add(depositoEspecial);

        // Configuración y visualización del JFrame
        frame.pack();
        frame.setVisible(true);
    }
}
