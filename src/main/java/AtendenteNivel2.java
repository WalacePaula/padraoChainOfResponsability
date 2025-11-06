public class AtendenteNivel2 extends Atendente{
    public AtendenteNivel2(Atendente superior) {
        listaProblemasSuportados.add(TipoProblemaSoftware.getTipoProblemaSoftware());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Atendente Nível 2";
    }
}
