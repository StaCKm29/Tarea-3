package org.vistas;

import org.modelos.Moneda;
import org.modelos.Moneda100;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;

public class PanelBilletera extends JPanel {
    private Moneda moneda;

    public PanelBilletera() {
        //Creacion de una grilla de 2x2 para las 4 monedas
        setLayout(new GridLayout(2,2));

        //Cargar las imagenes desde el archivo (carpeta resource)
        URL url500 = getClass().getClassLoader().getResource("moneda500.png");
        URL url100 = getClass().getClassLoader().getResource("moneda100.png");
        URL urlMil = getClass().getClassLoader().getResource("1000pesos.png");
        URL urlDosMil = getClass().getClassLoader().getResource("2000pesos.png");

        //Crear los ImageIcon con las imagenes cargadas para poder crear JToggleButtons con las imagenes
        ImageIcon icon500 = new ImageIcon(url500);
        ImageIcon icon100 = new ImageIcon(url100);
        ImageIcon iconMil = new ImageIcon(urlMil);
        ImageIcon iconDosMil = new ImageIcon(urlDosMil);

        //Crear los JToggleButtons con las imagenes
        ArrayList<JToggleButton> botones = new ArrayList<>();
        botones.add(new JToggleButton(icon100));
        botones.add(new JToggleButton(icon500));
        botones.add(new JToggleButton(iconMil));
        botones.add(new JToggleButton(iconDosMil));

        //Agrupar los botones para que solo se pueda seleccionar uno a la vez
        ButtonGroup monedero = new ButtonGroup();
        for (JToggleButton boton : botones) {
            monedero.add(boton);
        }

        //Agregar los botones al panel
        for (JToggleButton boton : botones) {
            add(boton);
        }

        if(botones.get(0).isSelected()){
            moneda = new Moneda100(100);
        }
        if(botones.get(1).isSelected()){
            moneda = new Moneda100(500);
        }
        if(botones.get(2).isSelected()){
            moneda = new Moneda100(1000);
        }
        if(botones.get(3).isSelected()){
            moneda = new Moneda100(2000);
        }

    }

    public Moneda getMoneda(){
        return moneda;
    }

    public static void main(String[] args) {
        // Crear el JFrame (ventana)
        JFrame frame = new JFrame("Su Monedero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        // Crear una instancia del PanelBilletera
        PanelBilletera panel = new PanelBilletera();
        frame.add(panel);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}


