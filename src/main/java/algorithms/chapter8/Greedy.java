package algorithms.chapter8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Greedy {

  public static void main(String[] args) {
    Set<String> statesNeeded = new HashSet<String>();
    statesNeeded.addAll(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

    Map<String, Set<String>> stations = new HashMap<String, Set<String>>();
    stations.put("kone", Set.of("id", "nv", "ut"));
    stations.put("ktwo", Set.of("wa", "id", "mt"));
    stations.put("kthree", Set.of("or", "nv", "ca"));
    stations.put("kfour", Set.of("nv", "ut"));
    stations.put("kfive", Set.of("ca", "az"));

    Set<String> finalStations = new HashSet<String>();
    String bestStation = null;
    while (!statesNeeded.isEmpty()) {
      Set<String> stateCovered = new HashSet<String>();
      for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
        System.out.println(station);
        Set<String> stateForStation = station.getValue();
        Set<String> covered = new HashSet<String>(statesNeeded);
        //Intersection between covered set and stateForStation set
        covered.retainAll(stateForStation);
        if (covered.size() > stateCovered.size()) {
          bestStation = station.getKey();
          stateCovered = covered;
        }
      }
      for (String state : stateCovered) {
        statesNeeded.remove(state);
      }
      finalStations.add(bestStation);   
    }

    System.out.println(finalStations); //[kfour, ktwo, kthree, kfive]
  }
  
}
