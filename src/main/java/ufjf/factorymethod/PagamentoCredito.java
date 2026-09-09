package ufjf.factorymethod;

public class PagamentoCredito implements iFormaDePagamento {
    public String pagar() {
        return "Pagamento no crédito confirmado.";
    }
    public String estornar() {
        return "O pagamento foi cancelado e constará na próxima fatura.";
    }
}
