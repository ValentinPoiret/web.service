package web.service;

public class Chambre {
	private int nbLits;
	private int num;
	private float prixParNuit;
	private Reservation reservation;
	
	/* CONSTRUCTEUR */
	public Chambre(int nbLits, int num, float prixParNuit, int dateArrive, int dateDepart) {
		setNbLits(nbLits);
		setNum(num);
		setPrixParNuit(prixParNuit);
		this.reservation = new Reservation(dateArrive,dateDepart);
	}
	/*CONSTRUCTEUR SANS RESERVATION*/
	public Chambre(int nbLits, int num, float prixParNuit) {
		setNbLits(nbLits);
		setNum(num);
		setPrixParNuit(prixParNuit);
		
	}

	/*ACCESSEURS*/
	public int getNbLits() {
		return nbLits;
	}

	public void setNbLits(int nbLits) {
		this.nbLits = nbLits;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getPrixParNuit() {
		return prixParNuit;
	}

	public void setPrixParNuit(float prixParNuit) {
		this.prixParNuit = prixParNuit;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
}
