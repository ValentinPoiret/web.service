package web.service;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
		Hotel hotel = new HotelImpl(nom, nbEtoiles, adresse);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une nom de hôtel: \n");
		String nomHotel = sc.next();
		
		System.out.println("Entrez le nombre étoiles de hôtel: \n");
		int  nbEtoiles = sc.nextInt();
		
		
		System.out.println("Entrez le nombre des personnes à héberger : \n");
		int nbPers = sc.nextInt();
		
		System.out.println("Entrez une date d’arrivée : \n");
		int dateArrive = sc.nextInt();
		
		System.out.println("Entrez une date de depart : \n");
		int dateDepart = sc.nextInt();
		float prix = 0;
		
		prix = hotel.recherche(null, dateArrive, dateDepart );

	}

}
