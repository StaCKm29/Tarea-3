package org.vistas;
import javax.swing.JPanel;
import java.awt.*;
import org.modelos.*;
public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal () {
        exp = new PanelExpendedor ();
        com = new PanelComprador();
        this.setBackground(Color.white);
        this.add(exp);
    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        exp.paintComponent(g);
    }
}
