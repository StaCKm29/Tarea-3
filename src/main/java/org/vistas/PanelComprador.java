package org.vistas;

import org.modelos.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelComprador extends JPanel{
    private JPanelSelect panel;
    private JPanelBilletera monedero;
    private JPanelBolsillo bolsillo;
    private PanelVueltoComprador vuelto;

    public PanelComprador() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        panel = new JPanelSelect();
        panel.setPreferredSize(new Dimension(600, 200));
        panel.setBorder(new LineBorder(Color.BLACK, 3));
        JPanel panelAjustado = new JPanel(new FlowLayout());
        panelAjustado.add(panel);

        monedero = new JPanelBilletera();
        monedero.setPreferredSize(new Dimension(500, 300));
        JPanel monederoAjustado = new JPanel(new FlowLayout());
        monederoAjustado.add(monedero);
        monederoAjustado.setOpaque(false);//Para que se vea el fondo de la ventana


        bolsillo = new JPanelBolsillo();
        bolsillo.setPreferredSize(new Dimension(100, 100));

        vuelto = new PanelVueltoComprador();
        vuelto.setPreferredSize(new Dimension(600, 200));

        add(bolsillo);
        add(vuelto);
        add(panelAjustado);
        add(monederoAjustado);

    }

    public JPanelSelect getPanel(){
        return panel;
    }

    public JPanelBilletera getMonedero(){
        return monedero;
    }

    public JPanelBolsillo getBolsillo(){
        return bolsillo;
    }

    public void ActualizarBolsilloVuelto(Comprador comprador){
        vuelto.RecibirVuelto(comprador.getMonedasVuelto());
    }

    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        JFrame frame = new JFrame("Container with Custom Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        PanelComprador comprador = new PanelComprador();
        frame.add(comprador);

        frame.setVisible(true);
    }
}
