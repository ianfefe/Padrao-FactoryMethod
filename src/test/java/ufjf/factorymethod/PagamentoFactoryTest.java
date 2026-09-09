package ufjf.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaFormaDePagamentoInexistente() {
        try {
            iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Dinheiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento não disponível", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFormaDePagamentoInválida() {
        try {
            iFormaDePagamento pagamento = PagamentoFactory.getFormaDePagamento("Pix");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento inválida", e.getMessage());
        }
    }
}