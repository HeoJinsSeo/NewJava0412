package expert;

import java.util.Scanner;
public class HomeWork3_1 {

    public static boolean isBetween15And20(int n) {
        if (n > 15 && n < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (isBetween15And20(a)) {
            System.out.println(a + "(가/이) 15와 20사이에 있다.");
        } else {
            System.out.println(a + "(가/이) 15와 20사이에 있지 않다.");
        }
    }
	}
