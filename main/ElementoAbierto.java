package main;

import java.util.Comparator;

public class ElementoAbierto  {

	
	private String nombreDestino;
    private int valorF;
   
	
	
	
    public static Comparator<ElementoAbierto> ElementComparator = new Comparator<ElementoAbierto>() {

    	public int compare(ElementoAbierto s1, ElementoAbierto s2) {
    		int rollno1 = s1.getValorF();
    		   int rollno2 = s2.getValorF();

    		   /*For ascending order*/
    		   return rollno1-rollno2;
        }};




	public String getNombreDestino() {
		return nombreDestino;
	}




	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	@Override
    public String toString() {
        return "name=" + nombreDestino + ", F=" + valorF + "]";
    }


	public int getValorF() {
		return valorF;
	}




	public void setValorF(int valorF) {
		this.valorF = valorF;
	}




	public ElementoAbierto(String nombreDestino, int valorF) {
		super();
		this.nombreDestino = nombreDestino;
		this.valorF = valorF;
	}




	public ElementoAbierto() {
		super();
	}




	

}
