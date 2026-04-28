package graph;

public class Grafo1 {


    private int [][] matriz; // Definindo a matriz bidimencional
    private int numVertices; // definindo int numero de vertices

    public Grafo1(int numVertices) {

    this.numVertices = numVertices;
    this.matriz = new int[numVertices][numVertices];
    }
//    Grafo n Orientado
    public void adicionarAresta(int origem, int destino){
        matriz[origem][destino] = 1;
        matriz[destino][origem] = 1; // garantindo a Simetria
    }

//    Digrafo
    public void adicionarArco(int origem, int destino){
        matriz[origem][destino] = 1; // Sem simetria, apenas um sentido

    }
    public void mostrarMatriz() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 1. Criamos um grafo com 4 vértices (0, 1, 2, 3) [cite: 112]
        Grafo1 meuGrafo = new Grafo1(4);

        // 2. Adicionamos conexões (Arestas)
        meuGrafo.adicionarAresta(0, 1); // Conecta 0 e 1 nos dois sentidos
        meuGrafo.adicionarAresta(1, 2); // Conecta 1 e 2 nos dois sentidos

        // 3. Adicionamos um arco (Dígrafo - apenas um sentido) [cite: 22]
        meuGrafo.adicionarArco(2, 3); // Apenas de 2 para 3

        System.out.println("Grafo criado com sucesso!");
        meuGrafo.mostrarMatriz();
        // Dica: Para ver o resultado, seria bom criar um método para imprimir a matriz
    }
}
