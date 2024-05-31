package org.modelos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    private Expendedor expendedor;
    private Moneda moneda500;
    private Moneda moneda1000;
    private Moneda moneda1500;

    private Selector coca;
    private Selector sprite;
    private Selector fanta;
    private Selector snickers;
    private Selector super8;

    private Comprador comprador;

    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(2);
        moneda500 = new Moneda500(5);
        moneda1000 = new Moneda1000(2);
        moneda1500 = new Moneda2000(8);

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
    @DisplayName("Test para vuelto")
    void cuantoVuelto() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        comprador = new Comprador(moneda1500, coca, expendedor);
        assertEquals(300, comprador.cuantoVuelto());
    }

    @Test
    void queConsumiste() {
    }
}