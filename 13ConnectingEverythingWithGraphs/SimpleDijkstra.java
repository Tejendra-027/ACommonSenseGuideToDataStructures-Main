import java.util.*;

public class SimpleDijkstra {
    public static void main(String[] args) {
        // Create the graph
        Map<String, List<Node>> graph = new HashMap<>();
        graph.put("X", Arrays.asList(new Node("Y", 3), new Node("Z", 7)));
        graph.put("Y", Arrays.asList(new Node("X", 3), new Node("Z", 1), new Node("W", 8)));
        graph.put("Z", Arrays.asList(new Node("X", 7), new Node("Y", 1), new Node("W", 2)));
        graph.put("W", Arrays.asList(new Node("Y", 8), new Node("Z", 2)));

        // Run Dijkstra
        Map<String, Integer> result = dijkstra(graph, "X");

        // Print results
        for (String node : result.keySet()) {
            System.out.println(node + ": " + result.get(node));
        }
    }

    static Map<String, Integer> dijkstra(Map<String, List<Node>> graph, String start) {
        Map<String, Integer> distance = new HashMap<>();
        for (String node : graph.keySet()) {
            distance.put(node, Integer.MAX_VALUE);
        }
        distance.put(start, 0);

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.cost));
        queue.add(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.cost > distance.get(current.name)) continue;

            for (Node neighbor : graph.get(current.name)) {
                int newDist = distance.get(current.name) + neighbor.cost;
                if (newDist < distance.get(neighbor.name)) {
                    distance.put(neighbor.name, newDist);
                    queue.add(new Node(neighbor.name, newDist));
                }
            }
        }

        return distance;
    }

    static class Node {
        String name;
        int cost;

        Node(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }
}
