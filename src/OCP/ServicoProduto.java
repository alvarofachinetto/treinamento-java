package OCP;

public class ServicoProduto {

    private ServicoFrete frete;

    private Estado estado;

    public ServicoProduto(ServicoFrete frete, Estado estado) {
        this.frete = frete;
        this.estado = estado;
    }

    public Double calculaTotalProduto(Produto produto){
        double valorFrete = frete.calculaFrete(estado, produto);
        double imposto = estado.getImpostoRegional().calcula(produto.getPreco());

        return produto.getPreco() + imposto + valorFrete;
    }

}
