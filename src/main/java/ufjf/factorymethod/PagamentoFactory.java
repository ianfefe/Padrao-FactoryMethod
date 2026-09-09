package ufjf.factorymethod;

public class PagamentoFactory {

    public static iFormaDePagamento getFormaDePagamento(String formaDePagamento){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("ufjf.factorymethod.Pagamento" + formaDePagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Forma de pagamento não disponível");
        }
        if(!(objeto instanceof iFormaDePagamento)){
            throw new IllegalArgumentException("Forma de pagamento inválida");
        }
        return (iFormaDePagamento) objeto;
    }
}
