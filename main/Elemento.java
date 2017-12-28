package main;

import java.util.Comparator;
import java.util.HashMap;

public class Elemento  {

	
	private String id;
    private int valorG;
    private int valorH;
    private Elemento previo;

    private HashMap<String, Integer> estadoPedido;
    
    
    
    //-
	public Elemento(String id,int valorG, int valorH, Elemento previo, String c, HashMap<String, Integer> pedidoActual) {
		super();
		this.id = id;
		this.valorG = valorG;
		this.valorH = valorH;
		this.previo = previo;
		this.estadoPedido = pedidoActual;
	}
	
	public Elemento() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public int getValorG() {
		return valorG;
	}

	public void setValorG(int valorG) {
		this.valorG = valorG;
	}

	public int getValorH() {
		return valorH;
	}

	public void setValorH(int valorH) {
		this.valorH = valorH;
	}

	public Elemento getPrevio() {
		return previo;
	}

	public void setPrevio(Elemento previo) {
		this.previo = previo;
	}

	
	public HashMap<String, Integer> getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(HashMap<String, Integer> estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	
   
	

}
