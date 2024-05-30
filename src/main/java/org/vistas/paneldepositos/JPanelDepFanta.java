package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageFanta;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
public class JPanelDepFanta extends JPanel{
    public JPanelDepFanta(){
        setLayout(new GridLayout(1,5));
        for(int i = 0; i < 5; i++) {
            ImageFanta fanta = new ImageFanta();
            fanta.setBorder(new LineBorder(Color.BLACK));
            add(fanta);
        }
    }
    //Probar este método
    public void retiroProducto(){
        if(this.getComponentCount() > 0){
            this.remove(0);
            this.updateUI();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepFanta panelFanta = new JPanelDepFanta();
            frame.add(panelFanta);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
