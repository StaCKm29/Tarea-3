package org.vistas;

import org.modelos.*;
import org.vistas.*;

import javax.swing.*;
import java.util.Scanner;

public class TestJPanelBolsillo {
    public static void main(String[] args) {
        // Crear un expendedor con 5 productos de cada tipo
        Expendedor expendedor = new Expendedor(5);

        // Crear un JPanelBolsillo
        JPanelBolsillo panelBolsillo = new JPanelBolsillo();

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame("Test JPanelBolsillo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panelBolsillo);
        frame.pack();
        frame.setVisible(true);

        // Agregar productos al panelBolsillo
        for (int i = 0; i < 5; i++) {
            try {
                // Comprar un producto de cada tipo y agregarlo al panelBolsillo
                for (Selector selector : Selector.values()) {
                    System.out.println("Presiona Enter para comprar un " + selector);
                    scanner.nextLine(); // Esperar a que el usuario presione Enter
                    expendedor.comprarProducto(new Moneda1500(i), selector);
                    panelBolsillo.addProducto(expendedor);
                }
            } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
                e.printStackTrace();
            }
        }

        // Crear un JFrame para mostrar el panelBolsillo

    }
}