package fr.adaming.entities;

import java.util.Date;
/**
 * 
 * @author moi
 *
 */

public class Livre {
	
	
	private long id;
	private String isbn;
	private String titre;
	private String auteur;
	private String editeur;
	private int nbPages;
	private double prix;
	private Date dateParution;
	private String categorie;
	private double poids;
	private int stock;
	private Etagere etagere; //creation d'un objet etagere (represente l'association unidirectionnelle entre etagere et livres)
	
	
	
	public Livre() {
		super();
	}
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getAuteur() {
		return auteur;
	}



	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}



	public String getEditeur() {
		return editeur;
	}



	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}



	public int getNbPages() {
		return nbPages;
	}



	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public Date getDateParution() {
		return dateParution;
	}



	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}



	public String getCategorie() {
		return categorie;
	}



	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}



	public double getPoids() {
		return poids;
	}



	public void setPoids(double poids) {
		this.poids = poids;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}


	public Etagere getEtagere() {
		return etagere;
	}



	public void setEtagere(Etagere etagere) {
		this.etagere = etagere;
	}



	@Override
	public String toString() {
		return "Livre [id=" + id + ", isbn=" + isbn + ", titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur
				+ ", nbPages=" + nbPages + ", prix=" + prix + ", dateParution=" + dateParution + ", categorie="
				+ categorie + ", poids=" + poids + ", stock=" + stock + "]";
	}
	
	
	
	
	
	
}
