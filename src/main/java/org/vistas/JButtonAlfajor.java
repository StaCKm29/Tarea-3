package org.vistas;
import org.modelos.Selector;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.*;
public class JButtonAlfajor extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    public JButtonAlfajor(JPanelSelect panelSelect){
        super("Precio: $600");

        URL urlAlfajor = getClass().getClassLoader().getResource("alfajor.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("alfajorSeleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconAlfajor = new ImageIcon(new ImageIcon(urlAlfajor).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconAlfajor);
        this.setSelectedIcon(iconSeleccionado);
        this.panelSelect = panelSelect;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Selector.ALFAJOR);
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
