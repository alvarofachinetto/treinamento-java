package OCP;

public class ImpostoMG implements ImpostoRegional{

    @Override
    public Double calcula(Double valor) {
        if(valor <= 200)
            return valor * 0;
        else if (valor > 200 && valor <= 1000)
            return valor * 0.05 + 2;
        else if (valor > 1000 && valor <= 2000)
            return valor * 0.8 + 2;
        return valor * 0.10;
    }
}
