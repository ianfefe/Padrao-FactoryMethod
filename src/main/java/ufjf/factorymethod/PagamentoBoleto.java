package ufjf.factorymethod;

public class PagamentoBoleto implements iFormaDePagamento{
    public String pagar() {
        return "Pagamento de boleto concluído.";
    }
    public String estornar() {
        return "A forma de pagamento selecionada não pode ser estornada (Boleto)";
    }
}
