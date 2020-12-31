package OCP;

public class ImpostoGo implements ImpostoRegional{
    @Override
    public Double calcula(Double valor) {
        if(valor <= 100)
            return valor * 0;
        else if (valor > 100 && valor <= 800)
            return valor * 0.02 + 1;
        else if (valor > 800 && valor <= 1500)
            return valor * 0.4 + 2;
        return valor * 0.08;
    }
}
