package fr.adaming.main;

import org.hibernate.Session;

import fr.adaming.entities.Etagere;
import fr.adaming.entities.Livre;
import fr.adaming.util.HibernateUtil;

public class App {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession(); // ouvrir
																			// une
																			// connexion

		session.beginTransaction();// demander à commencer plusieurs requetes

		Etagere e1 = new Etagere(); //creation d'une etagere
		e1.setCapacite(12);

		session.save(e1);
		Etagere e2 = new Etagere(); //creation d'une etagere
		e2.setCapacite(25);

		session.save(e2);

		Livre l1 = new Livre();

		l1.setTitre("mon premier livre");
		l1.setAuteur("Victor Hugo");
		l1.setEditeur("gallimard");
		l1.setNbPages(250);
		l1.setPrix(20);
		l1.setDateParution(null);
		l1.setCategorie("fantastique");
		l1.setPoids(12);
		l1.setStock(5);
		l1.setEtagere(e1);

		session.save(l1);

		Livre l2 = new Livre();

		l2.setTitre("mon second livre");
		l2.setAuteur("Lovecraft");
		l2.setEditeur("gallimard");
		l2.setNbPages(125);
		l2.setPrix(12);
		l2.setDateParution(null);
		l2.setCategorie("horreur");
		l2.setPoids(12);
		l2.setStock(5);
		l2.setEtagere(e2);

		session.save(l2);

		Livre l3 = new Livre();

		l3.setTitre("mon troisieme livre");
		l3.setAuteur("Balzac");
		l3.setEditeur("poche");
		l3.setNbPages(320);
		l3.setPrix(15);
		l3.setDateParution(null);
		l3.setCategorie("historique");
		l3.setPoids(11);
		l3.setStock(20);
		l3.setEtagere(e1);

		session.save(l3);

		Livre l4 = new Livre();

		l4.setTitre("mon quatrieme livre");
		l4.setAuteur("Balzac");
		l4.setEditeur("vue");
		l4.setNbPages(420);
		l4.setPrix(28);
		l4.setDateParution(null);
		l4.setCategorie("historique");
		l4.setPoids(50);
		l4.setStock(22);
		l4.setEtagere(e1); //assigner etagere 1 au livre 4

		session.save(l4);

		session.getTransaction().commit();

	}

}
