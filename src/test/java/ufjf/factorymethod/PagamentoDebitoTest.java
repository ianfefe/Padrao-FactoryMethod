package ufjf.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoDebitoTest {

    @Test
    void deveExecutarFormatura() {
        iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Debito");
        assertEquals("Pagamento no débito confirmado.", pagamento.pagar());
    }

    @Test
    void deveCancelarFormatura() {
        iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Debito");
        assertEquals("Pagamento estornado para a conta", pagamento.estornar());
    }
}
