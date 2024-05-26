package org.vistas;

import javax.swing.*;

public class JPanelDepSuper8 extends JPanel {
    public JPanelDepSuper8(){
        JButtonSuper8 super8 = new JButtonSuper8();
        this.add(super8, BorderLayout.CENTER);
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
