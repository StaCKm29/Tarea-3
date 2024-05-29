package org.vistas;

import org.modelos.Selector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelSelect extends JPanel {
    private Selector tipo;
    private int i;
    private JButtonSuper8 boton1;
    private JButtonSnickers boton2;
    private JButtonCoca boton3;
    private JButtonFanta boton4;
    private JButtonSprite boton5;
    private JbuttonAlfajor boton6;

    public JPanelSelect() {
        setLayout(new GridLayout(2, 3));
        boton1 = new JButtonSuper8();
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
        // Add ActionListeners to each button
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = Selector.SUPER8;
                i = tipo.ordinal();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = Selector.SNICKERS;
                i = tipo.ordinal();
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = Selector.COCACOLA;
                i = tipo.ordinal();
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = Selector.FANTA;
                i = tipo.ordinal();
            }
        });

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = Selector.SPRITE;
                i = tipo.ordinal();
            }
        });

        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipo = Selector.ALFAJOR;
                i = tipo.ordinal();
            }
        });
    }

    public Selector getTipo() {
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
