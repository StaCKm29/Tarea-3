package org.modelos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor expendedor;
    private Moneda moneda500;
    private Moneda moneda1000;
    private Moneda moneda1500;

    private Selector coca;
    private Selector sprite;
    private Selector fanta;
    private Selector snickers;
    private Selector super8;

    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(2);
        moneda500 = new Moneda500(6);
        moneda1000 = new Moneda1000(4);
        moneda1500 = new Moneda2000(2);

        coca = Selector.COCACOLA;
        sprite = Selector.SPRITE;
        fanta = Selector.FANTA;
        snickers = Selector.SNICKERS;
        super8 = Selector.SUPER8;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test para un solo producto")
    void comprarUnProducto() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        expendedor.comprarProducto(moneda1500, coca);
        assertNotNull(expendedor.getProducto());
    }

    @Test
    @DisplayName("Test para cuando se acaban los productos")
    void testsinProductos() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        expendedor.comprarProducto(moneda500, super8);
        expendedor.comprarProducto(moneda500, super8);
        assertThrows(NoHayProductoException.class, () -> expendedor.comprarProducto(moneda500, super8));
    }

    @Test
    @DisplayName("Test para cuando el pago es insuficiente")
    void testPagoInsuficiente() {
        assertThrows(PagoInsuficienteException.class, () -> expendedor.comprarProducto(moneda500, coca));
    }

    @Test
    @DisplayName("Test para cuando el pago es incorrecto")
    void testPagoIncorrecto() {
        assertThrows(PagoIncorrectoException.class, () -> expendedor.comprarProducto(null, coca));
    }

    @Test
    @DisplayName("Test para obtener el vuelto")
    void testGetVuelto() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        expendedor.comprarProducto(moneda1500, coca);
        expendedor.comprarProducto(moneda500, super8);
        assertNotNull(expendedor.getVuelto());
    }

}