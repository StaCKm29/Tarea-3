package org.vistas;

import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;

public class JPanelSelect extends JPanel {
    Selector tipo;
    public JPanelSelect(){
        setLayout(new GridLayout(2, 3));
        JButtonSuper8 boton1 = new JButtonSuper8();
        JButtonSnickers boton2 = new JButtonSnickers();
        JButtonCoca boton3 = new JButtonCoca();
        JButtonFanta boton4 = new JButtonFanta();
        JButtonSprite boton5 = new JButtonSprite();

        if(boton1.isSelected()){
            tipo = Selector.SUPER8;
        }
        if(boton2.isSelected()){
            tipo = Selector.SNICKERS;
        }
        if(boton3.isSelected()){
            tipo = Selector.COCACOLA;
        }
        if(boton4.isSelected()){
            tipo = Selector.FANTA;
        }
        if(boton5.isSelected()){
            tipo = Selector.SPRITE;
        }

        ButtonGroup productos = new ButtonGroup();
        productos.add(boton1);
        productos.add(boton2);
        productos.add(boton3);
        productos.add(boton4);
        productos.add(boton5);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }

    public Selector getTipoProducto(){
        return tipo;
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
