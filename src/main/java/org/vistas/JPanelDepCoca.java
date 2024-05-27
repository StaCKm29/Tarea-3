package org.vistas;

import javax.swing.*;
import java.awt.*;

public class JPanelDepCoca extends JPanel {
    public JPanelDepCoca(){
        setLayout(new GridLayout(1,5));

        for(int i = 0; i < 5; i++) {
            ImageCoca coca = new ImageCoca();
            add(coca);
        }
        /*
        JButtonCoca coca = new JButtonCoca();
        this.add(coca, BorderLayout.CENTER);*/
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepCoca panelCoca = new JPanelDepCoca();
            frame.add(panelCoca);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
