package org.vistas.paneldepositos;

import org.vistas.imagenes.ImageSnickers;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.function.Supplier;
/*
public class DepositoGenerico<T> extends JPanel {
    //Permite crear un objeto de tipo T
    private Supplier<T> tipo;
    private T imagen;

    public DepositoGenerico(Supplier<T> tipo) {
        this.tipo = tipo;
        setLayout(new GridLayout(1,5));
        for(int i = 0; i < 5; i++) {
            T imagen = tipo.get();
            ImageSnickers snicker = new ImageSnickers();
            imagen.setBorder(new LineBorder(Color.BLACK));
            add(imagen);
        }
    }
}
*/