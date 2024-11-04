package GraphAdjancency;

public class Graph {

    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
    }

    public Graph(Vertex[] vertexList, int[][] adjacencyMatrix) {
        this.vertexList = vertexList;
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public void addVertex(char node) {
        if (indexVertex(node) == -1) {
            vertexList[countVertex++] = new Vertex(node);
            System.out.println("Vertex" + node + "ditambahkan");
        } else {
            System.out.println("Vertex" + node + "udah ada");
        }
    }

    public void addEdge(int a, int b, int c) {
        if (a >= 0 && a < countVertex && b >= 0 && b < countVertex) {
            adjacencyMatrix[a][b] = c; // Menambahkan bobot edge
            adjacencyMatrix[b][a] = c; // Jika graph tidak berarah, tambahkan kebalikannya
            System.out.println("Edge added between " + vertexList[a].label + " and " + vertexList[b].label);
        } else {
            System.out.println("Invalid vertex index.");
        }
    }

    public void addEdge(char a, char b, int c) {
        if (indexVertex(a) != -1 && indexVertex(b) != -1) {
            addEdge(a, b, c);
        } else {
            System.out.println("tidak ditemukan");
        }
    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].label == label) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println("Vertices:");
        for (int i = 0; i < countVertex; i++) {
            System.out.print(vertexList[i].label + " ");
        }
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices:\n");
        for (int i = 0; i < countVertex; i++) {
            sb.append(vertexList[i].label).append(" ");
        }
        sb.append("\nAdjacency Matrix:\n");
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                sb.append(adjacencyMatrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
