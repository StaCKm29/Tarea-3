package org.vistas;

import org.modelos.*;
import org.vistas.paneldepositos.DepositoEspecial;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que representa un botón de compra
 */
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

        /**
         * En caso de que haya sido presionado, se intenta realizar la compra siempre y
         * cuando se haya seleccionado una moneda y un producto.
         * Estos parametros se pasan a un comprador y despues al deposito especial.
         * Si todo fue exitoso: se elimina el producto del panel de depositos y se agrega al bolsillo (contadores).
         * Además la moneda ingresada, queda en el deposito grafico de monedas del expendedor.
         */
        BotonComprar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    seleccion = comPanel.getTipoProducto();
                    moneda = monedero.getMoneda();
                    comprador = new Comprador(moneda, seleccion, expendedor);
                    depositoEspecial.setProducto(expendedor.getProducto());
                    panelExpendedor.getPanelDepositos().removeProducto(seleccion);
                    panelComprador.getBolsillo().addProducto(expendedor.getProducto());
                    panelExpendedor.getPanelDepositos().actualizarMonedas(moneda);
                    panelComprador.ActualizarBolsilloVuelto(comprador);
                } catch (PagoIncorrectoException ex) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar una moneda.");
                } catch(NoHayProductoException ex) {
                    Moneda moneda = expendedor.getVuelto();
                    JOptionPane.showMessageDialog(null, "No hay stock o el producto no existe. \nVuelto: " + moneda.getValor());
                    panelComprador.ActualizarBolsilloVuelto(comprador);
                    JOptionPane.showMessageDialog(null, "No hay stock o el producto no existe");
                } catch(PagoInsuficienteException ex) {
                    Moneda moneda = expendedor.getVuelto();
                    JOptionPane.showMessageDialog(null, "El pago es insuficiente. \nVuelto: " + moneda.getValor());
                    panelComprador.ActualizarBolsilloVuelto(comprador);
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
}
