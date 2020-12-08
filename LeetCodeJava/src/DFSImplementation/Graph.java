package DFSImplementation;

import java.util.*;

public class Graph {

    private final Map<Place, List<Place>> graph;

    public Graph() {
        this.graph = new HashMap<>();
    }

    public void addNewPlace(Place place) {
        graph.putIfAbsent(place, new ArrayList<>());
    }

    public void removePlace(Place place) {
        if (!graph.containsKey(place)) {
            throw new IllegalArgumentException("Place is not exist in graph.");
        }
        for (Map.Entry<Place, List<Place>> entry : graph.entrySet()) {
            entry.getValue().remove(place);
        }
        graph.remove(place);
    }

    public void connectPlaces(Place origin, Place destination) {
        if (!graph.containsKey(origin) || !graph.containsKey(destination)) {
            graph.putIfAbsent(origin, new ArrayList<>());
            graph.putIfAbsent(destination, new ArrayList<>());
            graph.get(origin).add(destination);
            graph.get(destination).add(origin);
        }
    }

    public void disconnectPlaces(Place fromDestination, Place toOrigin) {
        if (!graph.containsKey(toOrigin) || !graph.containsKey(fromDestination)) {
            throw new IllegalArgumentException("Origin or destination does not exist in graph.");
        }
        graph.get(toOrigin).remove(fromDestination);
        graph.get(fromDestination).remove(toOrigin);
    }

    public List<Place> getConnected(Place origin) {
        return graph.get(origin);
    }

    public Set<Place> depthFirstTraversal(Graph graph, Place origin) {
        Set<Place> visited = new LinkedHashSet<>();
        Stack<Place> stack = new Stack<>();
        stack.push(origin);
        while (!stack.isEmpty()) {
            Place p = stack.pop();
            if (!visited.contains(p)) {
                visited.add(p);
                for (Place v : getConnected(p)) {
                    stack.push(v);
                }
            }
        }
        return visited;
    }

    public int size() { return graph.size(); }

    public void print() {

        System.out.println("Here is your current graph");
        System.out.println("Your graph has: " + size() + " vertices.");

        for (Map.Entry<Place, List<Place>> graphEntry : graph.entrySet()) {
            System.out.print(graphEntry.getKey().getName() + " is connected to: ");
            Iterator<Place> connectedIterator = graphEntry.getValue().iterator();
            do {
                Place p = connectedIterator.hasNext() ? connectedIterator.next() : null;
                if (p != null && connectedIterator.hasNext()) {
                    System.out.print(p.getName() + ", ");
                } else if (p != null){
                    System.out.println(p.getName() + ".");
                } else {
                    System.out.println();
                }
            } while (connectedIterator.hasNext());
        }
    }
}
