package org.vistas.paneldepositos;
import org.modelos.Deposito;
import org.modelos.DepositoMonedas;
import org.modelos.Moneda;
import org.vistas.*;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase que representa el depósito de monedas ingresadas al expendedor
 */

public class JPanelMonedas extends JPanel{
    //Arreglo que ordenará las monedas
    private ArrayList<Integer> monedas = new ArrayList<>();

    /**
     * Constructor de la clase
     */
    public JPanelMonedas(){
        setLayout(new FlowLayout(FlowLayout.CENTER, -25, 10));
    }

    public void AñadirMonedaGrafica(Moneda moneda){
        removeAll();
        monedas.add(moneda.getValor());
        Collections.sort(monedas);
        for(int i = 0 ; i < monedas.size() ; i++){
            JLabel label = new JLabel();
            ImageIcon icon = null;
            if(monedas.get(i) == 100){
                URL urlSnickers = getClass().getClassLoader().getResource("snickers.png");
                URL imagenURL = getClass().getClassLoader().getResource("moneda100.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i) == 500){
                URL imagenURL = getClass().getClassLoader().getResource("moneda500.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i) == 1000){
                URL imagenURL = getClass().getClassLoader().getResource("1000pesos.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i) == 2000){
                URL imagenURL = getClass().getClassLoader().getResource("2000pesos.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            label.setIcon(icon);
            add(label);
        }
        //updateUI();
    }

    //Este método actualiza las monedas mostradas en pantalla en base al depósito de pago en expendedor
    /*
    public void graficarMonedas(){
        removeAll();
        for(int i = 0 ; i < monedaPagoTemp.size() ; i++){
            if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 100){
                add(new ImageMoneda100());
            }
            else if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 500){
                add(new ImageMoneda500());
            }
            else if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 1000){
                add(new ImageMoneda1000());
            }
            else if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 2000){
                add(new ImageMoneda2000());
            }
        }
        revalidate();
        repaint();
    }



     */

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
