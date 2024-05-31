package org.vistas;

import org.modelos.*;
import org.vistas.paneldepositos.JPanelDepositos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JButtonCompra extends JPanel {
    private Expendedor expendedor;
    private JPanelSelect comPanel;
    private JPanelBilletera monedero;
    private JPanelDepositos panelDepositos;
    private JPanelBolsillo panelBolsillo;
    private Selector seleccion;
    private Moneda moneda;
    private DepositoEspecial compraExitosa;
    private ProductoHolder productoHolder;
    //Objeto fuente
    private JButton  BotonComprar= new JButton("Compra");

    public JButtonCompra(Expendedor exp, JPanelSelect comPanel, JPanelBilletera monedero, JPanelDepositos panelDepositos, JPanelBolsillo panelBolsillo) {
        this.expendedor = exp;
        this. comPanel = comPanel;
        this.monedero = monedero;
        this.panelDepositos = panelDepositos;
        this.productoHolder = new ProductoHolder(null);
        this.add(BotonComprar);

        BotonComprar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { //clickea
                try {
                    seleccion = comPanel.getTipoProducto();
                    moneda = monedero.getMoneda();
                    Comprador comprador = new Comprador(moneda, seleccion, expendedor);
                    panelBolsillo.addProducto(expendedor);
                    compraExitosa = new DepositoEspecial(seleccion, exp.getProducto());
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
    public DepositoEspecial getCompraExitosa() {
        return compraExitosa;
    }

    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Compra de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear instancias de PanelExpendedor y PanelComprador
        Expendedor exp = new Expendedor(5);
        JPanelSelect com = new JPanelSelect();
        JPanelBilletera mon = new JPanelBilletera();
        JPanelDepositos pan = new JPanelDepositos();
        JPanelBolsillo bol = new JPanelBolsillo();
        // Inicializar la instancia de JButtonCompra
        JButtonCompra botonCompra = new JButtonCompra(exp, com, mon, pan, bol);

        // Añadir el panel de compra al frame
        frame.add(botonCompra);

        // Configuración y visualización del JFrame
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }


}
