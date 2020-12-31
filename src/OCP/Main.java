package OCP;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Microondas", 299.99);

        ImpostoRegional impostoRegional = new ImpostoSP();
        ServicoFrete servicoFrete = new Frete();
        ServicoProduto servicoProduto = new ServicoProduto(servicoFrete, Estado.GO);

        double total = servicoProduto.calculaTotalProduto(produto);

        System.out.printf("Valor total %f", total);
    }
}
