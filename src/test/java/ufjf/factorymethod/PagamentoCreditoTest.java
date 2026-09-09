package ufjf.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoCreditoTest {

    @Test
    void deveExecutarFormatura() {
        iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Credito");
        assertEquals("Pagamento no crédito confirmado.", pagamento.pagar());
    }

    @Test
    void deveCancelarFormatura() {
        iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Credito");
        assertEquals("O pagamento foi cancelado e constará na próxima fatura.", pagamento.estornar());
    }
}
