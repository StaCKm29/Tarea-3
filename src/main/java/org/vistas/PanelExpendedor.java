package org.vistas;
import javax.swing.JPanel;

import org.modelos.*;

import java.awt.*;

//Se debe instanciar a expendedor
public class PanelExpendedor extends JPanel{
    private Expendedor exp;

    public PanelExpendedor(){
        super();
        exp = new Expendedor(2);
        this.setBackground(Color.white);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(10, 10, 100, 50);
        g.setColor(Color.BLUE);
    }
}
