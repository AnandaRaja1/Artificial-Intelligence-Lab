import java.util.*;
import java.io.*;
public class Graph
{
    private int V;
    private LinkedList<Integer>adj[];
    @suppress warnings("unchecked")graph(int v)
{
        V=v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
        adj[i]=new LinkedList();
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    void DFS util(int v,boolean visited[])
    {
        visited [v]=true;
        System.out.print(V+"");
        Iterator<Interger>i= adj[v].ListIterator();
        while(i.hasNext())
        {
            int n =i.next();
            if(!visited[n])
            DFS util(n,visited);
        }
    }
    DFS util(v,visited);
    
}
public static void main(String args[]){
    Graph g = new Graph(101);
    Random rand = new Random();
    int h;
    int a;
    for(int i =0;i<=100;++i){
        h=rand.nextInt(100);
        a=rand.nextInt(100);
        g.addEdge(h,a);
    }
    System.out.println("Following is the Depth first search")
    g.DFS(5);
}
}
