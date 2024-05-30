package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageSprite;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class JPanelDepSprite extends DepositosMadre {
    public JPanelDepSprite(){
        setLayout(new GridLayout(1, 5));
        for(int i =0; i < 5; i++){
            ImageSprite sprite = new ImageSprite();
            sprite.setBorder(new LineBorder(Color.BLACK));
            add(sprite);
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
            ImageSprite sprite = new ImageSprite();
            sprite.setBorder(new LineBorder(Color.BLACK));
            add(sprite);
        }
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
