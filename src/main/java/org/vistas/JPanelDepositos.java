package org.vistas;
import javax.swing.*;
import java.awt.*;

public class JPanelDepositos extends JPanel{
    public JPanelDepositos(){
        setLayout(new GridLayout(6,1));
        JPanelDepSprite panelSprite = new JPanelDepSprite();
        JPanelDepSnickers panelSnickers = new JPanelDepSnickers();
        JPanelDepCoca panelCoca = new JPanelDepCoca();
        JPanelDepFanta panelFanta = new JPanelDepFanta();
        JPanelDepSuper8 panelSuper8 = new JPanelDepSuper8();
        JPanelDepAlfajores panelAlfajor = new JPanelDepAlfajores();
        add(panelSprite);
        add(panelSnickers);
        add(panelCoca);
        add(panelFanta);
        add(panelAlfajor);
        add(panelSuper8);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepositos panelDepositos = new JPanelDepositos();
            frame.add(panelDepositos);
            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
