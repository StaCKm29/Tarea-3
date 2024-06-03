package org.vistas;

import javax.swing.*;

/**
 * Clase que representa la ventana principal de la aplicación.
 */
public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal = new PanelPrincipal();

    /**
     * Constructor de la clase Ventana.
     * Configura la ventana principal de la aplicación.
     * Agrega el panel principal a la ventana.
     * Hace visible la ventana.
     */
    public Ventana() {
        add(panelPrincipal);
        pack(); // Ajustar el tamaño de la ventana al tamaño preferido de sus componentes
        this.setTitle("Expendedor GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
