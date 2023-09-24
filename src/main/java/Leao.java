public class Leao extends Animal {

    public Leao(String nome) {
        super(nome, "Leão");
    }

    @Override
    public Animal clone() {
        return new Leao(this.getNome());
    }
}
