package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Graph object which maps vertex with nodes
 * 
 * @author Siddheshwar
 * 
 * @param <V>
 */
public class Graph<V> {
	// Vertex i.e. V gets mapped to list of all connecting Nodes.
	Map<V, List<Node<V>>> adjacencyList;
	int verticesCount;
	int edgeCount;

	public Graph() {
		super();
		this.adjacencyList = new HashMap<>();
	}

	/**
	 * Add a new node for the given vertex. Vertex to node connection forms
	 * Edge.
	 * 
	 * @param vertex
	 * @param node
	 */
	public void addNewNode(V vertex, Node<V> node) {
		List<Node<V>> nodes = adjacencyList.get(vertex);
		if (nodes == null || nodes.isEmpty()) {
			nodes = new ArrayList<Node<V>>();
			if(node!=null)
			nodes.add(node);
		} else {
			nodes.add(node);
		}
		adjacencyList.put(vertex, nodes);
	}

	/**
	 * Takes two vertices and checks if there is a path between v1 and v2.
	 * Doesn't take vice-versa.
	 * 
	 * @param v1
	 *            first vertex
	 * @param v2
	 *            second vertex
	 * @return
	 */
	public boolean hasRelationship(V v1, V v2) {
		if (v1 == null && v2 == null)
			return true;
		if (v1 != null && v2 == null)
			return true;
		if (v1 == null && v2 != null)
			return false;

		List<Node<V>> nodes = null;

		if (adjacencyList.containsKey(v1)) {
			nodes = adjacencyList.get(v1);
			if (nodes != null || !nodes.isEmpty()) {
				for (Node<V> v : nodes) {
					if (v.getName().equals(v2))
						return true;
				}
			}
		}
		return false;
	}

	public void print() {
		System.out.println("Graph is --->");
		for (V v : adjacencyList.keySet()) {
			System.out.println(v + " --- " + adjacencyList.get(v));
		}
	}

}
