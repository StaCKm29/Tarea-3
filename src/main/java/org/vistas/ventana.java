package org.vistas;
import org.vistas.*;
import javax.swing.*;

public class ventana extends JFrame {
    private JPanel PanelPrincipal;
    private JPanel Expendedor;
    private JPanel Comprador;
    private JPanel PanelBolsillo;
    private JPanel PanelSeleccion;
    private JPanel PanelBilletera;

    public ventana() {
        setContentPane(PanelPrincipal);
        setTitle("Expendedor de productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        this.Expendedor = new JPanel();
        this.Comprador = new JPanel();
        this.PanelBolsillo = new JPanelBolsillo();
        this.PanelSeleccion = new JPanelSelect();
        this.PanelBilletera = new JPanelBilletera();
        PanelPrincipal.add(Expendedor);
        PanelPrincipal.add(Comprador);
        PanelPrincipal.add(PanelBolsillo);
        PanelPrincipal.add(PanelSeleccion);
        PanelPrincipal.add(PanelBilletera);
    }

    public static void main(String[] args) {
        new ventana();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
