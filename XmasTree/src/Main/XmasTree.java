package Main;

import java.util.Scanner;

import Print.DrawTree;

public class XmasTree {


	public static boolean isGoodDirection(String kierunek) {
		if ((kierunek.equals("l")) || (kierunek.equals("g")) || (kierunek.equals("r")) || (kierunek.equals("d"))) {
			return true;

		} else {
			System.out.println("Poda³eœ z³y znak, spróbuj jeszcze raz...");
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner odczyt = new Scanner(System.in);

		String sign;
		String direction;
		int nOfLevels=0;
		
		do {
			System.out.println("Podaj znak: ");
			 sign = odczyt.nextLine();
			if (sign.length() == 1) {
				break;
			}
		} while (true);

		
		do {
			System.out.println("Podaj kierunek ( lewo - l, góra - g, prawo - r, w dó³ - d ) : ");
			direction = odczyt.nextLine();
			if (isGoodDirection(direction) == true) {
				break;
			}
		} while (true);

		
		do {
			 try {
				 System.out.println("Podaj ilosc: ");
				 String temp = odczyt.nextLine();
				  nOfLevels = Integer.parseInt(temp); 
				   if(true){
					   break;
				   }
				 }
			 catch(NumberFormatException e) {
				   System.out.println("To nie jest liczba ca³kowita!"); 
				 } 
			
		} while (true);


		System.out.println(DrawTree.drawTree(nOfLevels, sign, direction));

		odczyt.close();
	}
}
