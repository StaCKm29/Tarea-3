package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageMoneda500 extends ImageMonedas {
    private int valor;
    private String ruta;
    private Image imagen;
    public ImageMoneda500() {
        super();
        this.ruta = "moneda500.png";
        this.valor = 500;
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
