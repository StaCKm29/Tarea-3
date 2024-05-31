package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageMoneda100 extends ImageMonedas {
    private String ruta;
    private int valor;
    private Image imagen;
    public ImageMoneda100() {
        super();
        this.ruta = "moneda100.png";
        this.valor = 100;
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
    public int getValor() {
        return valor;
    }
}
