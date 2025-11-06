import java.util.ArrayList;

public abstract class Atendente {
    protected ArrayList<ITipoProblema> listaProblemasSuportados = new ArrayList<>();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior() {
        return atendenteSuperior;
    }

    public void setAtendenteSuperior(Atendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }

    public abstract String getDescricaoNivel();

    public String resolverChamado(Chamado chamado) {
        if (listaProblemasSuportados.contains(chamado.getTipoProblema())) {
            return getDescricaoNivel();
        }
        else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.resolverChamado(chamado);
            }
            else
            {
                return "Sem Solução";
            }
        }
    }

}
