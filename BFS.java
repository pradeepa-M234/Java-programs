import java.util;
public class BFS{
     PrivatefinalList<List<Integer>>adjlist;
     public BFS (int vertices){
      adjlist=new Arraylist<>();
      for (int i=0;i< vertices;i++){
          adjlist.add (new Arraylist<>());
      }
}
public void addEdge(int u ,int v){
     adjlist.get(u).add(v);
     adjlist.get(v).add(u);
}
public void BFS (int start){
  boolean[] visited =new Boolean [adjlist.size()];
  LinkedList <Integer> queue =new Linkedlist<>();
  visited [start]=true;
  queue.add(start);
  while(! queue.isEmpty()){
    int node=queue.poll();
    System.out.println(node+ " ");
    for (int neighbour :adjlist.get (node)) {
        if (! visited [neighbour]){
            visited [neighbour]= true;
            queue.add(neighbour);
        }
     }
  }
}
public static void main(String []args){
     BFS graph=new BFS(5);
     graph.addEdge(0,1);
     graph.addEdge(0,2);
     graph.addEdge(1,3);
     graph.addEdge(2,4);
     System.out.println("BFS starting from node 0:");
     graph.bfs(0);
     }
}



