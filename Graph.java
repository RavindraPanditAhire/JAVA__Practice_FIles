import java.util.LinkedList;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjacencyList; // Adjacency list

    // Constructor
    Graph(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge
    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source); // For undirected graph
    }

    // Method to print the graph
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjacencyList[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5); // Create a graph with 5 vertices

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Printing the graph
        graph.printGraph();
    }
}
