package org.vistas;

import javax.swing.*;
import java.awt.*;

public class JPanelDepSprite extends JPanel {
    public JPanelDepSprite(){
        JButtonSprite sprite = new JButtonSprite();
        this.add(sprite, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepSprite panelSprite = new JPanelDepSprite();
            frame.add(panelSprite);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }

}
