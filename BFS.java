import java.io.*;
import java.util.*;
class Graph
{
private int V;
private LinkedList<Integer>adj[];
Graph(int V)
{
V=v;
adj = new LinkedList[v];
for(int i=0;i<v;i++);
adj[i] = new LinkedList();
dEdge(int v,int w)
[v].add(w);
S(int s)
lean visited [] = new boolean[v];
LinkedList<Integer>queue = new LinkedList<Integer>();
visited[s]=true;
queue.add(s);

while(queue.size()!=0){
s=queue.poll();
System.out.print(s+"");
Iterator<Integer>!= adj[s].ListIterator();
while(i.hasNext())
[
int n =i.next();
if(!visited[n])
{
visited[n] = true;
queue.add(n);
}
}
}
}

public static void main(String args[])
{
Graph g = new Graph(100);
Random vand = new Random();
int h;
int a;

for(int i=0;i<=100;i++){
h=rand.nexInt(100);
a=rand.nextInt(100);
g.addEdge(h,a);
}
System.out.println("Following is Breadth First Search"+"(Starting from vertex2)");
g.BFS(2);
}
}
