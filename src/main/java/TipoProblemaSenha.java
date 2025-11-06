public class TipoProblemaSenha implements ITipoProblema {
    private static final TipoProblemaSenha tipoProblemaSenha = new TipoProblemaSenha();
    private TipoProblemaSenha() {};
    public static TipoProblemaSenha getTipoProblemaSenha() {
        return tipoProblemaSenha;
    }
}
