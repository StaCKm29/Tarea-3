package org.vistas;

import org.modelos.*;

import javax.swing.*;

public class JPanelBolsillo extends JPanel {
    int cantidadCocas = 0;
    int cantidadSprites = 0;
    int cantidadFantas = 0;
    int cantidadSnickers = 0;
    int cantidadSuper8s = 0;
    int cantidadAlfajores = 0;
    private JLabel cuantasCocas;
    private JLabel cuantasSprites;
    private JLabel cuantasFantas;
    private JLabel cuantosSnickers;
    private JLabel cuantosSuper8s;
    private JLabel cuantosAlfajores;

    public JPanelBolsillo() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        cuantasCocas = new JLabel("Cocas: 0");
        cuantasSprites = new JLabel("Sprites: 0");
        cuantasFantas = new JLabel("Fantas: 0");
        cuantosSnickers = new JLabel("Snickers: 0");
        cuantosSuper8s = new JLabel("Super8s: 0");
        cuantosAlfajores = new JLabel("Alfajores: 0");
        add(cuantasCocas);
        add(cuantasSprites);
        add(cuantasFantas);
        add(cuantosSnickers);
        add(cuantosSuper8s);
        add(cuantosAlfajores);
    }

    public void addProducto(Producto producto){
        if (producto instanceof Cocacola) {
            cantidadCocas++;
            cuantasCocas.setText("Cocas: " + cantidadCocas);
        }
        else if (producto instanceof Sprite) {
            cantidadSprites++;
            cuantasSprites.setText("Sprites: " + cantidadSprites);
        }
        else if (producto instanceof Fanta) {
            cantidadFantas++;
            cuantasFantas.setText("Fantas: " + cantidadFantas);
        }
        else if (producto instanceof Snickers) {
            cantidadSnickers++;
            cuantosSnickers.setText("Snickers: " + cantidadSnickers);
        }
        else if (producto instanceof Super8){
            cantidadSuper8s++;
            cuantosSuper8s.setText("Super8s: " + cantidadSuper8s);
        }
        else if (producto instanceof Alfajor){
            cantidadAlfajores++;
            cuantosAlfajores.setText("Alfajores: " + cantidadAlfajores);
        }
    }
}
