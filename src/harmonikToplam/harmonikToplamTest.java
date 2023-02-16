package harmonikToplam;

import java.util.Scanner;

public class harmonikToplamTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	int counter=1;	
	int number;
	double toplam=0;
	System.out.print("Bir sayı giriniz: ");
	number = input.nextInt();
	
	while(counter <= number ) {
		toplam += 1.0 / counter;
		counter++;
		
		}
	System.out.println("Girdiğiniz sayının Harmonik Toplamı: " + toplam);	
	}

}
