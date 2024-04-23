package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;
	private static String nom = "sanglier";
	public Sanglier(Gaulois chasseur,int poids) {
		super(nom,Unite.KILOGRAMME);
		this.chasseur= chasseur;
		this.poids = poids;
	}
	@Override
	public String descriptionProduit() {
		return nom+" de "+poids+ " kg"+"chassé par "+chasseur.getNom();
	}
}