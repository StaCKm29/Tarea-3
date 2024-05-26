package org.vistas;
import javax.swing.JPanel;
import java.util.ArrayList;
import org.modelos.*;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
//Se debe instanciar a expendedor
public class PanelExpendedor extends JPanel{
    private Expendedor exp;

    public PanelExpendedor(){
        super();
        //Creacion de grilla de productos 3x2
        setLayout(new GridLayout(3,2));

        //Cargar las imagenes desde el archivo (carpeta resource)
        URL urlCoca = getClass().getClassLoader().getResource("Coca-Cola.png");
        URL urlSprite = getClass().getClassLoader().getResource("sprite.png");
        URL urlFanta = getClass().getClassLoader().getResource("fanta.png");
        URL urlSuper8 = getClass().getClassLoader().getResource("super8.png");
        URL urlSnickers = getClass().getClassLoader().getResource("snickers.png");

        //Crear los ImageIcon con las imagenes cargadas para poder crear JToggleButtons con las imagenes
        ImageIcon iconCoca = new ImageIcon(urlCoca);
        ImageIcon iconSprite = new ImageIcon(urlSprite);
        ImageIcon iconFanta = new ImageIcon(urlFanta);
        ImageIcon iconSuper8 = new ImageIcon(urlSuper8);
        ImageIcon iconSnickers = new ImageIcon(urlSnickers);

        //Crear los JToggleButtons con las imagenes
        ArrayList<JToggleButton> botones = new ArrayList<>();
        botones.add(new JToggleButton(iconCoca));
        botones.add(new JToggleButton(iconSprite));
        botones.add(new JToggleButton(iconFanta));
        botones.add(new JToggleButton(iconSuper8));
        botones.add(new JToggleButton(iconSnickers));

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

        // Crear una instancia del PanelExpendedor
        PanelExpendedor panel = new PanelExpendedor();
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
