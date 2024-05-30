package org.vistas;

import org.modelos.Moneda;
import org.modelos.Moneda100;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class PanelBilletera extends JPanel {
    Random rand = new Random();
    int randomNum;
    private Moneda moneda;

    public PanelBilletera() {
        this.randomNum = rand.nextInt(100);
        //Creacion de una grilla de 2x2 para las 4 monedas
        setLayout(new GridLayout(2,2));

        //Cargar las imagenes desde el archivo (carpeta resource)
        URL url500 = getClass().getClassLoader().getResource("moneda500.png");
        URL url100 = getClass().getClassLoader().getResource("moneda100.png");
        URL urlMil = getClass().getClassLoader().getResource("1000pesos.png");
        URL urlDosMil = getClass().getClassLoader().getResource("2000pesos.png");

        //Crear los ImageIcon con las imagenes cargadas para poder crear JToggleButtons con las imagenes
        ImageIcon icon500 = new ImageIcon(new ImageIcon (url500).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon icon100 = new ImageIcon(new ImageIcon (url100).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon iconMil = new ImageIcon(new ImageIcon (urlMil).getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT));
        ImageIcon iconDosMil = new ImageIcon(new ImageIcon (urlDosMil).getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT));

        ArrayList<JRadioButton> botones = new ArrayList<>();

        JRadioButton boton100 = new JRadioButton(icon100);
        boton100.addMouseListener(new MonedaMouseListener(new Moneda100(randomNum)));
        JRadioButton boton500 = new JRadioButton(icon500);
        boton500.addMouseListener(new MonedaMouseListener(new Moneda500(randomNum)));
        JRadioButton boton1000 = new JRadioButton(iconMil);
        boton1000.addMouseListener(new MonedaMouseListener(new Moneda1000(randomNum)));
        JRadioButton boton2000 = new JRadioButton(iconDosMil);
        boton2000.addMouseListener(new MonedaMouseListener(new Moneda2000(randomNum)));

        botones.add(boton100);
        botones.add(boton500);
        botones.add(boton1000);
        botones.add(boton2000);

        //Agrupar los botones para que solo se pueda seleccionar uno a la vez
        ButtonGroup monedero = new ButtonGroup();
        for (JRadioButton boton : botones) {
            monedero.add(boton);
        }

        //Agregar los botones al panel
        for (JToggleButton boton : botones) {
            add(boton);
        }
    }

    private class MonedaMouseListener implements MouseListener {
        private Moneda monedaAsociada;

        public MonedaMouseListener(Moneda moneda) {
            this.monedaAsociada = moneda;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            moneda = monedaAsociada;
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

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


