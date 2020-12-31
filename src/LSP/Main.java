package LSP;

public class Main {
    public static void main(String[] args) {

        ContaSalario contaSalario = new ContaSalario(new GerenciadorDeConta());

        double depositado = contaSalario.deposita(1000);

        System.out.printf("Saldo: "+ depositado);

    }
}
