
public abstract class Employe {

	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	protected Employe superieur;

	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
		this.superieur = null;
	}

	public String getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setSuperieur(Employe superieur) {
		if (superieur != this) {
			this.superieur = superieur;
		} else {
			System.out.println("Un employe ne peut pas etre son propre superieur.");
		}
	}

	public Employe getSuperieur() {
		return superieur;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {
		System.out.println("Matricule : " + matricule);
		System.out.println("Nom : " + nom);
		System.out.println("Tarif journalier : " + tarifJournalier + " DH");

		if (superieur != null) {
			System.out.println("Superieur : " + superieur.getNom());
		} else {
			System.out.println("Superieur : Aucun");
		}
	}
}
