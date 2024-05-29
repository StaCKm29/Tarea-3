package org.vistas;

import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class JButtonSnickers extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    public JButtonSnickers(JPanelSelect panelSelect) {
        super("Precio: $1500");

        URL urlSnickers = getClass().getClassLoader().getResource("snickers.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("snickersSeleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconSnickers = new ImageIcon(new ImageIcon(urlSnickers).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconSnickers);
        this.setSelectedIcon(iconSeleccionado);
        this.panelSelect = panelSelect;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Selector.SNICKERS);
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
