package org.vistas;
import javax.swing.JPanel;
import java.awt.*;
import org.modelos.*;
public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp; //static
    public PanelPrincipal () {
        exp = new PanelExpendedor (5);
        com = new PanelComprador();
        this.setBackground(Color.white);
        /*
        //Layout nulo para permitir posicionamiento absoluto
        this.setLayout(null);
        // Posicionar y añadir los paneles al PanelPrincipal
        com.setBounds(50, 50, 200, 200); // Ajusta las coordenadas y el tamaño según sea necesario
        exp.setBounds(300, 50, 200, 200); // Ajusta las coordenadas y el tamaño según sea necesario

        this.add(exp);
        this.add(com);*/
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        //No es necesario llamar a los subpaneles
        //Swing se encarga de redibujar los componentes hijos automáticamente.
    }
}
