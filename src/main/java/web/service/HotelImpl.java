package web.service;

public class HotelImpl implements Hotel {
	private String nom;
	private int nbEtoiles;
	private Chambre chambre;
	private Adresse adresse;
	
	
	/*CONSTRUCTEUR*/
	public HotelImpl(String nom, int nbEtoiles, String pays, String ville, String rue,int nbLits, int num, float prixParNuit) {
		
		this.nom = nom;
		this.nbEtoiles = nbEtoiles;
		this.adresse = new Adresse(pays,ville, rue);
		this.chambre = new Chambre(nbLits,num,prixParNuit);
	}
	
	/*CONSTRUCTEUR AVEC CHAMBRE AVEC RESERVATION*/
public HotelImpl(String nom, int nbEtoiles, Adresse adresse,int nbLits, int num, float prixParNuit, int dateArrive, int dateDepart) {
		
		this.nom = nom;
		this.nbEtoiles = nbEtoiles;
		this.adresse = adresse;
		this.chambre = new Chambre(nbLits,num,prixParNuit,dateArrive,dateDepart);
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
	
	public float recherche(int dateArrive, int dateDepart, int nbPers) {
		float prixApayer = 0;
		int nbJours = 0;
		
		nbJours = dateDepart - dateArrive;
		
		if(nbPers <= this.chambre.getNbLits() ) {
			prixApayer = this.chambre.getPrixParNuit() * nbJours;
		}
		return prixApayer;
	}
}
	
	
	
	
	

	

	

	


