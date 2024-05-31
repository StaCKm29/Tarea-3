package org.vistas.paneldepositos;
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

    public JPanelDepositos(){
        setLayout(new GridLayout(7,1));
        this.panelSprite = new DepositoGenerico<>(ImageSprite::new);
        this.panelSnickers = new DepositoGenerico<>(ImageSnickers::new);
        this.panelCoca = new DepositoGenerico<>(ImageCoca::new);
        this.panelFanta = new DepositoGenerico<>(ImageFanta::new);
        this.panelSuper8 = new DepositoGenerico<>(ImageSuper8::new);
        this.panelAlfajor = new DepositoGenerico<>(ImageAlfajor::new);
        this.panelMonedas = new JPanelMonedas();
        add(panelSprite);
        add(panelSnickers);
        add(panelCoca);
        add(panelFanta);
        add(panelAlfajor);
        add(panelSuper8);
        add(panelMonedas);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            JPanelDepositos panelDepositos = new JPanelDepositos();
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

    public void agregarMoneda(Moneda i){
        if(i.getValor() == 100) {
            ImageMoneda100 m1 = new ImageMoneda100();
            panelMonedas.agregarMoneda(m1);
        }
        else if(i.getValor() == 500){
            ImageMoneda500 m2 = new ImageMoneda500();
            panelMonedas.agregarMoneda(m2);
        }
        else if(i.getValor() == 1000){
            ImageMoneda1000 m3 = new ImageMoneda1000();
            panelMonedas.agregarMoneda(m3);
        }
        else if(i.getValor() == 2000){
            ImageMoneda2000 m4 = new ImageMoneda2000();
            panelMonedas.agregarMoneda(m4);
        }
    }
}
