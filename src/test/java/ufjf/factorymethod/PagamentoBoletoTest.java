package ufjf.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoBoletoTest {

    @Test
    void deveExecutarFormatura() {
        iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Boleto");
        assertEquals("Pagamento de boleto concluído.", pagamento.pagar());
    }

    @Test
    void deveCancelarFormatura() {
        iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Boleto");
        assertEquals("A forma de pagamento selecionada não pode ser estornada (Boleto)", pagamento.estornar());
    }
}
