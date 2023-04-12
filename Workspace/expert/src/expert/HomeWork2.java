package expert;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean H = sc.nextBoolean();
		int a = sc.nextInt();
		String b = sc.next();
		double c = sc.nextDouble();
		
		
		if(H) {
			System.out.println("나는 자동차를 소유하고 있다.");
		} else {
			System.out.println("나는 자동차를 소유하지 않고 있다.");
		}
		
		System.out.println("우리집의 스마트폰의 개수:" + a);
		System.out.println("내 이름:" + b);
		System.out.println(c+"평은"+3.3*c+"제곱미터입니다.");
	
	}
}
