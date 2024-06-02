package org.vistas.paneldepositos;
import org.modelos.Expendedor;
import org.modelos.Moneda;
import org.modelos.Selector;
import org.vistas.imagenes.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que representa el panel de los depósitos graficos (con imagenes).
 */
public class JPanelDepositos extends JPanel{
    private DepositoGenerico<ImageSprite> panelSprite;
    private DepositoGenerico<ImageSnickers> panelSnickers;
    private DepositoGenerico<ImageCoca> panelCoca;
    private DepositoGenerico<ImageFanta> panelFanta;
    private DepositoGenerico<ImageSuper8> panelSuper8;
    private DepositoGenerico<ImageAlfajor> panelAlfajor;
    private JPanelMonedas panelMonedas;

    /**
     * Constructor de la clase. Crea depositos graficos de cada producto.
     * @param size tamaño de los depositos.
     */
    public JPanelDepositos(int size){
        setOpaque(false);
        this.setBackground(Color.GRAY);
        setLayout(new GridLayout(7,1));
        this.panelSprite = new DepositoGenerico<>(ImageSprite::new, size);
        this.panelSnickers = new DepositoGenerico<>(ImageSnickers::new, size);
        this.panelCoca = new DepositoGenerico<>(ImageCoca::new, size);
        this.panelFanta = new DepositoGenerico<>(ImageFanta::new, size);
        this.panelSuper8 = new DepositoGenerico<>(ImageSuper8::new, size);
        this.panelAlfajor = new DepositoGenerico<>(ImageAlfajor::new, size);
        this.panelMonedas = new JPanelMonedas();
        add(panelCoca);
        add(panelSprite);
        add(panelFanta);
        add(panelSnickers);
        add(panelAlfajor);
        add(panelSuper8);
        add(panelMonedas);
    }

    /**
     * Metodo que actualiza la cantidad de monedas en la "caja" del expendedor.
     * @param moneda Moneda que contiene la caja despues de una compra exitosa.
     */
    public void actualizarMonedas(Moneda moneda){
        panelMonedas.AñadirMonedaGrafica(moneda);
    }

    /**
     * Metodo que rellena las imagenes de los depositos.
     * Más fácil de llamar con este metodo desde el PanelExpendedor
     */
    public void rellenarImagenes(){
        panelCoca.rellenarTodo();
        panelFanta.rellenarTodo();
        panelSprite.rellenarTodo();
        panelSnickers.rellenarTodo();
        panelSuper8.rellenarTodo();
        panelAlfajor.rellenarTodo();
    }

    /**
     * Metodo que remueve un producto (imagen) de un deposito.
     * @param seleccion Selector que indica que producto se va a remover.
     */
    public void removeProducto(Selector seleccion){
        int i = seleccion.ordinal();
        switch(i){
            case 0:
                panelCoca.removeProducto();
                break;
            case 1:
                panelFanta.removeProducto();
                break;
            case 2:
                panelSprite.removeProducto();
                break;
            case 3:
                panelSnickers.removeProducto();
                break;
            case 4:
                panelSuper8.removeProducto();
                break;
            case 5:
                panelAlfajor.removeProducto();
                break;
        }
    }
}
