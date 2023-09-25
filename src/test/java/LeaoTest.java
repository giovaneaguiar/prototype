import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeaoTest {

    private Zoo zoo;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
    }

    @Test
    public void testCriarLeao() {
        Animal leao = zoo.criarAnimal("Leao", "Simba");
        assertNotNull(leao);
        assertEquals("Leão", leao.getEspecie());
        assertEquals("Simba", leao.getNome());
    }

    @Test
    public void testCloneLeao() {
        Animal leao1 = zoo.criarAnimal("Leao", "Simba");
        Animal leao2 = leao1.clone();

        assertNotSame(leao1, leao2);
        assertEquals(leao1.getEspecie(), leao2.getEspecie());
        assertEquals(leao1.getNome(), leao2.getNome());
    }

    @Test
    public void testCloneLeaoNaoCompartilhaReferencias() {
        Animal leao1 = zoo.criarAnimal("Leao", "Simba");
        Animal leao2 = leao1.clone();

        // Modifique o nome do leao2
        leao2.setNome(leao2.getNome().replaceAll("Simba", "NovoNome"));

        // Verifique se os nomes são diferentes
        assertNotEquals(leao1.getNome(), leao2.getNome());
    }
}
