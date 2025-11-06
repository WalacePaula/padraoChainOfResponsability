public class TipoProblemaRede implements ITipoProblema{
    private static final TipoProblemaRede tipoProblemaRede = new TipoProblemaRede();

    private TipoProblemaRede() {};

    public static TipoProblemaRede getTipoProblemaRede() {
        return tipoProblemaRede;
    }
}
