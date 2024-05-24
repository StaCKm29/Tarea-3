package org.vistas;
import javax.swing.JPanel;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal () {
        exp = new PanelExpendedor (..);
        com = new PanelComprador(..);
        this.setBackground(Color.white);
    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}
