package org.modelos;

/**
 * Comprador representará a un comprador que cuenta con una moneda para pagar, una  elección de producto y un expendedor donde realizará su compra
 */
public class Comprador {
    private String sonido;
    private int vuelto = 0;

    /**
     * Constructor
     * @param m Es la moneda ingresada
     * @param cualProducto Se usa para la elección del producto deseado, 1 para cocacola, 2 para sprite, 3 para fanta, 4 para snickers y 5 para super8
     * @param exp Es el expendedor donde se realizará compra
     */
    public Comprador(Moneda m, Selector cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        exp.comprarProducto(m, cualProducto);
        Producto b1 = exp.getProducto();
        /**
         * Este ciclo se utilizará para que el comprador pueda retirar su vuelto
         */
        while (true) {
            Moneda a = exp.getVuelto();
            if (a == null) {
                break;
            } else {
                vuelto = vuelto + a.getValor();
            }
        }

        if (b1 != null) {
            sonido = b1.consumir();
        }else{
            sonido = null;
        }
    }

    /**
     *
     * @return Retorna el vuelto correspondiente a la compra efectuada
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     *
     * @return Hace saber cuál producto ha comprado el comprador
     */
    public String queConsumiste(){
        return sonido;
    }

}
