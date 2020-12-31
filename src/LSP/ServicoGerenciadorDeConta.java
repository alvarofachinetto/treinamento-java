package LSP;

public interface ServicoGerenciadorDeConta {
    public double verSaldo();

    public double deposita(double valor);

    public double saca(double valor);

    public double rende(double taxa);
}
