public class AtendenteNivel1 extends Atendente{
    public AtendenteNivel1(Atendente superior) {
        listaProblemasSuportados.add(TipoProblemaSenha.getTipoProblemaSenha());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Atendente Nível 1";
    }
}
