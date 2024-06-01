package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageSnickers;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.function.Supplier;

//T extiende a JComponent para poder utilizar setborder y demás métodos de JComponent
public class DepositoGenerico<T extends JComponent> extends JPanel {
    //Permite crear un objeto de tipo T
    private Supplier<T> tipo;
    private T imagen;

    public DepositoGenerico(Supplier<T> tipo) {
        this.tipo = tipo;
        setLayout(new FlowLayout(FlowLayout.CENTER, -50, 0));
        for(int i = 0; i < 5; i++) {
            T imagen = tipo.get();
            add(imagen);
        }
    }

    public void removeProducto(){
        if(this.getComponentCount() > 0){
            this.remove(0);
            this.updateUI();
        }
    }

    public void rellenarTodo() {
        this.removeAll();
        for(int i = 0; i < 5; i++) {
            T imagen = tipo.get();
            add(imagen);
        }
    }
}
