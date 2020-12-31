package OCP;

public enum Estado {
    SP(new ImpostoSP()),
    MG(new ImpostoMG()),
    RJ(new ImpostoMG()),
    GO(new ImpostoGo());

    private ImpostoRegional impostoRegional;

    Estado(ImpostoRegional impostoRegional) {
        this.impostoRegional = impostoRegional;
    }

    public ImpostoRegional getImpostoRegional() {
        return impostoRegional;
    }
}
