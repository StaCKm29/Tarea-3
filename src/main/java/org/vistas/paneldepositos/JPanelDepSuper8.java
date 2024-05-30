package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageSuper8;

import javax.swing.*;
import java.awt.*;

public class JPanelDepSuper8 extends JPanel {

    public JPanelDepSuper8(){
        setLayout(new GridLayout(1, 5));
        for(int i = 0; i < 5; i++){
            ImageSuper8 super8 = new ImageSuper8();
            super8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(super8);
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
            JPanelDepSuper8 panelSuper8 = new JPanelDepSuper8();
            frame.add(panelSuper8);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }

}
