
package graphexample;
import java.io.IOException;
import  java.util.Random;

public class GraphExample {

    public static void main(String[] args) throws IOException {
        Graph g = new Graph(10);

        generateEdges(10, g);
        //g.printMatrix();
        //g.writeGraphToFile();
        //g.readGraphFromFile();
        
        g.printMatrix();
        //g.DFS('A');
    }
    
    public static void generateEdges(int n ,Graph g){
        
        Random r = new Random();
        int w;
        for(int i = 0; i < n; i++){
            for(int j = i + 1 ; j < n; j++){
                w = r.nextInt(10);
                g.addEdge(i, j, w);
                //g.addEdge(j, i, w);
            }
        }
    }
    
}
