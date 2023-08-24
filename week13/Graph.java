
package graphexample;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Arrays;

public class Graph {
    
    private final int  [][] edges;
    private final char [] vertices;
    

    public Graph(int v){
        this.edges = new int[v][v];
        this.vertices    = new char[v];
        
        for(int i = 0; i < v ; i++)
            this.vertices[i] = (char)('A' + i);
    }
    
    public void addEdge(int v1,int v2, int w){
        
        if(v1 >= this.edges.length || v2 >= this.edges.length)
            System.out.println("V1 or V2 can't bigger than Vertices's lenght");
        else{
            this.edges[v1][v2] = w;
            this.edges[v2][v1] = w;
        }
    
    }
    public void printMatrix(){
        
        System.out.print("  ");
        
        for(char i : this.vertices)
            System.out.print(i + " ");
        
        System.out.println();

        
        for (int i = 0 ; i < this.edges.length; i++){
            System.out.print(this.vertices[i] + "|");
            for (int j = 0; j < this.edges.length; j++) {
                System.out.print(edges[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void writeGraphToFile() throws FileNotFoundException, IOException{
        
        try (FileWriter myWriter = new FileWriter("Graph.txt")) {
            
            for(int[]Vertice : this.edges){  
                for( int edge : Vertice)
                    myWriter.write(edge + " ");
            
                myWriter.write("\n");
            }
        }
      System.out.println("Successfully wrote to the file.");
    }
    public void readGraphFromFile() throws FileNotFoundException, IOException{
        BufferedReader bfReader;
        
        bfReader  = new BufferedReader(new FileReader("Graph.txt"));
        System.out.println("File opened Successfully");
        String  line  = bfReader.readLine();
        int i = 0;                
        while(line != null){
            int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();  
            this.edges[i] = numbers;
            line = bfReader.readLine();
            i++;
        }
        bfReader.close();
        
    }
    public void DFS(char s){
        
        int indx = (int)(s - 'A');
        boolean[] visited = new boolean[this.vertices.length];
        Arrays.fill(visited, false);
        
        this.traverseDFS(indx, visited);
        
        
    }
    public void traverseDFS(int vertice, boolean[] visited){
        
        System.out.print((char)('A' + vertice) + " ");
        visited[vertice] = true;
        
        for(int i = 0; i < this.edges.length; i++){
            if(!visited[i] && this.edges[vertice][i] > 0)
                traverseDFS(i, visited);
        }
        
    }
}
    
