package expert;

import java.util.Scanner;
public class HomeWork4_1 {

		public static boolean isInsideRectangle(int x, int y) {
			return (10<=x && x<=90)&&(20<=y && y<=100);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(isInsideRectangle(x, y)) {
				System.out.println("("+x+","+y+")"+"(가/이) 사각형안에 들어 있습니다.");
			} else {
				System.out.println("("+x+","+y+")"+"(가/이) 사각형안에 들어있지 않습니다.");
			}
		}
	}
