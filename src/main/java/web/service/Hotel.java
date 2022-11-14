package web.service;




public interface Hotel {
	
	public Chambre getChambre();
	public void setChambre(Chambre chambre);
	public Adresse getAdresse();
	public void setAdresse(Adresse adresse);
	
	public String getNom();
	public void setNom(String nom);

	public int getNbEtoiles();
	public void setNbEtoiles(int nbEtoiles);

	public float recherche(int dateArrive, int dateDepart, int nbPers);
	
}