package OCP;

public class Frete implements ServicoFrete {

    @Override
    public Double calculaFrete(Estado estado, Produto produto) {
        if(estado.equals(Estado.SP))
            return produto.getPreco() * 0.02 + 20;
        else if(estado.equals(Estado.GO))
            return produto.getPreco() * 0.02 + 12;
        else if(estado.equals(Estado.MG))
            return produto.getPreco() * 0.03 + 15;
        return 0d;
    }
}
