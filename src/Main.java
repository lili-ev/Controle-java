
public class Main {

	public static void main(String[] args) {

		Ingenieur i1 = new Ingenieur("E01", "Ali", 500, 4);
		Ingenieur i2 = new Ingenieur("E02", "Omar", 350, 2);

		Commercial c1 = new Commercial("E03", "Sara", 300, 0.10);
		Commercial c2 = new Commercial("E04", "Youssef", 400, 0.15);

		Employe[] employes = { i1, i2, c1, c2 };

		Projet p1 = new Projet("P01", "Application Java");
		Projet p2 = new Projet("P02", "Gestion commerciale");

		i2.setSuperieur(i1);
		c1.setSuperieur(i1);
		c2.setSuperieur(c1);

		for (int i = 0; i < employes.length; i++) {
			employes[i].afficherDetails();
			System.out.println();
		}

		Mission m1 = new Mission(i1, p1, 3);
		Mission m2 = new Mission(i2, p1, 2);
		Mission m3 = new Mission(c1, p2, 4);
		Mission m4 = new Mission(c2, p2, 2);

		Mission[] missions = { m1, m2, m3, m4 };

		double total = 0;

		for (int i = 0; i < missions.length; i++) {
			missions[i].afficherRecapitulatif();
			total = total + missions[i].calculerMontant();
			System.out.println();
		}

		System.out.println("Montant total des missions : " + total + " DH");

		int nombre = 0;

		for (int i = 0; i < employes.length; i++) {
			if (employes[i].getSuperieur() == i1) {
				nombre++;
			}
		}

		System.out.println("Nombre d'employes supervises : " + nombre);
	}

}
