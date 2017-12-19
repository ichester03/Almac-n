package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static ArrayList<Estanteria> estanterias;
	static ArrayList<HashMap> pedido;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> obj_ps1 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps2 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps3 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps4 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps5 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps6 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps7 = new HashMap<String, Integer>();
		HashMap<String, Integer> obj_ps8 = new HashMap<String, Integer>();

		Estanteria s1 = new Estanteria("s1", "ps1", obj_ps1);
		Estanteria s2 = new Estanteria("s2", "ps2", obj_ps2);
		Estanteria s3 = new Estanteria("s3", "ps3", obj_ps3);
		Estanteria s4 = new Estanteria("s4", "ps4", obj_ps4);
		Estanteria s5 = new Estanteria("s5", "ps5", obj_ps5);
		Estanteria s6 = new Estanteria("s6", "ps6", obj_ps6);
		Estanteria s7 = new Estanteria("s7", "ps7", obj_ps7);
		Estanteria s8 = new Estanteria("s8", "ps8", obj_ps8);
		estanterias = new ArrayList<Estanteria>();
		estanterias.add(s1);
		estanterias.add(s2);
		estanterias.add(s3);
		estanterias.add(s4);
		estanterias.add(s5);
		estanterias.add(s6);
		estanterias.add(s7);
		estanterias.add(s8);

		pedido = new ArrayList<HashMap>();
		HashMap<String, Integer> lineaPedido1 = new HashMap<String, Integer>();
		lineaPedido1.put("patatas", 40);
		lineaPedido1.put("boligrafos", 40);
		lineaPedido1.put("plumas", 10);
		pedido.add(lineaPedido1);

		System.out.println("El pedido contiene: ");
		System.out.println("==============================");

		for (HashMap m : pedido) {
			
			System.out.println("==============================");
			m.forEach((k, v) -> System.out.println("Pedido ===== Key: " + k + ": Value: " + v));

		}
		
		System.out.println("==============================");

		s1.getObjetos().put("patatas", 200);
		s1.getObjetos().put("melones", 100);
		s2.getObjetos().put("boligrafos", 500);
		s3.getObjetos().put("boligrafos", 400);
		s4.getObjetos().put("melocotones", 200);
		s4.getObjetos().put("berzas", 100);
		s5.getObjetos().put("papeles", 500);
		s6.getObjetos().put("boligrafos", 400);

		s1.getObjetos().put("patatas", 400); // lol
		s1.getObjetos().put("melones", 200); // lol

		s7.getObjetos().put("plumas", 500);
		s8.getObjetos().put("plumas", 400);
		s3.getObjetos().put("colonias", 150);
		s4.getObjetos().put("ratones", 210);

		Cruce s = new Cruce("s", "ps");
		Cruce c1 = new Cruce("c1", "pc1");
		Cruce c2 = new Cruce("c2", "pc2");
		Cruce c3 = new Cruce("c3", "pc3");
		Cruce c4 = new Cruce("c4", "pc4");
		Cruce t = new Cruce("t", "pt");

		// grafo de
		// http://geekrai.blogspot.com.es/2014/07/graph-implementation-in-java.html
		Graph<String> graph = new Graph<String>();
		graph.addNewNode("ps1", new Node<String>("pc1", 5));
		graph.addNewNode("pc1", new Node<String>("ps1", 5));
		graph.addNewNode("ps2", new Node<String>("pc2", 5));
		graph.addNewNode("pc2", new Node<String>("ps2", 5));
		graph.addNewNode("ps3", new Node<String>("pc3", 5));
		graph.addNewNode("pc3", new Node<String>("ps3", 5));
		graph.addNewNode("ps4", new Node<String>("pc4", 5));
		graph.addNewNode("pc4", new Node<String>("ps4", 5));

		graph.addNewNode("ps5", new Node<String>("pc1", 5));
		graph.addNewNode("pc1", new Node<String>("ps5", 5));
		graph.addNewNode("ps6", new Node<String>("pc2", 5));
		graph.addNewNode("pc2", new Node<String>("ps6", 5));
		graph.addNewNode("ps7", new Node<String>("pc3", 5));
		graph.addNewNode("pc3", new Node<String>("ps7", 5));
		graph.addNewNode("ps8", new Node<String>("pc4", 5));
		graph.addNewNode("pc4", new Node<String>("ps8", 5));

		graph.addNewNode("ps", new Node<String>("pc1", 10));
		graph.addNewNode("pc1", new Node<String>("ps", 10));
		graph.addNewNode("pc1", new Node<String>("pc2", 10));
		graph.addNewNode("pc2", new Node<String>("pc1", 10));
		graph.addNewNode("pc2", new Node<String>("pc3", 10));
		graph.addNewNode("pc3", new Node<String>("pc2", 10));
		graph.addNewNode("pc3", new Node<String>("pc4", 10));
		graph.addNewNode("pc4", new Node<String>("pc3", 10));
		graph.addNewNode("pc4", new Node<String>("pt", 10));
		graph.addNewNode("pt", new Node<String>("pc4", 10));

		graph.print();
		System.out.println("==============================");
		System.out.println(" Path PS and PC1 exists ? :" + graph.hasRelationship("ps", "pc1"));
		System.out.println(" Path PC1 and PS exists ? :" + graph.hasRelationship("pc1", "ps"));
		System.out.println("==============================");

		s1.getObjetos().forEach((k, v) -> System.out.println("Estantería |S1| ===== Key: " + k + ": Value: " + v));
		s2.getObjetos().forEach((k, v) -> System.out.println("Estantería |S2| ===== Key: " + k + ": Value: " + v));
		s3.getObjetos().forEach((k, v) -> System.out.println("Estantería |S3| ===== Key: " + k + ": Value: " + v));
		s4.getObjetos().forEach((k, v) -> System.out.println("Estantería |S4| ===== Key: " + k + ": Value: " + v));
		s5.getObjetos().forEach((k, v) -> System.out.println("Estantería |S5| ===== Key: " + k + ": Value: " + v));
		s6.getObjetos().forEach((k, v) -> System.out.println("Estantería |S6| ===== Key: " + k + ": Value: " + v));
		s7.getObjetos().forEach((k, v) -> System.out.println("Estantería |S7| ===== Key: " + k + ": Value: " + v));
		s8.getObjetos().forEach((k, v) -> System.out.println("Estantería |S8| ===== Key: " + k + ": Value: " + v));
		System.out.println("==============================");

		restarUds("ps1", "patatas", 100);

		s1.getObjetos().forEach((k, v) -> System.out.println("Estantería |S1| ===== Key: " + k + ": Value: " + v));

		aEstrella(graph, "pc1");
		
		
		
		ArrayList<ElementoAbierto> arraylist = new ArrayList<ElementoAbierto>();
		arraylist.add(new ElementoAbierto("ps1",30));
		arraylist.add(new ElementoAbierto("ps5",45));
		arraylist.add(new ElementoAbierto("pc2",40));
		
		
		for(ElementoAbierto str: arraylist){
			System.out.println(str);
	   }

	   /* Sorting on Rollno property*/
	   System.out.println("RollNum Sorting:");
	   Collections.sort(arraylist, ElementoAbierto.ElementComparator);
	   for(ElementoAbierto str: arraylist){
			System.out.println(str);
	   }
	}

	public static void restarUds(String idEstanteria, String objeto, int unidades) {

		for (Estanteria e : estanterias) {
			if (e.pos.equals(idEstanteria)) {
				if (e.getObjetos().containsKey(objeto)) {
					System.out.println("Existe objeto");

					int actual = e.getObjetos().get(objeto);
					int act = actual - unidades;
					if (act >= 0) {
						e.getObjetos().put(objeto, act);
					} else {
						System.out.println("No hay suficientes " + objeto + " solo hay " + actual + " tu pedido es de "
								+ unidades);
					}

				} else {
					System.out.println("No existe objeto: " + objeto);
				}
			}

		}

	}

	public static <V> void aEstrella(Graph<String> gr, String pos) {

		ArrayList<String> cerrados = new ArrayList();

		cerrados.add(pos);

		int g = 0;
		int h = 0;
		int f = 0;

		System.out.println("lista de ps" + gr.adjacencyList.get(pos));
		List<Node<String>> conexiones = gr.adjacencyList.get(pos);

		for (int i = 0; i < conexiones.size(); i++) {
			System.out.println(pos + "está conectado con " + conexiones.get(i).getName() + " Con peso "
					+ conexiones.get(i).getWeight());

			if (cerrados.contains(conexiones.get(i).getName())) {
				System.out.println("Contiene");
			} else {
				System.out.println("NOOOOOO Contiene");

				g = g + conexiones.get(i).getWeight();
				System.out.println("la g es " + g);
				System.out.println(conexiones.get(i));
				if (esPasillo(conexiones.get(i).name)) {

				h = 10 * pedido.get(0).size();
				System.out.println("la h es " + h);
				f= g+h;
				}else{ //estanteria
				
				int num_coincidencias = compruebaPedidoEstateria(conexiones.get(i).name);
				h = (pedido.get(0).size() - num_coincidencias) * 10;
				System.out.println("la h es " + h);
				f = g + h;
				}
				
				
				
			
			}
			//
			// for (String key : gr.adjacencyList.keySet()) {
			// System.out.println(key);
			// lol(gr, key);
			// System.out.println(gr.adjacencyList.get(key));
			// }
		}
	}

	private static boolean esPasillo(String name) {

		for (Estanteria e : estanterias) {
			if (e.getPos().equals(name)) {
				return false;
			}
		}
		return true;

	}
	
	private static int compruebaPedidoEstateria(String nameEstanteria){
		
		int cant = 0;
		
		for (Estanteria e : estanterias) {
			if (e.getPos().equals(nameEstanteria)) {
				

				
				
				 for (String key : e.getObjetos().keySet()) {
				 
					 if (pedido.get(0).get(key) != null){
						cant++; 
					 }
					 
				 }
				
				
			}
		}
		
		
		
		
		return cant;	
	}

	static void lol(Graph<String> g, String k) {
		List<Node<String>> nodes = g.adjacencyList.get(k);
		for (int i = 0; i < nodes.size(); i++) {
			System.out.println(nodes.get(i).getWeight());
		}
	}

}
