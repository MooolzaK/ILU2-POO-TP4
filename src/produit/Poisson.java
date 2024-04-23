package produit;

public class Poisson extends Produit {
	private String dateDePeche;
	private static final String nom = "poisson";
	private final Unite unite;
	
	public Poisson(String dateDePeche) {
		super(nom,Unite); //J'ai mis Kilogramme pcq il faut préciser mais je voudrais quelque chose de + général
		this.dateDePeche = dateDePeche;
		this.unite = unite;
	}
	//IL NE FAUT PAS UNITE DANS LE CONSTRUCTEUR !
	@Override
	public String descriptionProduit() {
		return nom+ "pechés "+dateDePeche;
	}
}