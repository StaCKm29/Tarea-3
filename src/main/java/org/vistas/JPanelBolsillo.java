package org.vistas;
import org.modelos.*;

import javax.swing.*;


public class JPanelBolsillo extends JPanel {
    private Deposito<Cocacola> cocas;
    private Deposito<Sprite> sprites;
    private Deposito<Fanta> fantas;
    private Deposito<Snickers> snickers;
    private Deposito<Super8> super8s;

    private JLabel cuantasCocas;
    private JLabel cuantasSprites;
    private JLabel cuantasFantas;
    private JLabel cuantosSnickers;
    private JLabel cuantosSuper8s;

    public JPanelBolsillo() {
        cocas = new Deposito<Cocacola>();
        sprites = new Deposito<Sprite>();
        fantas = new Deposito<Fanta>();
        snickers = new Deposito<Snickers>();
        super8s = new Deposito<Super8>();

        cuantasCocas = new JLabel("Cocas: 0");
        cuantasSprites = new JLabel("Sprites: 0");
        cuantasFantas = new JLabel("Fantas: 0");
        cuantosSnickers = new JLabel("Snickers: 0");
        cuantosSuper8s = new JLabel("Super8s: 0");

        add(cuantasCocas);
        add(cuantasSprites);
        add(cuantasFantas);
        add(cuantosSnickers);
        add(cuantosSuper8s);
    }

    public void addProducto(Expendedor exp){
        Producto j = exp.getProducto();
        String tipo = j.consumir();
        if (tipo == "CocaCola") {
            cocas.addObjeto((Cocacola) j);
            cuantasCocas.setText("Cocas: " + cocas.size());
        }
        else if (tipo == "Sprite") {
            sprites.addObjeto((Sprite) j);
            cuantasSprites.setText("Sprites: " + sprites.size());
        }
        else if (tipo == "Fanta") {
            fantas.addObjeto((Fanta) j);
            cuantasFantas.setText("Fantas: " + fantas.size());
        }
        else if (tipo == "Snickers") {
            snickers.addObjeto((Snickers) j);
            cuantosSnickers.setText("Snickers: " + snickers.size());
        }
        else if (tipo == "Super8"){
            super8s.addObjeto((Super8) j);
            cuantosSuper8s.setText("Super8s: " + super8s.size());
        }
    }


}
