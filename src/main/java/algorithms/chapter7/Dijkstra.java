package algorithms.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Dijkstra {

  public Map<String, String> find(
        Map<String, Map<String, Double>> graph, 
        Map<String, Double> costs, 
        Map<String, String> parents) {

    List<String> processedNode = new ArrayList<String>();
    Dijkstra ds = new Dijkstra();
    String node = ds.findLowestCostNode(costs, processedNode);
    while (Objects.nonNull(node)) {
      Double cost = costs.get(node);
      Map<String, Double> neighbors = graph.get(node); 
      for (Map.Entry<String, Double> neighbor : neighbors.entrySet()) {
        Double newCost = cost + neighbor.getValue();
        Double neigborCost = costs.get(neighbor.getKey());
        if (neigborCost > newCost) {
          costs.put(neighbor.getKey(), newCost);
          parents.put(neighbor.getKey(), node);
        }
      }
      processedNode.add(node);
      node = ds.findLowestCostNode(costs, processedNode);
    }
  
    return parents;
  }


  private String findLowestCostNode(Map<String, Double> costs, List<String> processedNode) {
    Double lowestCost = Double.POSITIVE_INFINITY;
    String lowestCostNode = null; 
    for (Map.Entry<String, Double> element : costs.entrySet()) {
      Double cost = element.getValue();
      if (cost < lowestCost && !processedNode.contains(element.getKey())) {
        lowestCost = cost; 
        lowestCostNode = element.getKey();
      }
    }

    return lowestCostNode;   
  }

}
