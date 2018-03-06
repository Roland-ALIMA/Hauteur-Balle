import java.util.Scanner;

public class Rebonds {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		double g = 9.81, H0, eps, v, v1, h;
		int nbr;
		int reb = 0;
		
		do {
			System.out.print("Entrez la heuteur initiale h = ");
			H0 = clavier.nextDouble();	
		} while (H0 < 0);
		
		do {
			System.out.print("Entrez le coefficient de rebond (0 <= esp < 1) eps = ");
			eps = clavier.nextDouble();	
		} while (eps < 0 && eps >1);
		
		do {
			System.out.print("Entrez le nombre de rebonds (nbr >= 0) nbr = ");
			nbr = clavier.nextInt();	
		} while (nbr < 0);
		
		v = Math.sqrt(2*H0*g);
		
		do {
			v1 = eps*v;
			h = v1*v1/(2*g);
			v = Math.sqrt(2*h*g);
			reb++;
		} while (reb != nbr);
		
		System.out.print("Après " + nbr + " rebonds, la hauteur de la balle est " + h);
		
		clavier.close();
		
	}

}
