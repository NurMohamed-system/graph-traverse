import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Traverse {
  public static void main(String[] args) {
    // See below site for visualization of this graph
    // https://auberonedu.github.io/graph-explore/graph_site/viz.html
    Vertex<Integer> v3  = new Vertex<>(3);
    Vertex<Integer> v7  = new Vertex<>(7);
    Vertex<Integer> v12 = new Vertex<>(12);
    Vertex<Integer> v34 = new Vertex<>(34);
    Vertex<Integer> v56 = new Vertex<>(56);
    Vertex<Integer> v78 = new Vertex<>(78);
    Vertex<Integer> v91 = new Vertex<>(91);
    Vertex<Integer> v45 = new Vertex<>(45);
    Vertex<Integer> v23 = new Vertex<>(23);
    Vertex<Integer> v67 = new Vertex<>(67);

    v3.neighbors  = new ArrayList<>(List.of(v7, v34));
    v7.neighbors  = new ArrayList<>(List.of(v12, v45, v34, v56));
    v12.neighbors = new ArrayList<>(List.of(v7, v56, v78));
    v34.neighbors = new ArrayList<>(List.of(v34, v91)); 
    v56.neighbors = new ArrayList<>(List.of(v78));
    v78.neighbors = new ArrayList<>(List.of(v91));
    v91.neighbors = new ArrayList<>(List.of(v56));
    v45.neighbors = new ArrayList<>(List.of(v23));
    v23.neighbors = new ArrayList<>(List.of());
    v67.neighbors = new ArrayList<>(List.of(v91));

    //Set<Vertex<Integer>> Visited = new HashSet<>();
    //Set<Vertex<?>> Visited = new HashSet<>();
   //  traverse(v3, Visited);
   //traverse(v3);

   int result = sum(v3);
   System.out.println(result);
  }

  public static int sum(Vertex<Integer> current) {
   Set<Vertex<Integer>> Visited = new HashSet<>();
    return sum(current, Visited);
  }

  public static int sum(Vertex<Integer> current, Set(Vertex<Integer>> visited) {
    if (current == null || Visited.contains(current)) return 0;

    Visited.add(current);
    
    int total = 0;
    total += current.data;


    for(Vertex<Integer> neighbor : current.neighbors) {
      int neighnorSum = sum(neighbor, Visited);
      total += neighnorSum;
    }
    return total;
  }

  // 1
  public static <T> void traverse(Vertex<T> current) {
    Set<Vertex<T>> myVisited = new HashSet<>();
    traverse(current, myVisited);
  }

  

// 2
  public static <T> void traverse(Vertex<T> current, Set<Vertex<T>> Visited) {
    if (current == null || Visited.contains(current)) return;
    

    System.out.println(current.data);
    Visited.add(current);

    for (Vertex<?> neighbor : current.neighbors) {
     
    }
    return total;
  }

}
