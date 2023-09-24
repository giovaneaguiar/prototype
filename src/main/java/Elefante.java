public class Elefante extends Animal {

    public Elefante(String nome) {
        super(nome, "Elefante");
    }

    @Override
    public Animal clone() {
        return new Elefante(this.getNome());
    }
}
