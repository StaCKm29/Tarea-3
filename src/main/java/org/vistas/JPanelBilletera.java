package org.vistas;

import org.modelos.*;
import org.vistas.botonmonedas.*;

import java.awt.*;
import javax.swing.*;

/**
 * Clase que representa el panel de Botones de Monedas.
 */
public class JPanelBilletera extends JPanel {
    private Boton100 boton100;
    private Boton500 boton500;
    private Boton1000 boton1000;
    private Boton2000 boton2000;
    private Moneda moneda;

    /**
     * Constructor de la clase JPanelBilletera.
     */
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

    /**
     * Instancia el tipo de moneda que se seleccionó
     * @param moneda Moneda seleccionada.
     */
    public void setTipoMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    /**
     * Retorna la moneda seleccionada.
     * @return Moneda seleccionada.
     */
    public Moneda getMoneda(){
        return this.moneda;
    }

}


