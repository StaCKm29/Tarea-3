package org.vistas;
import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class JButtonFanta extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    public JButtonFanta(JPanelSelect panelSelect) {
        super("Precio: $1200");

        URL urlFanta = getClass().getClassLoader().getResource("fanta.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("fantaSeleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconFanta = new ImageIcon(new ImageIcon(urlFanta).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconFanta);
        this.setSelectedIcon(iconSeleccionado);
        this.panelSelect = panelSelect;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Selector.FANTA);
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
