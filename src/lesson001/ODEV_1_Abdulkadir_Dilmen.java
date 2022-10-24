package HW1;

import java.util.Scanner;

public class ODEV_1_Abdulkadir_Dilmen {

	public static void main(String[] args) {
		// Girilen kilogram değerini 5 gezegen için ağırlık olarak listeleyen program
		
		//İlk part
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("kg değeri giriniz:  ");
		float kg = scanner.nextFloat();
		
		float dunyaw = kg*9.83f;
		float merkurw = kg*3.59f;
		float venusw = kg*8.87f;
		float marsw = kg*3.77f;
		float jupiterw = kg*25.95f;
		
		System.out.println(" Dünyada : "+ dunyaw +"N , merkürde : "+ merkurw + "N , venüste : "
				+ venusw + "N , marsda : "+ marsw +"N , Jüpiterde : "+ jupiterw+"N");
		
		
		
		//İkinci Part 
		System.out.print("kg girin, (75): ");
		kg = scanner.nextFloat();
		System.out.print("1 - Dünya \n2 - Merkür \n3 - Venüs \n4 - Mars \n"
				+ "5 - Jüpiter \n gezegen kodu girin (venüs)");
		float gk = scanner.nextFloat();
		
		if (gk == 1)
			System.out.println("Dünyadaki ağırlığınız: "+ dunyaw +" N" );
		else if (gk == 2)
			System.out.println("Merkürdeki ağırlığınız: "+ merkurw +" N" );		
		else if (gk == 3)
			System.out.println("Venüsdeki ağırlığınız: "+ venusw +" N" );
		else if (gk == 4)
			System.out.println("Marstaki ağırlığınız: "+ marsw +" N" );
		else if (gk == 5)
			System.out.println("Jüpiterdeki ağırlığınız: "+ jupiterw +" N" );
		else
			System.out.println("Aradığınız gezegene ulaşılamıyor");

	}

}
