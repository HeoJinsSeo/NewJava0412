package expert;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(15<=a && a<=20 ) {
			System.out.println(a+"(가/이) 15와 20사이에 있다.");
		} else {
			System.out.println(a+"(가/이) 15와 20사이에 있지 않다.");
		}
		
	}
}
