package org.vistas;

import javax.swing.*;
import java.awt.*;

public class JPanelCoca  extends JPanel {
    public JPanelCoca(){
        JButtonCoca coca = new JButtonCoca();
        this.add(coca, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelCoca panelCoca = new JPanelCoca();
            frame.add(panelCoca);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
