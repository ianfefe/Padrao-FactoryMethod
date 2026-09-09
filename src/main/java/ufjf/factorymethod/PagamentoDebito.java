package ufjf.factorymethod;

public class PagamentoDebito implements iFormaDePagamento{
    public String pagar() {
        return "Pagamento no débito confirmado.";
    }
    public String estornar() {
        return "Pagamento estornado para a conta";
    }
}
