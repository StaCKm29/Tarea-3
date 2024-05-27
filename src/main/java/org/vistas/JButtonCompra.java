package org.vistas;

import org.modelos.Expendedor;

import javax.swing.*;
import java.awt.event.*;

public class JButtonCompra extends JPanel  {
    private Expendedor expendedor;
    private JPanelSelect tipoProducto;
    private PanelBilletera tipoMoneda;
    //Objeto fuente
    JRadioButton  BotonComprar= new JRadioButton("Compra");
    public JButtonCompra(Expendedor exp) {
        this.expendedor = exp;
        add(BotonComprar);
    }

}
