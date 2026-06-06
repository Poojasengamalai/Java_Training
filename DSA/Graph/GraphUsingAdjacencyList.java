package DSA.Graph;

class GNode{
    int vertex;
    GNode next;

    GNode(int vertex){
        this.vertex = vertex;
        this.next = null;
    }
}
class Graphs{
    int numVertices;
    GNode[] adjList;

    Graphs(int vertices){
        numVertices = vertices;
        adjList = new GNode[vertices];
        for(int i=0;i<vertices;i++){
            System.out.println(adjList[i]+" ");
        }
    }

    void addEgde(int source, int destination){
        //add destination to source list
        GNode newNode = new GNode(destination);
        newNode.next = adjList[source];
        adjList[source] = newNode;

        //add source to destination list(undirected graph)
        newNode = new GNode(source);
        newNode.next = adjList[destination];
        adjList[destination] = newNode;
    }

    void printGraph(){
        for(int v=0;v<numVertices;v++){
            System.out.println("Vertex " + v + ": ");
            GNode temp = adjList[v];
            while (temp != null){
                System.out.println(temp.vertex + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
}

public class GraphUsingAdjacencyList {
    public static void main(String[] args) {
        
        Graph gr = new Graph(4);
        gr.addEdge(0,2);
        gr.addEdge(1,3);

        gr.printGraph();
    }
}
