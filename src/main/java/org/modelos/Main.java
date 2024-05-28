package org.modelos;

public class Main {
    public static void main(String[] args) {
        Moneda m1 = new Moneda1000(123);
        Moneda m5 = new Moneda500(321);
        Expendedor exp = new Expendedor(5);
        /**
         * Se intenta comprar un producto con una moneda especificando qué producto y el expendedor
         * En caso que la moneda no se haya instanciado correctamente, entra en el primer catch.
         * En caso que no haya stock o que el producto no exista, se entra en el segundo catch.
         * En caso que la moneda sea insuficiente para pagar el producto deseado, se entra en el tercer catch.
         */

        try {
            Selector eleccion = Selector.SUPER8;
            Comprador c4 = new Comprador(m1, eleccion, exp);
            System.out.println(c4.queConsumiste() + ", " + c4.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + "Vuelto: " + moneda.getValor() + "\n");
        }

        //Caso donde se compra hasta agotar stock
        try {
            Selector eleccion = Selector.SUPER8;
            for (int i = 0; i <= 5; i++) {
                Comprador c3 = new Comprador(m5, eleccion, exp);
                System.out.println(c3.queConsumiste() + ", " + c3.cuantoVuelto());
            }

        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + " Vuelto: " + moneda.getValor() + "\n");
        } catch (PagoInsuficienteException e) {
            Moneda moneda = exp.getVuelto();
            System.out.println(e.getMessage() + " Vuelto: " + moneda.getValor() + "\n");
        }
    }
}