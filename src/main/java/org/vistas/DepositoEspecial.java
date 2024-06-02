package org.vistas;

import org.modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que representa un panel del deposito donde aparecerá el producto que fue comprado.
 */
public class DepositoEspecial extends JPanel implements MouseListener {
    private Producto producto;
    private ImageIcon icon;

    public DepositoEspecial(){
        this.setPreferredSize(new Dimension(150, 150));
        this.addMouseListener(this);
        this.setBackground(Color.GRAY);

        setIcon();
    }

    /**
     * Método que establece el ícono del producto comprado.
     */
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

    /**
     * Método que pinta el icono que fue seleccionado previamente.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        //analizar que consiumio el comprador
        super.paintComponent(g);
        if(icon != null) {
            g.drawImage(icon.getImage(), 0, 0,getWidth(), getHeight(), this);
        }
    }

    /**
     * Método que establece el producto que fue comprado.
     * @param producto Producto que se compró.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
        setIcon();
        repaint();
    }

    /**
     * Método para el caso que se haga click en la imagen, ésta desaparezca.
     */
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

    /**
     * Método que muestra un mensaje con el número de serie del producto.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        if(producto != null)
            JOptionPane.showMessageDialog(this, "N° de serie: " + producto.getSerie());
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
