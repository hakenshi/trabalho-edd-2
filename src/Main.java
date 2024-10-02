public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();


        arvoreBinaria.arvore(arvoreBinaria, "Felipe", "12345-6", 20);  // Example RA for Felipe

        arvoreBinaria.noEsquerdo = new ArvoreBinaria();
        arvoreBinaria.arvore(arvoreBinaria.noEsquerdo, "Jorge", "23456-7", 20);  // Example RA for Jorge

        arvoreBinaria.noDireito = new ArvoreBinaria();
        arvoreBinaria.arvore(arvoreBinaria.noDireito, "Maria", "34567-8", 20);  // Example RA for Maria


        System.out.println("Pre-order:");
        arvoreBinaria.preOrder(arvoreBinaria);
        System.out.println("\nPost-order:");
        arvoreBinaria.posOrder(arvoreBinaria);
        System.out.println("\nIn-order:");
        arvoreBinaria.inOrder(arvoreBinaria);

        System.out.println("\nQuantidade de nós na árvore: " + arvoreBinaria.nodeCounter(arvoreBinaria));

    }
}