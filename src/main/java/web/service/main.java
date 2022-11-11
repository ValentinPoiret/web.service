package web.service;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une nom de hôtel: \n");
		String nomHotel = sc.next();
		
		System.out.println("Entrez le nombre étoiles de hôtel: \n");
		int nbEtoiles = sc.nextInt();
		
		System.out.println("Entrez le pays de l'hôtel: \n");
		String pays = sc.next();
		
		System.out.println("Entrez la ville de l'hôtel: \n");
		String ville = sc.next();
		
		System.out.println("Entrez la rue de l'hôtel: \n");
		String rue = sc.next();
		
		System.out.println("Entrez le nombre de lits : \n");
		int nbLits = sc.nextInt();
		
		System.out.println("Entrez le numero de la chambre : \n");
		int nbPers = sc.nextInt();
		
		System.out.println("Entrez le nombre des personnes à héberger : \n");
		int num = sc.nextInt();
		
		System.out.println("Entrez le prix par nuit : \n");
		int prixParNuit = sc.nextInt();
		
		System.out.println("Entrez une date d’arrivée : \n");
		int dateArrive = sc.nextInt();
		
		System.out.println("Entrez une date de depart : \n");
		int dateDepart = sc.nextInt();
		float prix = 0;
		
		Hotel hotel = new HotelImpl(nomHotel, nbEtoiles, pays, ville, rue, nbLits, num, prixParNuit);
		
		prix = hotel.recherche(dateArrive, dateDepart, nbPers);

		System.out.println("Le prix à payer est de ;" + prix);
	}
	
}