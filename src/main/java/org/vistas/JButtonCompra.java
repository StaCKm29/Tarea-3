package org.vistas;

import org.modelos.*;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JButtonCompra extends JPanel {
    private Expendedor expendedor;
    private JPanelSelect comPanel;
    private JPanelBilletera monedero;
    private Selector seleccion;
    private Moneda moneda;
    private Comprador comprador;
    private DepositoEspecial depositoEspecial;
    private JButton BotonComprar= new JButton("Compra");

    public JButtonCompra(PanelExpendedor panelExpendedor, PanelComprador panelComprador) {
        this.expendedor = panelExpendedor.getExpendedor();
        this.comPanel = panelComprador.getPanel();
        this.monedero = panelComprador.getMonedero();
        this.depositoEspecial = panelExpendedor.getDepositoEspecial();
        add(BotonComprar);

        BotonComprar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { //clickea
                try {
                    seleccion = comPanel.getTipoProducto();
                    moneda = monedero.getMoneda();
                    comprador = new Comprador(moneda, seleccion, expendedor);
                    depositoEspecial.setProducto(expendedor.getProducto());
                    //Remueve un producto de la parte gráfica
                    panelExpendedor.getPanelDepositos().removeProducto(seleccion);
                    //panelExpendedor.getPanelDepositos().actualizarMonedas();
                    panelComprador.getBolsillo().addProducto(expendedor.getProducto());
                    panelExpendedor.getPanelDepositos().actualizarMonedas();
                } catch (PagoIncorrectoException ex) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar una moneda");
                } catch(NoHayProductoException ex) {
                    Moneda moneda = expendedor.getVuelto();
                    JOptionPane.showMessageDialog(null, "No hay stock o el producto no existe");
                } catch(PagoInsuficienteException ex) {
                    Moneda moneda = expendedor.getVuelto();
                    JOptionPane.showMessageDialog(null, "El pago es insuficiente");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) { //presionado

            }

            @Override
            public void mouseReleased(MouseEvent e) { //soltado

            }

            @Override
            public void mouseEntered(MouseEvent e) { //entra (por encima)

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
/*
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Compra de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear instancias de PanelExpendedor y PanelComprador
        Expendedor exp = new Expendedor(5);
        JPanelSelect com = new JPanelSelect();
        JPanelBilletera mon = new JPanelBilletera();
        JPanelDepositos pan = new JPanelDepositos(exp);
        JPanelBolsillo bol = new JPanelBolsillo();
        // Inicializar la instancia de JButtonCompra
        JButtonCompra botonCompra = new JButtonCompra(exp, com, mon);

        // Añadir el panel de compra al frame
        frame.add(botonCompra);

        // Configuración y visualización del JFrame
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

 */


}
