public class TipoProblemaHardware implements ITipoProblema{
    private static final TipoProblemaHardware tipoProblemaHardware = new TipoProblemaHardware();
    private TipoProblemaHardware() {};
    public static TipoProblemaHardware getTipoProblemaHardware() {
        return tipoProblemaHardware;
    }
}
