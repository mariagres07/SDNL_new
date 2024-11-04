package GraphAdjancency;

public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('H');
        graph.addVertex('w');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge('A', 'H', 100);
        graph.addEdge('A', 'W', 800);
        graph.addEdge('H', 'A', 100);
        graph.addEdge('H', 'W', 750);

        graph.print();

    }
}
