import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElefanteTest {

    private Zoo zoo;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
    }

    @Test
    public void testCriarElefante() {
        Animal elefante = zoo.criarAnimal("Elefante", "Dumbo");
        assertNotNull(elefante);
        assertEquals("Elefante", elefante.getEspecie());
        assertEquals("Dumbo", elefante.getNome());
    }

    @Test
    public void testCloneElefante() {
        Animal elefante1 = zoo.criarAnimal("Elefante", "Dumbo");
        Animal elefante2 = elefante1.clone();

        assertNotSame(elefante1, elefante2);
        assertEquals(elefante1.getEspecie(), elefante2.getEspecie());
        assertEquals(elefante1.getNome(), elefante2.getNome());
    }

    @Test
    public void testCloneElefanteNaoCompartilhaReferencias() {
        Animal elefante1 = zoo.criarAnimal("Elefante", "Dumbo");
        Animal elefante2 = elefante1.clone();

        // Modifique o nome do elefante2
        elefante2.setNome(elefante2.getNome().replaceAll("Dumbo", "NovoNome"));

        // Verifique se os nomes são diferentes
        assertNotEquals(elefante1.getNome(), elefante2.getNome());
    }
}
