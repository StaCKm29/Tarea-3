package org.vistas;

import org.modelos.Expendedor;
import org.modelos.Producto;
import org.modelos.Selector;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DepositoEspecial extends JPanel implements MouseListener {
    private Producto producto;
    private Selector eleccion;
    private ImageIcon icon;
    private JLabel label;

    public DepositoEspecial(Expendedor exp, Selector eleccion){
        this.producto = exp.getProducto();
        this.eleccion = eleccion;
        switch(eleccion) {
            case COCACOLA:
                icon = new ImageIcon("src/main/resources/cocacola.png");
                break;
            case SPRITE:
                icon = new ImageIcon("src/main/resources/sprite.png");
                break;
            case FANTA:
                icon = new ImageIcon("src/main/resources/fanta.png");
                break;
            case SNICKERS:
                icon = new ImageIcon("src/main/resources/snickers.png");
                break;
            case ALFAJOR:
                icon = new ImageIcon("src/main/resources/alfajor.png");
                break;
        }
        label = new JLabel(icon);
        add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        int serie = producto.getSerie();
        String serieStr = Integer.toString(serie);
        JOptionPane.showMessageDialog(this, "Serie: " + serieStr );
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
