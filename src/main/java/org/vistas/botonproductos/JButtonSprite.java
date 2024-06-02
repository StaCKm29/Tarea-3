package org.vistas.botonproductos;

import org.modelos.Selector;
import org.vistas.JPanelSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

/**
 * Clase que representa un botón de Sprite y muestra su precio.
 */
public class JButtonSprite extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;

    public JButtonSprite(JPanelSelect panelSelect) {
        super("Precio: $1200");

        URL urlSprite = getClass().getClassLoader().getResource("sprite.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("spriteSeleccionado.png");

        int ancho = 100;
        int alto = 100;
        ImageIcon iconSprite = new ImageIcon(new ImageIcon(urlSprite).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconSprite);
        this.setSelectedIcon(iconSeleccionado);
        setBackground(Color.ORANGE);
        this.panelSelect = panelSelect;
        this.addMouseListener(this);
    }

    /**
     * Método que se ejecuta cuando se hace click en el botón.
     * @param e Evento de mouse.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Selector.SPRITE);
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
