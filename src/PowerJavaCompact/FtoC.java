package PowerJavaCompact;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c_temp, f;
		
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		f = sc.nextDouble();
		
		c_temp = (5.0/9)*(f-32);
		
		System.out.println("¼·¾¾¿Âµµ´Â "+c_temp);
		
		sc.close();
	}

}
