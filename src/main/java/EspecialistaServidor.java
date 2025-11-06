public class EspecialistaServidor extends Atendente {
    public EspecialistaServidor(Atendente superior) {
        listaProblemasSuportados.add(TipoProblemaServidor.getTipoProblemaServidor());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Especialista de Servidor";
    }
}
