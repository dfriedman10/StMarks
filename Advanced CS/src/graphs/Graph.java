package graphs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph<E> {
	
	HashMap<E, Vertex> vertices;
	
	public Graph() {
		vertices = new HashMap<E, Vertex>();
	}
	
	public void addVertex(E info) {
		vertices.put(info, new Vertex(info));
	}
	
	public void connect(E info1, E info2) {
		Vertex v1 = vertices.get(info1);
		Vertex v2 = vertices.get(info2);
		
		
		
		v1.neighbors.add(v2);
		v2.neighbors.add(v1);
	}

	
	
	private class Vertex {
		E info;
		HashSet<Vertex> neighbors;
		
		public Vertex(E info) {
			this.info = info;
			neighbors = new HashSet<Vertex>();
		}
	}
	
	
	public void BFS(E start, E target) {
		
		ArrayList<Vertex> toVisit = new ArrayList<Vertex>();
		toVisit.add(vertices.get(start));
		HashSet<Vertex> visited = new HashSet<Vertex>();
		visited.add(vertices.get(start));
		
		HashMap<Vertex, Vertex> leadsTo = new HashMap<Vertex, Vertex>();
		
		while (!toVisit.isEmpty()) {
			
			Vertex curr = toVisit.remove(0);
			
			for (Vertex neighbor : curr.neighbors) {
				
				if (visited.contains(neighbor)) continue;
				
				if (neighbor.info.equals(target)) {
					
					//backTrace(target, start, leadsTo);
					return;
				}
				
				else {
					toVisit.add(neighbor);
					visited.add(neighbor);
					leadsTo.put(neighbor, curr);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Graph<String> g = new Graph<String>();
		
		g.addVertex("Reina");
		g.addVertex("Veronika");
		g.addVertex("Felicity");
		g.addVertex("Andria");
		g.addVertex("Elgin");
		
		g.connect("Reina","Veronika");
		g.connect("Reina", "Felicity");
		g.connect("Felicity", "Andria");
		g.connect("Felicity", "Elgin");
		
		g.BFS("Reina", "Elgin");
	}
}
