import java.util.Objects;

public class ArvoreBinaria {
    private Embaixador embaixador;
    ArvoreBinaria noEsquerdo;
    ArvoreBinaria noDireito;

    public ArvoreBinaria() {
        this.noEsquerdo = null;
        this.noDireito = null;
    }

    public void arvore(ArvoreBinaria arvore, String nome, String ra, int idade) {
        if (arvore != null) {
            this.embaixador = new Embaixador(nome, ra, idade);
        }
    }

    public void preOrder(ArvoreBinaria arvore) {
        if (arvore != null) {
            System.out.printf("Nome: %s\nRA: %s\nIdade: %d\n", this.embaixador.getNome(), this.embaixador.getRA(), this.embaixador.getIdade());
            preOrder(arvore.noEsquerdo);
            preOrder(arvore.noDireito);
        }
    }

    public void inOrder(ArvoreBinaria arvore) {
        if (arvore != null) {
            inOrder(arvore.noEsquerdo);
            System.out.printf("Nome: %s\nRA: %s\nIdade: %d\n", this.embaixador.getNome(), this.embaixador.getRA(), this.embaixador.getIdade());
            inOrder(arvore.noDireito);
        }
    }

    public void posOrder(ArvoreBinaria arvore) {
        if (arvore != null) {
            posOrder(arvore.noEsquerdo);
            posOrder(arvore.noDireito);
            // Optional: You might want to print something here as well
            // System.out.printf("Nome: %s\nRA: %s\nIdade: %d\n", this.embaixador.getNome(), this.embaixador.getRA(), this.embaixador.getIdade());
        }
    }

    public int nodeCounter(ArvoreBinaria arvore) {
        if (arvore != null) {
            return 1 + nodeCounter(arvore.noEsquerdo) + nodeCounter(arvore.noDireito);
        }

        return 0;
    }

    public int searchNode(ArvoreBinaria arvore, String nome) {
        if (arvore == null) {
            return 0;
        }

        if (Objects.equals(nome, this.embaixador.getNome())) {
            System.out.printf("Nome: %s\nRA: %s\nIdade: %d\n", this.embaixador.getNome(), this.embaixador.getRA(), this.embaixador.getIdade());
            return 1;
        }
        if (searchNode(arvore.noEsquerdo, nome) == 1) {
            return 1;
        }
        return searchNode(arvore.noDireito, nome);
    }

    public int nodeDegree(ArvoreBinaria arvore) {
        int counter = 0;
        if (arvore != null) {
            if (arvore.noEsquerdo != null) {
                counter++;
            }
            if (arvore.noDireito != null) {
                counter++;
            }
        }
        return counter;
    }
}
