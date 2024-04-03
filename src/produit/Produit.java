package produit;

public abstract class Produit {
	String nom;
	String unite;
	
	
	public Produit(String nomP, String uniteP) {
		this.nom = nomP;
		this.unite = uniteP;
	}
	
	public String getNom() {
		return this.nom;
	}
	
}

