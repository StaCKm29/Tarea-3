package org.vistas.botonmonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import org.modelos.Moneda;
import org.modelos.Moneda500;
import org.vistas.JPanelBilletera;

/** Boton500 es un JRadioButton que representa una moneda de 500 pesos.
 *  Al ser seleccionado, se crea una moneda de 500 pesos y se agrega al panel de Jpanelbilletera.
 */
public class Boton500 extends JRadioButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private int contador = 423;

    /**
     * Constructor de la clase Boton500.
     * @param panelBilletera panel de la billetera.
     */
    public Boton500(JPanelBilletera panelBilletera) {
        super();

        URL url500 = getClass().getClassLoader().getResource("moneda500.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("moneda500Dark.png");

        int ancho = 100;
        int alto = 100;
        ImageIcon icon500 = new ImageIcon(new ImageIcon(url500).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(icon500);
        this.setSelectedIcon(iconSeleccionado);
        this.panelBilletera = panelBilletera;
        this.addMouseListener(this);
    }

    /**
     * Se invoca cuando el mouse fue clickeado en el Boton500.
     * @param e evento de mouse.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        Moneda moneda = new Moneda500(contador);
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