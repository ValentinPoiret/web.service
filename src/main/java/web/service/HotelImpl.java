package web.service;

public class HotelImpl implements Hotel {
	private String nom;
	private int nbEtoiles;
	private Chambre chambre;
	private Adresse adresse;
	
	/*CONSTRUCTEUR*/
	public HotelImpl(String nom, int nbEtoiles, Adresse adresse) {
		
		this.nom = nom;
		this.nbEtoiles = nbEtoiles;
		this.adresse = adresse;
	}
	
	/*METHODE*/
	
	public Chambre getChambre() {
		return chambre;
	}


	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public String getNom() {
		return null;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbEtoiles() {
		return 0;
	}
	public void setNbEtoiles(int nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}
	
	public float recherche(Chambre chambre, int dateArrive, int dateDepart, int nbPers) {
		float prixApayer = 0;
		int nbJours = 0;
		
		nbJours = dateDepart - dateArrive;
		
		if(nbPers <= chambre.getNbLits() ) {
			prixApayer = chambre.getPrixParNuit() * nbJours;
		}
		return prixApayer;
	}
}
	
	
	
	
	

	

	

	


