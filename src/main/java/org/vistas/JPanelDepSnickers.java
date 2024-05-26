package org.vistas;

import javax.swing.*;
import java.awt.*;

public class JPanelDepSnickers extends JPanel {
    public JPanelDepSnickers(){
        JButtonSnickers snickers = new JButtonSnickers();
        this.add(snickers, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepSnickers panelSnickers = new JPanelDepSnickers();
            frame.add(panelSnickers);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
