public class AtendenteNivel3 extends Atendente{
    public AtendenteNivel3(Atendente superior) {
        listaProblemasSuportados.add(TipoProblemaHardware.getTipoProblemaHardware());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Atendente Nível 3";
    }
}
