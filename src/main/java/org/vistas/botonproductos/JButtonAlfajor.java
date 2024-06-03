package org.vistas.botonproductos;
import org.modelos.Selector;
import org.vistas.JPanelSelect;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.*;

/**
 * Clase que representa un botón de alfajor y muestra su precio.
 */
public class JButtonAlfajor extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    /**
     * Constructor de la clase JButtonAlfajor.
     * @param panelSelect panel de selección.
     */
    public JButtonAlfajor(JPanelSelect panelSelect){
        super("Precio: $600");

        URL urlAlfajor = getClass().getClassLoader().getResource("alfajor.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("alfajorSeleccionado.png");

        int ancho = 80;
        int alto = 80;
        ImageIcon iconAlfajor = new ImageIcon(new ImageIcon(urlAlfajor).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconAlfajor);
        this.setSelectedIcon(iconSeleccionado);
        this.panelSelect = panelSelect;
        this.addMouseListener(this);
        setBackground(new Color(3, 131, 168));
    }

    /**
     * Se invoca cuando el mouse fue presionado y soltado en el botón.
     * @param e evento de mouse.
     */
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
