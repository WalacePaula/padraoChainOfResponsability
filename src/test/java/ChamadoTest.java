import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChamadoTest {
    AtendenteNivel1 n1;
    AtendenteNivel2 n2;
    AtendenteNivel3 n3;
    EspecialistaServidor especialista;

    @BeforeEach
    void setUp() {
        especialista = new EspecialistaServidor(null);
        n3 = new AtendenteNivel3(especialista);
        n2 = new AtendenteNivel2(n3);
        n1 = new AtendenteNivel1(n2);
    }

    @Test
    void deveRetornarNivel1ParaResolverSenha() {
        assertEquals("Atendente Nível 1", n1.resolverChamado(new Chamado(TipoProblemaSenha.getTipoProblemaSenha())));
    }

    @Test
    void deveRetornarNivel2ParaResolverSoftware() {
        assertEquals("Atendente Nível 2", n1.resolverChamado(new Chamado(TipoProblemaSoftware.getTipoProblemaSoftware())));
    }

    @Test
    void deveRetornarNivel3ParaResolverHardware() {
        assertEquals("Atendente Nível 3", n1.resolverChamado(new Chamado(TipoProblemaHardware.getTipoProblemaHardware())));
    }

    @Test
    void deveRetornarEspecialistaParaResolverServidor() {
        assertEquals("Especialista de Servidor", n1.resolverChamado(new Chamado(TipoProblemaServidor.getTipoProblemaServidor())));
    }

    @Test
    void deveRetornarSemSolucaoParaProblemaRede() {
        assertEquals("Sem Solução", n1.resolverChamado(new Chamado(TipoProblemaRede.getTipoProblemaRede())));
    }
}
