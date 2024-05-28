package org.vistas;

import org.modelos.*;

import javax.swing.*;
import java.awt.*;

public class JButtonCompra extends JPanel  {
    private PanelExpendedor expPanel;
    private Expendedor expendedor;
    private PanelComprador comPanel;
    private Selector seleccion;
    private Moneda moneda;
    //Objeto fuente
    JRadioButton  BotonComprar= new JRadioButton("Compra");
    public JButtonCompra(PanelExpendedor exp, PanelComprador com) {
        this.expPanel = exp;
        this.expendedor = expPanel.getExpendedor();
        this. comPanel = com;
        this.seleccion= comPanel.getPanel().getTipoProducto();
        this.moneda = comPanel.getMonedero().getMoneda();

        add(BotonComprar);

        if(BotonComprar.isSelected()){
            try {
                expendedor.comprarProducto(moneda, seleccion);
            } catch (PagoIncorrectoException e){
                JOptionPane.showMessageDialog(null, "El pago es incorrecto.");
            } catch (PagoInsuficienteException e){
                Moneda moneda = expendedor.getVuelto();
                JOptionPane.showMessageDialog(null, "El pago es insuficiente.");
            } catch (NoHayProductoException e){
                Moneda moneda = expendedor.getVuelto();
                JOptionPane.showMessageDialog(null, "No hay producto." + seleccion.toString().toLowerCase());
            }
        }
    }

    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Compra de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear instancias de PanelExpendedor y PanelComprador
        PanelExpendedor expPanel = new PanelExpendedor(1);
        PanelComprador comPanel = new PanelComprador();

        // Inicializar la instancia de JButtonCompra
        JButtonCompra botonCompra = new JButtonCompra(expPanel, comPanel);

        // Añadir el panel de compra al frame
        frame.add(botonCompra);

        // Configuración y visualización del JFrame
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

}
