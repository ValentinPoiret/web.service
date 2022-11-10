package web.service;

public class Adresse {
	
	private String pays;
	private String ville;
	private String rue;
	
	public Adresse(String pays, String ville, String rue) {
	
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	

}
