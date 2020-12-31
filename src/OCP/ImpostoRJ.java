package OCP;

public class ImpostoRJ implements ImpostoRegional{
    @Override
    public Double calcula(Double valor) {
        if(valor <= 300)
            return valor * 0;
        else if (valor > 300 && valor <= 1200)
            return valor * 0.04 + 2;
        else if (valor > 1200 && valor <= 2000)
            return valor * 0.6 + 2;
        return valor * 0.10;
    }
}
