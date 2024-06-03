package org.vistas;

import org.modelos.*;

import javax.swing.*;

/**
 * Clase que representa el panel que muestra los productos que se han agregado al carro.
 */
public class JPanelCarro extends JPanel {
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

    /**
     * Constructor de la clase JPanelCarro.
     */
    public JPanelCarro() {
        JLabel label = new JLabel("CESTA DE COMPRAS: ");
        cuantasCocas = new JLabel("Cocas: 0");
        cuantasSprites = new JLabel("Sprites: 0");
        cuantasFantas = new JLabel("Fantas: 0");
        cuantosSnickers = new JLabel("Snickers: 0");
        cuantosSuper8s = new JLabel("Super8s: 0");
        cuantosAlfajores = new JLabel("Alfajores: 0");
        add(label);
        add(cuantasCocas);
        add(cuantasSprites);
        add(cuantasFantas);
        add(cuantosSnickers);
        add(cuantosSuper8s);
        add(cuantosAlfajores);
    }

    /**
     * Método que agrega un producto al carro.
     * En caso de que el producto ya esté en el carro, se aumenta la cantidad.
     * @param producto Producto comprado exitosamente y debe ser agregado al carro.
     */
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
