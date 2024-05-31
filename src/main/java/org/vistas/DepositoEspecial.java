package org.vistas;

import org.modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DepositoEspecial extends JPanel implements MouseListener {
    private Producto producto;
    private Selector eleccion;
    private ImageIcon icon;
    private JLabel label;
    private ProductoHolder productoHolder;

    public DepositoEspecial(Selector eleccion, Producto producto){
        this.eleccion = eleccion;
        this.producto = producto;
        switch(eleccion) {
            case COCACOLA:
                icon = new ImageIcon(new ImageIcon("src/main/resources/Coca-Cola.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
                break;
            case FANTA:
                icon = new ImageIcon(new ImageIcon("src/main/resources/fanta.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
                break;
            case SPRITE:
                icon = new ImageIcon(new ImageIcon("src/main/resources/sprite.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
                break;
            case SNICKERS:
                icon = new ImageIcon(new ImageIcon("src/main/resources/snickers.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
                break;
            case SUPER8:
                icon = new ImageIcon(new ImageIcon("src/main/resources/super8.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
                break;
            case ALFAJOR:
                icon = new ImageIcon(new ImageIcon("src/main/resources/alfajor.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
                break;
        }
        label = new JLabel(icon);
        add(label);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(this, producto.consumir());
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        // Crear el JFrame
        JFrame frame = new JFrame("Deposito Especial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear instancias de Expendedor y Selector
        Expendedor exp = new Expendedor(5);
        Selector seleccion = Selector.SUPER8; // Puedes cambiar esto a la selección que desees
        Moneda moneda1000 = new Moneda1000(123);
        exp.comprarProducto(moneda1000, seleccion);

        // Inicializar la instancia de DepositoEspecial
        DepositoEspecial depositoEspecial = new DepositoEspecial(seleccion, exp.getProducto());

        // Añadir el panel de DepositoEspecial al frame
        frame.add(depositoEspecial);

        // Configuración y visualización del JFrame
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
