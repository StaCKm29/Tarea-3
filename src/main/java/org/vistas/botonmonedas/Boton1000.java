package org.vistas.botonmonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import org.modelos.Moneda;
import org.modelos.Moneda1000;
import org.vistas.JPanelBilletera;

/** Boton1000 es un JRadioButton que representa una moneda de 1000 pesos.
 * Al ser seleccionado, se crea una moneda de 1000 pesos y se agrega al panel de billetera.
 */
public class Boton1000 extends JRadioButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private int contador = 323;

    public Boton1000(JPanelBilletera panelBilletera) {
        super();

        URL url1000 = getClass().getClassLoader().getResource("1000pesos.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("1000pesosDark.png");

        int ancho = 100;
        int alto = 100;
        ImageIcon icon1000 = new ImageIcon(new ImageIcon(url1000).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(icon1000);
        this.setSelectedIcon(iconSeleccionado);
        this.panelBilletera = panelBilletera;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Moneda moneda = new Moneda1000(contador);
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