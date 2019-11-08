package Metier;

public class Annonce {
	private int id;
	private String intitule;
	private String detail;
	private String prix;
	private Personne p;
	
	public Personne getP() {
		return p;
	}
	public void setP(Personne p) {
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}

}
