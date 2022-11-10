package web.service;


public interface Hotel {

	String getNom();

	int getNbEtoiles();

	float recherche(Chambre chambre, int dateArrive, int dateDepart);
	
	
}
