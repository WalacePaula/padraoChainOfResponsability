public class Chamado {
    private ITipoProblema tipoProblema;

    public Chamado(ITipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public ITipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(ITipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

}
