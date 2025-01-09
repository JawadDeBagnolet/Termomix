public class Ingredients {
    private String nom;
    private double quantite;
    private String unite;

    public Ingredients(String Afficher, String Nom, double Quantite, String Unite) {
        this.nom = Nom;
        this.quantite = Quantite;
        this.unite = Unite;

    }
    public String afficher(){
        return this.nom+" : "+this.quantite+" : "+this.unite;
    }
    public String getNom(){
        return this.nom;
    }
    public double getQuantite(){
        return this.quantite;
    }
    public String getUnite(){
        return this.unite;
    }

}
