package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageCoca;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
public class JPanelDepCoca extends JPanel {
    public JPanelDepCoca(){
        setLayout(new GridLayout(1,5));

        for(int i = 0; i < 5; i++) {
            ImageCoca coca = new ImageCoca();
            coca.setBorder(new LineBorder(Color.BLACK));
            add(coca);
        }
        /*
        JButtonCoca coca = new JButtonCoca();
        this.add(coca, BorderLayout.CENTER);*/
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
            frame.setSize(1280, 720);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepCoca panelCoca = new JPanelDepCoca();
            frame.add(panelCoca);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
