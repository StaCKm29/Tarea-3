package org.vistas.paneldepositos;

import javax.swing.*;

public abstract class DepositosMadre extends JPanel {

    public DepositosMadre() {
    }
    //Este metodo es para representar el retiro de un producto del deposito
    public abstract void retiroProducto();

    //Este método es para rellenar el deposito en su totalidad
    public abstract void rellenarTodo();

}
