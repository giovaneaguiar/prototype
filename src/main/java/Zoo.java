import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private Map<String, Animal> prototipos = new HashMap<>();

    public Zoo() {
        // Adicione protótipos de animais iniciais
        prototipos.put("Elefante", new Elefante(""));
        prototipos.put("Leao", new Leao(""));
    }

    public void adicionarPrototipo(String nome, Animal animal) {
        prototipos.put(nome, animal);
    }

    public Animal criarAnimal(String tipo, String nome) {
        Animal prototipo = prototipos.get(tipo);
        if (prototipo != null) {
            Animal novoAnimal = prototipo.clone();
            novoAnimal.setNome(nome);
            return novoAnimal;
        } else {
            throw new IllegalArgumentException("Tipo de animal não reconhecido: " + tipo);
        }
    }
}
