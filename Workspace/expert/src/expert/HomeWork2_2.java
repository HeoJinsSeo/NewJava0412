package expert;

import java.util.Scanner;
public class HomeWork2_2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        boolean H = sc.nextBoolean();
	        int a = sc.nextInt();
	        String b = sc.next();
	        double c = sc.nextDouble();
	        
	        printCarOwnership(H);
	        printNumberOfSmartphones(a);
	        printName(b);
	        printArea(c);
	    }
	    
	    public static void printCarOwnership(boolean hasCar) {
	        if (hasCar) {
	            System.out.println("나는 자동차를 소유하고 있다.");
	        } else {
	            System.out.println("나는 자동차를 소유하지 않고 있다.");
	        }
	    }
	    
	    public static void printNumberOfSmartphones(int num) {
	        System.out.println("우리집의 스마트폰의 개수:" + num);
	    }
	    
	    public static void printName(String name) {
	        System.out.println("내 이름:" + name);
	    }
	    
	    public static void printArea(double area) {
	        System.out.println(area + "평은 " + (3.3 * area) + "제곱미터입니다.");
	    }
	}
