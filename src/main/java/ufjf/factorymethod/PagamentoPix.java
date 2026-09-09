package ufjf.factorymethod;

public class PagamentoPix {
    public String pagar() {
        return "Pix confirmado.";
    }
    public String estornar() {
        return "Pagamento cancelado, pix estornado com sucesso";
    }
}
