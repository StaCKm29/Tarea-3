package org.vistas;

import org.modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.text.StyleConstants.setIcon;

public class DepositoEspecial extends JPanel implements MouseListener {
    private Producto producto;
    private Selector eleccion;
    private ImageIcon icon;
    private JLabel label;
    private ProductoHolder productoHolder;

    public DepositoEspecial(Producto producto){
        this.producto = producto;
        setIcon();
        this.addMouseListener(this);


        label = new JLabel(icon);
        add(label);
        this.addMouseListener(this);
    }

    private void setIcon() {
        if(producto == null) {
            icon = null;
        }
        else if (producto instanceof Cocacola) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/Coca-Cola.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        } else if(producto instanceof Fanta) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/fanta.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        } else if(producto instanceof Sprite) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/sprite.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        } else if(producto instanceof Snickers) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/snickers.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        } else if(producto instanceof Super8) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/super8.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        } else if(producto instanceof Alfajor) {
            icon = new ImageIcon(new ImageIcon("src/main/resources/alfajor.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(icon != null) {
            g.drawImage(icon.getImage(), 0, 0, this);
        }
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
        DepositoEspecial depositoEspecial = new DepositoEspecial(exp.getProducto());

        // Añadir el panel de DepositoEspecial al frame
        frame.add(depositoEspecial);

        // Configuración y visualización del JFrame
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
