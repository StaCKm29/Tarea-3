package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageSnickers;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
public class JPanelDepSnickers extends DepositosMadre {
    public JPanelDepSnickers(){
        setLayout(new GridLayout(1,5));
        for(int i = 0; i < 5; i++) {
            ImageSnickers snicker = new ImageSnickers();
            snicker.setBorder(new LineBorder(Color.BLACK));
            add(snicker);
        }
    }
    //Probar este método
    public void retiroProducto(){
        if(this.getComponentCount() > 0){
            this.remove(0);
            this.updateUI();
        }
    }

    @Override
    public void rellenarTodo() {
        this.removeAll();
        for(int i = 0; i < 5; i++) {
            ImageSnickers snicker = new ImageSnickers();
            snicker.setBorder(new LineBorder(Color.BLACK));
            add(snicker);
        }
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
