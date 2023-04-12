package expert;

import java.util.Arrays;

public class HomeWork5 {

	public static void main(String[] args) {
		String[] pa1 = {"leo", "kiki", "eden"};
		String[] com1 = {"eden", "kiki"};
		String[] pa2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] com2 = {"josipa", "filipa", "marina", "nikola"};
		String[] pa3 = {"mislav", "stanko", "mislav", "ana"};
		String[] com3 = {"stanko", "ana", "mislav"};
		
		
		
		
		Arrays.sort(pa1);
		Arrays.sort(com1);
		Arrays.sort(pa2);
		Arrays.sort(com2);
		Arrays.sort(pa3);
		Arrays.sort(com3);
		
		for (int i = 0; i < com1.length; i++) {
			if(!pa1[i].equals(com1[i])) {
				System.out.println(pa1[i]);
				return;
			}
			
		}
		System.out.println(pa1[pa1.length-1]);
		for (int i = 0; i < com2.length; i++) {
			if(!pa2[i].equals(com2[i])) {
				System.out.println(pa2[i]);
				return;
			}
			
		}
		System.out.println(pa2[pa2.length-1]);
		for (int i = 0; i < com3.length; i++) {
			if(!pa3[i].equals(com3[i])) {
				System.out.println(pa3[i]);
				return;
			}
			
		}
		System.out.println(pa3[pa3.length-1]);
	
	}
	
	
}
