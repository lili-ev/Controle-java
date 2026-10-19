
public class Mission {

    private Employe employe;
    private Projet projet;
    private int nbJours;

    public Mission(Employe employe, Projet projet, int nbJours) {
        this.employe = employe;
        this.projet = projet;
        this.nbJours = nbJours;
    }

    public double calculerMontant() {
        return employe.calculerCout(nbJours);
    }

    public void afficherRecapitulatif() {

        employe.afficherDetails();

        System.out.println("Projet : " + projet);
        System.out.println("Durée : " + nbJours + " jours");
        System.out.println("Montant : " + calculerMontant() + " DH");
    }
}
