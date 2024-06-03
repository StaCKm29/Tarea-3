package org.vistas.paneldepositos;

import javax.swing.*;
import java.awt.*;
import java.util.function.Supplier;

/**T extiende a JComponent para poder utilizar setborder y demás métodos de JComponent*/
public class DepositoGenerico<T extends JComponent> extends JPanel {
    //Permite crear un objeto de tipo T
    private Supplier<T> tipo;
    private int size;

    public DepositoGenerico(Supplier<T> tipo, int size) {
        this.size = size;
        this.setBackground(Color.GRAY);
        this.tipo = tipo;
        setLayout(new FlowLayout(FlowLayout.CENTER, -50, 0));
        for(int i = 0; i < 5; i++) {
            T imagen = tipo.get();
            add(imagen);
        }
        setOpaque(false);
    }

    /**
     * Método que permite remover una imagen de un deposito
     */
    public void removeProducto(){
        if(this.getComponentCount() > 0){
            this.remove(0);
            this.updateUI();
        }
    }

    /**
     * Método que permite rellenar todos los depositos hasta la cantidad maxima del expendedor.
     */
    public void rellenarTodo() {
        this.removeAll();
        for(int i = 0; i < size; i++) {
            T imagen = tipo.get();
            add(imagen);
        }
    }
}
