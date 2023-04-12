package expert;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a+">"+b+"의 결과는 true입니다.");
		}
		else if( a < b)
			System.out.println(a+">"+b+"의 결과는 false입니다.");
		
	}
}
