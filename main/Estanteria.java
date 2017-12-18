package main;

import java.util.HashMap;

public class Estanteria {

	
	
	String id;
	String pos;
	public HashMap <String,Integer> objetos;
	
	
	public Estanteria() {
		super();
	}



	public Estanteria(String id, String pos, HashMap<String, Integer> objetos) {
		super();
		this.id = id;
		this.pos = pos;
		this.objetos = objetos;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public HashMap<String, Integer> getObjetos() {
		return objetos;
	}
	public void setObjetos(HashMap<String, Integer> objetos) {
		this.objetos = objetos;
	}

}
