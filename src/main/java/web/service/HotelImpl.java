package web.service;

public class HotelImpl implements Hotel {
	private String nom;
	private int nbEtoiles;
	private Chambre chambre;
	private Adresse adresse;
	
	/*CONSTRUCTEUR*/
	public float recherche(Chambre chambre, int dateArrive, int dateDepart) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*METHODE*/
	
	public Chambre getChambre() {
		return chambre;
	}

	public HotelImpl(String nom, int nbEtoiles, Adresse adresse) {
		super();
		this.nom = nom;
		this.nbEtoiles = nbEtoiles;
		this.adresse = adresse;
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
		// TODO Auto-generated method stub
		return null;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbEtoiles() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setNbEtoiles(int nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}

	
}
	
	
	
	
	

	

	

	


