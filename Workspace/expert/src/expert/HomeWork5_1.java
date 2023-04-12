package expert;

import java.util.Arrays;
public class HomeWork5_1 {

		public static String findUnmatched(String[] participants, String[] completion) {
			Arrays.sort(participants);
			Arrays.sort(completion);
			for (int i = 0; i < completion.length; i++) {
				if(!participants[i].equals(completion[i])) {
					return participants[i];
				}
			}
			return participants[participants.length-1];
		}

		public static void main(String[] args) {
			String[] pa1 = {"leo", "kiki", "eden"};
			String[] com1 = {"eden", "kiki"};
			String[] pa2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
			String[] com2 = {"josipa", "filipa", "marina", "nikola"};
			String[] pa3 = {"mislav", "stanko", "mislav", "ana"};
			String[] com3 = {"stanko", "ana", "mislav"};

			System.out.println(findUnmatched(pa1, com1));
			System.out.println(findUnmatched(pa2, com2));
			System.out.println(findUnmatched(pa3, com3));
		}
	}
