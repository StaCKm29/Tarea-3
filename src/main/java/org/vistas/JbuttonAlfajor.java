package org.vistas;
import javax.swing.*;
import java.net.URL;
import java.awt.*;
public class JbuttonAlfajor extends JRadioButton{
    public JbuttonAlfajor(){
        super("Precio: $600");

        URL urlAlfajor = getClass().getClassLoader().getResource("alfajor.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("alfajorSeleccionado.png");

        int ancho = 100;
        int alto = 100;
        ImageIcon iconAlfajor = new ImageIcon(new ImageIcon(urlAlfajor).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconAlfajor);
        this.setSelectedIcon(iconSeleccionado);
        setBackground(new Color(3, 131, 168));
    }
}
