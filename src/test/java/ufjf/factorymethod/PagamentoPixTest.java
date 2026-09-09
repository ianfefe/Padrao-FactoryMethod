package ufjf.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoPixTest {

    @Test
    void deveExecutarFormatura() {
        PagamentoPix pagamento = new PagamentoPix();
        assertEquals("Pix confirmado.", pagamento.pagar());
    }

    @Test
    void deveCancelarFormatura() {
        PagamentoPix pagamento = new PagamentoPix();
        assertEquals("Pagamento cancelado, pix estornado com sucesso", pagamento.estornar());
    }
}
