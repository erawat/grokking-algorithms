package algorithms.chapter7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class DijkstraTest {

  public void testDijkstraFindShortest() {
    Map<String, Map<String, Double>> graph = new HashMap<String, Map<String, Double>>();
    graph.put("start", new HashMap<String, Double>());
    graph.get("start").put("a", Double.valueOf(6));
    graph.get("start").put("b", Double.valueOf(2));
    
    graph.put("a", new HashMap<String, Double>());
    graph.get("a").put("fin", Double.valueOf(1));

    graph.put("b", new HashMap<String, Double>());
    graph.get("b").put("a", Double.valueOf(3));
    graph.get("b").put("fin", Double.valueOf(5));
    
    graph.put("fin", new HashMap<String, Double>());

    Map<String, Double> costs = new HashMap<String, Double>();
    costs.put("a", Double.valueOf(6));
    costs.put("b", Double.valueOf(2));
    costs.put("fin", Double.POSITIVE_INFINITY);

    Map<String, String> parents = new HashMap<String, String>();
    parents.put("a", "start");
    parents.put("b", "start");
    parents.put("fin", null);

    assertEquals(null, parents.get("fin"));

    Dijkstra ds = new Dijkstra();
    parents = ds.find(graph, costs, parents);
    assertEquals("a", parents.get("find"));
  }
  
}
