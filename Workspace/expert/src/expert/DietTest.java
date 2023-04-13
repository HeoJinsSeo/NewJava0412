package expert;

public class DietTest {

	public static void main(String[] args) {
		
		HalfDietImpl halfDiet = new HalfDietImpl();
		halfDiet.setDuration(6);
		halfDiet.setExpense(500000);
		halfDiet.getDietMethode();
		halfDiet.getSideEffect();
		
		doDiet(halfDiet);
		
		DetoxDietImpl detoxDiet = new DetoxDietImpl();
		detoxDiet.setExpense(1000000);
		detoxDiet.setDuration(10);
		detoxDiet.getDietMethode();
		detoxDiet.getSideEffect();
		
		doDiet(detoxDiet);
		
		
		
		
	}
	public static void doDiet(Diet diet) {
		System.out.println("다이어트 종류 : "+ diet.getDietType());
		System.out.println("다이어트 방법 : "+ diet.getDietMethode());
		System.out.println("다이어트 부작용 : "+ diet.getSideEffect());
		System.out.println("비용 : "+ diet.getExpense());
		System.out.println("기간 : "+ diet.getDuration());
	}

	
}
