package org.vistas;

import org.modelos.*;
import org.vistas.botonmonedas.*;

import java.awt.*;
import javax.swing.*;

public class JPanelBilletera extends JPanel {
    private Boton100 boton100;
    private Boton500 boton500;
    private Boton1000 boton1000;
    private Boton2000 boton2000;
    private Moneda moneda;

    public JPanelBilletera() {
        setLayout(new GridLayout(2, 2));
        boton100 = new Boton100(this);
        boton500 = new Boton500(this);
        boton1000 = new Boton1000(this);
        boton2000 = new Boton2000(this);

        ButtonGroup monedas = new ButtonGroup();
        monedas.add(boton100);
        monedas.add(boton500);
        monedas.add(boton1000);
        monedas.add(boton2000);

        add(boton100);
        add(boton500);
        add(boton1000);
        add(boton2000);
    }
    public void setTipoMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Moneda getMoneda(){
        return this.moneda;
    }

    public static void main(String[] args) {
        // Crear el JFrame (ventana)
        JFrame frame = new JFrame("Su Monedero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        // Crear una instancia del PanelBilletera
        JPanelBilletera panel = new JPanelBilletera();
        frame.add(panel);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }

}


