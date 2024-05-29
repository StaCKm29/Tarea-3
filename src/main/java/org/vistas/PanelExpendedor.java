package org.vistas;
import org.modelos.Expendedor;

import javax.swing.JPanel;

//Se debe instanciar a expendedor
public class PanelExpendedor extends JPanel{
    //Aqui una variable de tipo Expendedor para poder instanciarla
    //getter expendedor
    //Otra idea seira pasar el expendor para botoncomprar
    private Expendedor exp;

    public PanelExpendedor(int size) {
        this.exp = new Expendedor(size);
    }
    public Expendedor getExpendedor(){
        return exp;
    }
}
