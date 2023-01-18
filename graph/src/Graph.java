import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph
{
    private Map<String, List<String>> adjacencyList;

    public Graph()
    {
        adjacencyList = new HashMap<>();
    }

    public void addNode(String node)
    {
        adjacencyList.put(node, new ArrayList<>());
    }

    public void addEdge(String node1, String node2)
    {
        adjacencyList.get(node1).add(node2);
        adjacencyList.get(node2).add(node1);
    }

    public List<String> getNeighbors(String node)
    {
        return adjacencyList.get(node);
    }

    public void printShortestPath(String root)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        Map<String, Integer> distances = new HashMap<>();
        distances.put(root, 0);
        Map<String, String> parents = new HashMap<>();
        parents.put(root, null);

        while (!queue.isEmpty())
        {
            String current = queue.poll();
            List<String> neighbors = getNeighbors(current);
            for (String neighbor : neighbors)
            {
                if (!distances.containsKey(neighbor))
                {
                    queue.add(neighbor);
                    distances.put(neighbor, distances.get(current) + 1);
                    parents.put(neighbor, current);
                }
            }
        }

        for (String node : distances.keySet())
        {
            List<String> path = new ArrayList<>();
            String current = node;
            while (current != null)
            {
                path.add(current);
                current = parents.get(current);
            }
            Collections.reverse(path);
            System.out.println("Shortest path from " + root + " to " + node + ": " + path + " (distance: " + distances.get(node) + ")");
        }
    }
}
