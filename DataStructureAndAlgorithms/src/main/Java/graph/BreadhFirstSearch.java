/*Simple java program for bfs traversal*/

package graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class BreadhFirstSearch {

    private int v;
    //Adjacency list declaration
    private LinkedList<Integer> adj[];

    public BreadhFirstSearch(int n)
    {
        v=n;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    public void addEdge(int s,int d)
    {
        adj[s].add(d);
    }

    public void bfsTraversal(int s)
    {
        LinkedList<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[v];
        Arrays.fill(visited,false);
        queue.add(s);
        visited[s]=true;
        while(queue.isEmpty()==false){
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> it=adj[s].listIterator();
            while (it.hasNext())
            {
                s=it.next();
                if(visited[s]==false) {
                    queue.add(s);
                    visited[s] = true;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        BreadhFirstSearch bfsGraph=new BreadhFirstSearch(4);

        bfsGraph.addEdge(0, 1);
        bfsGraph.addEdge(0, 2);
        bfsGraph.addEdge(1, 2);
        bfsGraph.addEdge(2, 0);
        bfsGraph.addEdge(2, 3);
        bfsGraph.addEdge(3, 3);

        System.out.println("BFS Traversal of Graph");
        bfsGraph.bfsTraversal(2);

    }
}
