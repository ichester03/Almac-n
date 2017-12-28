package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static ArrayList<Estanteria> estanterias;
	static HashMap<String, Integer> pedido;

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

		pedido = new HashMap<String, Integer>();
		pedido.put("patatas", 40);
		pedido.put("boligrafos", 40);
		pedido.put("plumas", 10);

		System.out.println("El pedido contiene: ");
		System.out.println("==============================");

		pedido.forEach((k, v) -> System.out.println("Pedido ===== Key: " + k + ": Value: " + v));

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
		System.out.println("==========================================================================");

		s1.getObjetos().forEach((k, v) -> System.out.println("Estantería |S1| ===== Key: " + k + ": Value: " + v));
		s2.getObjetos().forEach((k, v) -> System.out.println("Estantería |S2| ===== Key: " + k + ": Value: " + v));
		s3.getObjetos().forEach((k, v) -> System.out.println("Estantería |S3| ===== Key: " + k + ": Value: " + v));
		s4.getObjetos().forEach((k, v) -> System.out.println("Estantería |S4| ===== Key: " + k + ": Value: " + v));
		s5.getObjetos().forEach((k, v) -> System.out.println("Estantería |S5| ===== Key: " + k + ": Value: " + v));
		s6.getObjetos().forEach((k, v) -> System.out.println("Estantería |S6| ===== Key: " + k + ": Value: " + v));
		s7.getObjetos().forEach((k, v) -> System.out.println("Estantería |S7| ===== Key: " + k + ": Value: " + v));
		s8.getObjetos().forEach((k, v) -> System.out.println("Estantería |S8| ===== Key: " + k + ": Value: " + v));
		System.out.println("=====================================================================");

		s1.getObjetos().forEach((k, v) -> System.out.println("Estantería |S1| ===== Key: " + k + ": Value: " + v));

		ArrayList<Elemento> fin = aEstrella(graph, "ps");
		System.out.println("=====================================================================");
		System.out.println("El camino a recorrer es: ");
		for (int j = fin.size() - 1; j >= 0; j--) {
			Elemento e = fin.get(j);
			System.out.print(e.getId().toUpperCase() + "->");

		}

		System.out.println("");
		System.out.println("=====================================================================");
		System.out.println("Las estanterías se quedan con:");

		s1.getObjetos().forEach((k, v) -> System.out.println("Estantería |S1| ===== Key: " + k + ": Value: " + v));
		s2.getObjetos().forEach((k, v) -> System.out.println("Estantería |S2| ===== Key: " + k + ": Value: " + v));
		s3.getObjetos().forEach((k, v) -> System.out.println("Estantería |S3| ===== Key: " + k + ": Value: " + v));
		s4.getObjetos().forEach((k, v) -> System.out.println("Estantería |S4| ===== Key: " + k + ": Value: " + v));
		s5.getObjetos().forEach((k, v) -> System.out.println("Estantería |S5| ===== Key: " + k + ": Value: " + v));
		s6.getObjetos().forEach((k, v) -> System.out.println("Estantería |S6| ===== Key: " + k + ": Value: " + v));
		s7.getObjetos().forEach((k, v) -> System.out.println("Estantería |S7| ===== Key: " + k + ": Value: " + v));
		s8.getObjetos().forEach((k, v) -> System.out.println("Estantería |S8| ===== Key: " + k + ": Value: " + v));
		System.out.println("=====================================================================");
	}

	public static void restarUds(String idEstanteria, String objeto, int unidades) {

		for (Estanteria e : estanterias) {
			if (e.pos.equals(idEstanteria)) {
				if (e.getObjetos().containsKey(objeto)) {
					System.out.println("Cogemos objeto:| " + objeto.toUpperCase() + "(" + unidades + ")"
							+ "  |De la Estantería:|" + idEstanteria.toUpperCase() + "|");

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

	public static ArrayList<Elemento> aEstrella(Graph<String> gr, String pos) {

		System.out.println("===========================================");
		System.out.println("COMIENZA EL ALGORITMO");
		System.out.println("===========================================");

		ArrayList<Elemento> abiertos = new ArrayList<Elemento>();
		ArrayList<Elemento> cerrados = new ArrayList<Elemento>();

		int dist = caculaDistH(pos);
		Elemento primero = new Elemento(pos, 0, dist, null);

		abiertos.add(primero);
		String caminoActual = "";
		Boolean done = false;

		Elemento actual = primero;

		// COMIENZA EL ALGORITMO
		while (!done) {

			if (abiertos.isEmpty()) { // no path exists
				return null; // return empty list
			}

			actual = mejorCandidatoEnAbiertos(abiertos); // el nodo con mejor f
															// de la lista de
															// abiertos

			if (!esPasillo(actual.getId())) {// es estantería

				System.out.println("ES ESTANTERIA: " + actual.getId());

				int cant = compruebaPedidoEstateria(actual.getId());

			} else {

				// System.out.println("ES Pasillo: " + actual.getId());

			}

			System.out.println("El mejor candidato de esta ronda es --------------->" + actual.getId().toUpperCase());
			cerrados.add(actual);// lo añadimos a la lista de cerrados
			abiertos.remove(actual); // lo quitamos de la lista de abiertos

			if (pedido.isEmpty() && actual.getId().equals("pt")) {
				System.out.println("---------FIN--------");
				done = true;
				return calcPath(primero, actual);

			}

			// Para todos los nodos adyacentes al actual
			ArrayList<Elemento> adyacentes = getListaAdyacentes(gr, actual, pedido);

			for (Elemento e : adyacentes) {
				if (!abiertos.contains(e)) {
					// System.out.println("ABIERTOS NO COINTIENE: " +
					// e.getId());
					e.setPrevio(actual);// se pone como previo el nodo actual

					int distant;
					int tam_pedido = pedido.size();
					if (esPasillo(e.getId()) && esPasillo(e.getPrevio().getId())) {
						distant = 10;
					} else {
						distant = 5;
						int cant = pedidoEstateria(e.getId());
						if (cant > 0) {
							tam_pedido = tam_pedido - cant;
						}
					}

					dist = caculaDistH(e.getId());
					e.setValorG(e.getPrevio().getValorG() + distant);
					int factor = 50;
					e.setValorH(dist + (tam_pedido * factor));

					abiertos.add(e);

				} else {

					dist = caculaDistH(e.getId());

					if (esPasillo(e.getId()) && esPasillo(e.getPrevio().getId())) {
						dist = 10;
					} else {
						dist = 5;
					}

					if (e.getValorG() >= e.getPrevio().getValorG() + dist) {

						e.setPrevio(actual);

						e.setValorG(e.getPrevio().getValorG() + dist);

					}
				}

			}

			// done = true;
		}

		return null;

	}

	private static int caculaDistH(String id) {
		// TODO Auto-generated method stub

		switch (id) {
		case "ps":
			return 50;
		case "pc1":
			return 40;

		case "pc2":
			return 30;

		case "pc3":
			return 20;

		case "pc4":
			return 10;

		case "pt":
			return 0;

		case "ps1":
			return 45;

		case "ps5":
			return 45;

		case "ps2":
			return 35;

		case "ps6":
			return 35;

		case "ps3":
			return 25;

		case "ps7":
			return 25;

		case "ps4":
			return 15;

		case "ps8":
			return 15;

		}
		return 0;

	}

	private static ArrayList<Elemento> calcPath(Elemento start, Elemento goal) {

		// TODO if invalid nodes are given (eg cannot find from
		// goal to start, this method will result in an infinite loop!)
		ArrayList<Elemento> path = new ArrayList<Elemento>();

		Elemento curr = goal;
		// boolean done = false;
		while (curr != start) {
			path.add(curr);
			curr = curr.getPrevio();

			// if (curr.equals(start)) {
			// done = true;
			// }
		}
		path.add(start);
		return path;
	}

	private static ArrayList<Elemento> getListaAdyacentes(Graph<String> gr, Elemento actual,
			HashMap<String, Integer> pedido) {
		// TODO Auto-generated method stub

		List<Node<String>> nodes = gr.adjacencyList.get(actual.getId()); // cogemos
																			// su
																			// lista
																			// de
																			// adyacencia
																			// y
																			// la
																			// transformamos
																			// en
																			// otra
																			// manipulable
																			// por
																			// el
																			// algoritmo
																			// a*
		ArrayList<Elemento> adyacentes = new ArrayList<Elemento>();

		for (int i = 0; i < nodes.size(); i++) {
			Elemento e = new Elemento();
			e.setId(nodes.get(i).getName());
			// posible actualizacion de g
			adyacentes.add(e);

		}

		return adyacentes;
	}

	private static Elemento mejorCandidatoEnAbiertos(ArrayList<Elemento> abiertos) {
		// TODO Auto-generated method stub

		Elemento mejor = null;

		int mejorF = abiertos.get(0).getValorG() + abiertos.get(0).getValorH();

		for (Elemento e : abiertos) {

			int fActual = e.getValorG() + e.getValorH();
			if (fActual <= mejorF) {
				mejor = e;
				mejorF = fActual;

			}

		}

		return mejor;// mejor = menorF
	}

	private static boolean esPasillo(String name) {

		for (Estanteria e : estanterias) {
			if (e.getPos().equals(name)) {
				return false;
			}
		}
		return true;

	}

	private static int compruebaPedidoEstateria(String nameEstanteria) {

		int cant = 0;

		for (Estanteria e : estanterias) {
			if (e.getPos().equals(nameEstanteria)) {

				for (String key : e.getObjetos().keySet()) {

					if (pedido.get(key) != null) {
						cant++;
						restarUds(nameEstanteria, key, pedido.get(key));
						pedido.remove(key);
					}

				}

			}
		}

		return cant;
	}

	private static int pedidoEstateria(String nameEstanteria) {

		int cant = 0;

		for (Estanteria e : estanterias) {
			if (e.getPos().equals(nameEstanteria)) {

				for (String key : e.getObjetos().keySet()) {

					if (pedido.get(key) != null) {
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
