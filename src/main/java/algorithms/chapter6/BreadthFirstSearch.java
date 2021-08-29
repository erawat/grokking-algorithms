package algorithms.chapter6;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {

  private Boolean search(String name, Map<String, List<String>> graph) {
    Queue<String> searchQueue = new ArrayDeque<String>(graph.get(name));
    List<String> searched = new ArrayList<String>();
    while (!searchQueue.isEmpty()) {
      String personName = searchQueue.remove();
      if (searched.contains(personName)) {
        continue;
      }
      if (isPersonSeller(personName)) {
        System.out.println(personName + " is a mango seller");
        return true;
      }
      searched.add(personName);
      searchQueue.addAll(graph.get(personName));
    }

    return false;    
  }

  private Boolean isPersonSeller(String name) {
    char[] ch = name.toCharArray();

    return ch[0] == 'm';
  }

  public static void main(String[] args) {
    Map<String, List<String>> graph = new HashMap<String, List<String>>();
    graph.put("you", Arrays.asList("alice", "bob", "claire"));
    graph.put("bob", Arrays.asList("anuj", "peggy"));
    graph.put("alice", Arrays.asList("peggy"));
    graph.put("claire", Arrays.asList("thom", "jonny"));
    graph.put("anuj", Arrays.asList());
    graph.put("peggy", Arrays.asList());
    graph.put("thom", Arrays.asList());
    graph.put("jonny", Arrays.asList());

    BreadthFirstSearch bfs = new BreadthFirstSearch();
    bfs.search("you", graph);
  }
  
}
