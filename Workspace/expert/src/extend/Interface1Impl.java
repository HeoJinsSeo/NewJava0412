package extend;

public class Interface1Impl implements Interface1{
	
	String level = "실장";

	public Interface1Impl(){
		level = "실장";
		test(0);
	}
	@Override
	public void test(int a) {
		System.out.println(level + "님");
		
	//	level = "원장";
	
		int result = 0;
		for (int i = 10; i < 1000; i++) {
			result = result + i;
		}
		
	}

	@Override
	public void test2(int a) {
		System.out.println("고하진"+ level +"님");
		
		for (int i = 10; i < 1000; i++) {
		//	result = result + i;
		}
	} 
	
	@Override
	public String toString() {
		return "Interface1Impl [level ";
	}
	
}
