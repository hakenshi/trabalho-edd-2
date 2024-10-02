public class Embaixador {
    private String nome;
    private String RA;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    public int getIdade() {
        return idade;
    }

    public Embaixador(String nome, String RA, int idade) {
        this.nome = nome;
        this.RA = RA;
        this.idade = idade;
    }
}
