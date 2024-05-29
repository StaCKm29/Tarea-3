package org.vistas;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class JPanelDepAlfajores extends JPanel{
    public JPanelDepAlfajores(){
        setLayout(new GridLayout(1, 5));
        for(int i =0; i < 5; i++){
            ImageAlfajor alfajor = new ImageAlfajor();
            alfajor.setBorder(new LineBorder(Color.BLACK));
            add(alfajor);
        }
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
            frame.setSize(300, 300);

            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepAlfajores panelAlfajores = new JPanelDepAlfajores();
            frame.add(panelAlfajores);

            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
