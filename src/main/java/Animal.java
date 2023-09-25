public abstract class Animal implements Cloneable {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public abstract Animal clone();

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
