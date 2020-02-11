package codesignal;

import java.util.Scanner;

public class CenturyFromYear {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a year");
		int year = scanner.nextInt();
		if (year <= 0) {
			System.out.print("0 and negative is not allow"+ "for a year"); 
		}
		else if (year <= 100) {
			System.out.print("1st century\n"); 
		}
		else if (year % 100 == 0) 
			System.out.print(year / 100 + " century"); 

		else
			System.out.print(year / 100 + 1 + " century"); 
		scanner.close();
	}
}
