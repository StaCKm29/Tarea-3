package org.vistas;

import javax.swing.*;
import java.awt.*;

public class JPanelDepFanta extends JPanel{
    public JPanelDepFanta(){
        JButtonFanta fanta = new JButtonFanta();
        this.add(fanta, BorderLayout.CENTER);
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
