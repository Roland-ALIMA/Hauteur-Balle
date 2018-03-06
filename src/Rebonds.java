import java.util.Scanner;

public class Rebonds {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//Constante de gravité
		final double G = 9.81;
		// Déclarations
		// vitesses avant et après le rebond
		double v = 0.0;
		double v1 = 0.0;
		// hauteur avant le rebond, hauteur de remontée
		double h = 0.0;
		double h1 = 0.0;
		// hauteur initiale
		double H0 = 0.0;
		// valeur epsilon
		double eps = 0.0;
		// nombre de rebonds
		int NBR = 0;
		
		/*
		* Entrée des valeurs par l'utilisateur,
		* avec test de validité
		*/
		do {
			System.out.print("Coefficient de rebond (0 <= coeff < 1) : ");
			eps = scanner.nextDouble();
		} while ((eps < 0.0) || (eps >= 1.0));
		do {
			System.out.print("Hauteur initiale (0 <= H0) : ");
			H0 = scanner.nextDouble();
		} while (H0 < 0.0);
		do {
			System.out.print("Nombre de rebonds (0 <= N ) : ");
			NBR = scanner.nextInt();
		} while (NBR < 0);
		// Boucle de calcul
		h = H0;
		// on fait une itération par rebond
		for (int nombre = 0; nombre < NBR; ++nombre) {
			v = Math.sqrt(2.0 * G * h);
			// vitesse après le rebond
			v1 = eps * v;
			// la hauteur à laquelle elle remonte...
			h1 =(v1 * v1) / (2.0 * G);
			// ...qui devient la nouvelle hauteur initiale
			h = h1;
			System.out.println("rebond " + (nombre+1) + " : " + h);
		}

		System.out.print("Après " + NBR + " rebonds, la hauteur de la balle est " + h);

		scanner.close();

	}

}
