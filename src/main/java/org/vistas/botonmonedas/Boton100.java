package org.vistas.botonmonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import org.modelos.Moneda;
import org.modelos.Moneda100;
import org.vistas.JPanelBilletera;

public class Boton100 extends JRadioButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private int contador = 123;

    public Boton100(JPanelBilletera panelBilletera) {
        super();

        URL url100 = getClass().getClassLoader().getResource("moneda100.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("moneda100Dark.png");

        int ancho = 100;
        int alto = 100;
        ImageIcon icon100 = new ImageIcon(new ImageIcon(url100).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(icon100);
        this.setSelectedIcon(iconSeleccionado);
        this.panelBilletera = panelBilletera;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Moneda moneda = new Moneda100(contador);
        panelBilletera.setTipoMoneda(moneda);
        contador++;
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
