package expert;

import java.util.Scanner;
public class HomeWork1_1 {

		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			boolean result = isGreater(a, b);
			
			if(result) {
				System.out.println(a+">"+b+"의 결과는 true입니다.");
			}
			else {
				System.out.println(a+">"+b+"의 결과는 false입니다.");
			}
			
		}
		
		public static boolean isGreater(int num1, int num2) {
			if(num1 > num2) {
				return true;
			}
			else {
				return false;
			}
		}
	}
