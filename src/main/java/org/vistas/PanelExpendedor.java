package org.vistas;
import org.modelos.Expendedor;
import org.modelos.Producto;
import org.modelos.Sprite;
import org.vistas.paneldepositos.JPanelDepositos;
import org.modelos.Selector;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//Se debe instanciar a expendedor
public class PanelExpendedor extends JPanel{
    private Expendedor exp;
    private JPanelDepositos panelDepositos;
    private DepositoEspecial depositoEspecial;
    private ProductoHolder productoHolder;

    public PanelExpendedor(int size, DepositoEspecial depositoEspecial) {
        this.exp = new Expendedor(size);
        this.panelDepositos = new JPanelDepositos(exp);
        panelDepositos.setPreferredSize(new Dimension(440,440));
        this.productoHolder = productoHolder;
        this.depositoEspecial = depositoEspecial;
        add(depositoEspecial);
        add(panelDepositos);
    }
    public void setDepositoEspecial(DepositoEspecial compraExitosa) {
        this.depositoEspecial = compraExitosa;
        add(depositoEspecial);
    }
    public Expendedor getExpendedor(){
        return exp;
    }

    public JPanelDepositos getPanelDepositos(){
        return panelDepositos;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame (ventana)
            JFrame frame = new JFrame("Deposito con respectivo Botón");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            // Crear una instancia de PanelPrincipal y añadirla al JFrame
            DepositoEspecial depositoEspecial = new DepositoEspecial(Selector.SUPER8, new Sprite(123));
            PanelExpendedor panelExpendedor = new PanelExpendedor(5, depositoEspecial);
            frame.add(panelExpendedor);
            // Hacer visible el JFrame
            frame.setVisible(true);
        });
    }


}
