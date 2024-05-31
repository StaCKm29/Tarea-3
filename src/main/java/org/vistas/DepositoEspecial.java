package org.vistas;

import org.modelos.Expendedor;
import org.modelos.Producto;
import org.modelos.Selector;

import javax.swing.*;

public class DepositoEspecial extends JPanel {
    private Producto producto;
    private Selector eleccion;

    public DepositoEspecial(Expendedor exp, Selector eleccion){
        this.producto = exp.getProducto();
        this.eleccion = eleccion;
    }

    
}
