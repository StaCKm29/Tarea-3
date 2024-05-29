package org.vistas;
import org.modelos.Expendedor;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//Se debe instanciar a expendedor
public class PanelExpendedor extends JPanel{
    //Aqui una variable de tipo Expendedor para poder instanciarla
    //getter expendedor
    //Otra idea seira pasar el expendor para botoncomprar
    private Expendedor exp;

    public PanelExpendedor(int size) {
        this.exp = new Expendedor(size);
        JPanelDepositos panelDepositos = new JPanelDepositos();
        panelDepositos.setPreferredSize(new Dimension(440,440));
        add(panelDepositos);

    }
    public Expendedor getExpendedor(){
        return exp;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            PanelExpendedor panelExpendedor = new PanelExpendedor(5);
            frame.add(panelExpendedor);
            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }
}
