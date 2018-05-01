package graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
    //no of vertices in graph
    private int v;

    //Array of adjacency list
    private LinkedList<Integer> adj[];

    //boolean visited array to indicate visited or non visited nodes/vertices
    private boolean[] visited;
    //Constructor in initialize value to v , adj and visited array
    public DepthFirstSearch(int n)
    {
        v=n;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();

        visited=new boolean[v];
        Arrays.fill(visited,false);
    }

    //Method to add new node to the graph
    public void addEdge(int s,int e)
    {
        adj[s].add(e);
    }

    //Method to display Depth first search of a direacted graph
    public void dfs(int s)
    {
        //Display the node
        System.out.print(s+" ");

        //Mark node as visited
        visited[s]=true;

        //Create Iterator to iterate all other nodes
        Iterator<Integer> it=adj[s].listIterator();
        while (it.hasNext())
        {
            s=it.next();
            if(visited[s]==false)
                dfs(s);
        }
    }

    //Main method for the program
    public static void main(String[] args)
    {
        //Instantiating the DepthFirstSearch class
        DepthFirstSearch obj=new DepthFirstSearch(4);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);

        //Calling the dfs method
        obj.dfs(2);
    }
}
