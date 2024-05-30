package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageMoneda2000 extends ImageMonedas{
    private int valor;
    private String ruta;
    private Image imagen;
    public ImageMoneda2000() {
        super();
        this.ruta = "moneda2000.png";
        this.valor = 2000;
        URL imagenURL = getClass().getClassLoader().getResource(ruta);
        try{
            imagen = new ImageIcon(imagenURL).getImage();
            int ancho = 70;
            int alto = 70;
            imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    int getValor() {
        return this.valor;
    }
}
