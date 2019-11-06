package fr.adaming.entities;

public class Etagere {
	
	private long idE;
	private int capacite;
	


public Etagere() {
		super();
	}


//getters et setters
	public long getIdE() {
		return idE;
	}


	public void setIdE(long idE) {
		this.idE = idE;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	} 
	

//tostring
	@Override
	public String toString() {
		return "Etagère [id=" + idE + ", capacite=" + capacite + "]";
	}



	
	


}
