package LSP;

public class ContaSalario {

    private ServicoGerenciadorDeConta servicoGerenciadorDeConta;

    public ContaSalario(ServicoGerenciadorDeConta servicoGerenciadorDeConta){
        this.servicoGerenciadorDeConta = servicoGerenciadorDeConta;
    }

    public double verSaldo(){
        return this.servicoGerenciadorDeConta.verSaldo();
    }

    public double deposita(double valor){
        return this.servicoGerenciadorDeConta.deposita(valor);
    }

    public double saca(double valor){
        return this.servicoGerenciadorDeConta.saca(valor);
    }



}
