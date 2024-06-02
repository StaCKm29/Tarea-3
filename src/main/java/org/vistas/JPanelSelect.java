package org.vistas;

import org.modelos.Selector;
import org.vistas.botonproductos.*;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que muestra los botones de los productos a seleccionar.
 */
public class JPanelSelect extends JPanel {
    private Selector tipo;
    private JButtonSuper8 boton1;
    private JButtonSnickers boton2;
    private JButtonCoca boton3;
    private JButtonFanta boton4;
    private JButtonSprite boton5;
    private JButtonAlfajor boton6;

    public JPanelSelect(){
        setLayout(new GridLayout(2, 3));
        boton1 = new JButtonSuper8(this);
        boton2 = new JButtonSnickers(this);
        boton3 = new JButtonCoca(this);
        boton4 = new JButtonFanta(this);
        boton5 = new JButtonSprite(this);
        boton6 = new JButtonAlfajor(this);

        ButtonGroup productos = new ButtonGroup();
        productos.add(boton1);
        productos.add(boton2);
        productos.add(boton3);
        productos.add(boton4);
        productos.add(boton5);
        productos.add(boton6);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
    }

    /**
     * Método que establece el tipo de producto seleccionado.
     * @param selector Selector (tipo de producto seleccionado).
     */
    public void setTipoProducto(Selector selector) {
        this.tipo = selector;
    }

    /**
     * Método que retorna el tipo de producto seleccionado.
     * @return Selector (tipo de producto seleccionado).
     */
    public Selector getTipoProducto() {
        return this.tipo;
    }
}
