public class TipoProblemaServidor implements ITipoProblema{
    private static final TipoProblemaServidor tipoProblemaServidor = new TipoProblemaServidor();
    private TipoProblemaServidor() {};
    public static TipoProblemaServidor getTipoProblemaServidor() {
        return tipoProblemaServidor;
    }
}
