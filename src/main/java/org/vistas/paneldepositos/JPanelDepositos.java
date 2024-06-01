package org.vistas.paneldepositos;
import org.modelos.Expendedor;
import org.modelos.Moneda;
import org.modelos.Selector;
import org.vistas.ImageMoneda100;
import org.vistas.ImageMoneda500;
import org.vistas.ImageMonedas;
import org.vistas.imagenes.*;
import org.vistas.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que representa el panel de los depósitos
 */
public class JPanelDepositos extends JPanel{
    DepositoGenerico<ImageSprite> panelSprite;
    DepositoGenerico<ImageSnickers> panelSnickers;
    DepositoGenerico<ImageCoca> panelCoca;
    DepositoGenerico<ImageFanta> panelFanta;
    DepositoGenerico<ImageSuper8> panelSuper8;
    DepositoGenerico<ImageAlfajor> panelAlfajor;
    JPanelMonedas panelMonedas;
    Expendedor expendedorAsociado;


    public JPanelDepositos(Expendedor expendedorAsociado){
        setLayout(new GridLayout(7,1));
        this.expendedorAsociado = expendedorAsociado;
        this.panelSprite = new DepositoGenerico<>(ImageSprite::new);
        this.panelSnickers = new DepositoGenerico<>(ImageSnickers::new);
        this.panelCoca = new DepositoGenerico<>(ImageCoca::new);
        this.panelFanta = new DepositoGenerico<>(ImageFanta::new);
        this.panelSuper8 = new DepositoGenerico<>(ImageSuper8::new);
        this.panelAlfajor = new DepositoGenerico<>(ImageAlfajor::new);
        this.panelMonedas = new JPanelMonedas(expendedorAsociado.getDepositoPago());
        add(panelSprite);
        add(panelSnickers);
        add(panelCoca);
        add(panelFanta);
        add(panelAlfajor);
        add(panelSuper8);
        add(panelMonedas);
    }

    public void actualizarMonedas(){
        panelMonedas.graficarMonedas();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepositos panelDepositos = new JPanelDepositos(new Expendedor(5));
            frame.add(panelDepositos);
            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }

    public void removeProducto(Selector seleccion){
        int i = seleccion.ordinal();
        if(i == 0){
            panelCoca.removeProducto();
        } else if(i == 1){
            panelFanta.removeProducto();
        } else if(i == 2){
            panelSprite.removeProducto();
        } else if(i == 3){
            panelSnickers.removeProducto();
        } else if(i == 4){
            panelSuper8.removeProducto();
        } else if(i == 5){
            panelAlfajor.removeProducto();
        }
    }

}
