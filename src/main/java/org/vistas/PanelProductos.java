package org.vistas;

import org.modelos.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class PanelProductos extends JPanel{
    private Expendedor exp;

    public PanelProductos(){
        super();
        //Creacion de grilla de productos 3x2
        setLayout(new GridLayout(3,2));

        JToggleButton coca = new JToggleButton("Precio: $1200");
        JToggleButton sprite = new JToggleButton("Precio: $1200");
        JToggleButton fanta = new JToggleButton("Precio: $1200");
        JToggleButton super8 = new JToggleButton("Precio: $300");
        JToggleButton snickers = new JToggleButton("Precio: $1500");

        //Cargar las imagenes desde el archivo (carpeta resource)
        URL urlCoca = getClass().getClassLoader().getResource("Coca-Cola.png");
        URL urlSprite = getClass().getClassLoader().getResource("sprite.png");
        URL urlFanta = getClass().getClassLoader().getResource("fanta.png");
        URL urlSuper8 = getClass().getClassLoader().getResource("super8.png");
        URL urlSnickers = getClass().getClassLoader().getResource("snickers.png");

        //Crear los ImageIcon con las imagenes cargadas para poder crear JToggleButtons con las imagenes
        int ancho = 150;
        int alto = 170;
        ImageIcon iconCoca = new ImageIcon(new ImageIcon(urlCoca).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSprite = new ImageIcon(new ImageIcon(urlSprite).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconFanta = new ImageIcon(new ImageIcon(urlFanta).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSuper8 = new ImageIcon(new ImageIcon(urlSuper8).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSnickers = new ImageIcon(new ImageIcon(urlSnickers).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        coca.setIcon(iconCoca);
        sprite.setIcon(iconSprite);
        fanta.setIcon(iconFanta);
        super8.setIcon(iconSuper8);
        snickers.setIcon(iconSnickers);

        //Crear los JToggleButtons con las imagenes
        ArrayList<JToggleButton> botones = new ArrayList<>();
        botones.add(coca);
        botones.add(sprite);
        botones.add(fanta);
        botones.add(super8);
        botones.add(snickers);

        //Agrupar los botones para que solo se pueda seleccionar uno a la vez
        ButtonGroup productos = new ButtonGroup();
        for (JToggleButton boton : botones) {
            productos.add(boton);
        }

        //Agregar los botones al panel
        for (JToggleButton boton : botones) {
            add(boton);
        }
    }

    public static void main(String[] args){
        // Crear el JFrame (ventana)
        JFrame frame = new JFrame("Expendedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        // Crear una instancia del PanelProductos
        PanelProductos panel = new PanelProductos();
        frame.add(panel);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(10, 10, 100, 50);
        g.setColor(Color.BLUE);
    }
}
