package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public abstract class ImageMonedas extends JPanel {
    private Image imagen;
    private String ruta;
    private int valor;
    public ImageMonedas() {
        super();
    }
    abstract int getValor();

}
