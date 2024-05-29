package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import org.modelos.Selector;

public class JButtonSuper8 extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    public JButtonSuper8(JPanelSelect panelSelect) {
        super("Precio: $300");

        URL urlSuper8 = getClass().getClassLoader().getResource("super8.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("super8Seleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconSuper8 = new ImageIcon(new ImageIcon(urlSuper8).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconSuper8);
        this.setSelectedIcon(iconSeleccionado);
        this.addMouseListener(this);
        this.panelSelect = panelSelect;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Selector.SUPER8);;
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
