public class TipoProblemaSoftware implements ITipoProblema{
    private static final TipoProblemaSoftware tipoProblemaSoftware = new TipoProblemaSoftware();
    private TipoProblemaSoftware() {};
    public static TipoProblemaSoftware getTipoProblemaSoftware() {
        return tipoProblemaSoftware;
    }
}
