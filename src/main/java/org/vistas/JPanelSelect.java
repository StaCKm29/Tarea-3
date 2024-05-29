package org.vistas;

import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;

public class JPanelSelect extends JPanel {
    private Selector tipo;
    private int i;
    private JButtonSuper8 boton1;
    private JButtonSnickers boton2;
    private JButtonCoca boton3;
    private JButtonFanta boton4;
    private JButtonSprite boton5;
    private JbuttonAlfajor boton6;

    public JPanelSelect(){
        setLayout(new GridLayout(2, 3));
        boton1 = new JButtonSuper8(this);
        boton2 = new JButtonSnickers();
        boton3 = new JButtonCoca();
        boton4 = new JButtonFanta();
        boton5 = new JButtonSprite();
        boton6 = new JbuttonAlfajor();

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
    /*
    public Selector getTipoProducto(){
        if(boton1.isSelected()){
            tipo = Selector.SUPER8;
            i = tipo.ordinal();
        } else if (boton2.isSelected()){
            tipo = Selector.SNICKERS;
            i = tipo.ordinal();
        } else if (boton3.isSelected()){
            tipo = Selector.COCACOLA;
            i = tipo.ordinal();
        } else if (boton4.isSelected()){
            tipo = Selector.FANTA;
            i = tipo.ordinal();
        }else if (boton5.isSelected()){
            tipo = Selector.SPRITE;
            i = tipo.ordinal();
        }else if(boton6.isSelected()){
            tipo = Selector.ALFAJOR;
            i = tipo.ordinal();
        }

        return tipo;
    }

    public int getI(){
        return i;
    }*/
    public void setTipoProducto(Selector selector) {
        this.tipo = selector;
    }
    public Selector getTipoProducto() {
        return this.tipo;
    }

    public static void main (String[] args){
        JFrame frame = new JFrame("Seleccion de Producto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        JPanelSelect panel = new JPanelSelect();
        frame.add(panel);
        frame.setVisible(true);


    }


}
