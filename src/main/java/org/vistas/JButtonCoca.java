package org.vistas;

import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JButtonCoca extends JRadioButton{
    Selector tipoPorducto;
    public JButtonCoca() {
        super("Precio: $1200");

        URL urlCoca = getClass().getClassLoader().getResource("Coca-Cola.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("Coca-ColaSeleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconCoca = new ImageIcon(new ImageIcon(urlCoca).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconCoca);
        this.setSelectedIcon(iconSeleccionado);


        /*
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fue presionado.");
                tipoPorducto = Selector.COCACOLA;
            }
        });*/
    }/*
    public Selector getTipoProducto(){
        return tipoPorducto;
    }*/
}
