package org.vistas.paneldepositos;
import org.modelos.Expendedor;
import org.modelos.Moneda;
import org.modelos.Selector;
import org.vistas.imagenes.*;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que representa el panel de los depósitos
 */
public class JPanelDepositos extends JPanel{
    private DepositoGenerico<ImageSprite> panelSprite;
    private DepositoGenerico<ImageSnickers> panelSnickers;
    private DepositoGenerico<ImageCoca> panelCoca;
    private DepositoGenerico<ImageFanta> panelFanta;
    private DepositoGenerico<ImageSuper8> panelSuper8;
    private DepositoGenerico<ImageAlfajor> panelAlfajor;
    private JPanelMonedas panelMonedas;

    public JPanelDepositos(){
        setOpaque(false);
        setLayout(new GridLayout(7,1));
        this.panelSprite = new DepositoGenerico<>(ImageSprite::new);
        this.panelSnickers = new DepositoGenerico<>(ImageSnickers::new);
        this.panelCoca = new DepositoGenerico<>(ImageCoca::new);
        this.panelFanta = new DepositoGenerico<>(ImageFanta::new);
        this.panelSuper8 = new DepositoGenerico<>(ImageSuper8::new);
        this.panelAlfajor = new DepositoGenerico<>(ImageAlfajor::new);
        this.panelMonedas = new JPanelMonedas();
        add(panelCoca);
        add(panelSprite);
        add(panelFanta);
        add(panelSnickers);
        add(panelAlfajor);
        add(panelSuper8);
        add(panelMonedas);
    }

    public void actualizarMonedas(Moneda moneda){
        panelMonedas.AñadirMonedaGrafica(moneda);
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
    public void rellenarImagenes(){
        panelCoca.rellenarTodo();
        panelFanta.rellenarTodo();
        panelSprite.rellenarTodo();
        panelSnickers.rellenarTodo();
        panelSuper8.rellenarTodo();
        panelAlfajor.rellenarTodo();
        System.out.println("llenado imagenes");
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
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
