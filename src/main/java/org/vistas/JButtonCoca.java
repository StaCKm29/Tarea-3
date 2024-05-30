package org.vistas;

import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class JButtonCoca extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    public JButtonCoca(JPanelSelect panelSelect) {
        super("Precio: $1200");

        URL urlCoca = getClass().getClassLoader().getResource("Coca-Cola.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("Coca-ColaSeleccionado.png");

        int ancho = 100;
        int alto = 100;
        ImageIcon iconCoca = new ImageIcon(new ImageIcon(urlCoca).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconCoca);
        this.setSelectedIcon(iconSeleccionado);
        this.panelSelect = panelSelect;
        this.addMouseListener(this);
        setBackground(new Color(3, 131, 168));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Selector.COCACOLA);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
