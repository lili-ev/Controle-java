
public class Ingenieur extends Employe {

	private int niveauExpertise;

	public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise = niveauExpertise;
	}

	public double calculerCout(int nbJours) {

		if (niveauExpertise < 3) {
			return tarifJournalier * nbJours;
		} else {
			return (tarifJournalier * nbJours) + (100 * nbJours);
		}
	}
}
