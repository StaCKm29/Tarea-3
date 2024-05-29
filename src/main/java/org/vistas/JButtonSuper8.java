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

        this.panelSelect = panelSelect;

        URL urlSuper8 = getClass().getClassLoader().getResource("super8.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("super8Seleccionado.png");

        int ancho = 100;
        int alto = 100;

        ImageIcon iconSuper8 = new ImageIcon(new ImageIcon(urlSuper8).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        this.setIcon(iconSuper8);
        this.setSelectedIcon(iconSeleccionado);
        setBackground(new Color(3, 131, 168));
        this.addMouseListener(this);
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
