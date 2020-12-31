package OCP;

public class ImpostoSP implements ImpostoRegional{


    public Double calcula(Double valor){
        if(valor <= 500)
            return valor * 0;
        else if (valor > 500 && valor <= 1500)
            return valor * 0.05;
        else if (valor > 1500 && valor <= 2000)
            return valor * 0.10;
        return valor * 0.15;
    }
}
