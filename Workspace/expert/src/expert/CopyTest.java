package expert;

public class CopyTest {

	public static void main(String[] args) {
		
		// 얕은복사, shallow copy, thin copy
		// 깊은복사, deep copy, deep clone
		
		int a = 10;
		test1(a);
		System.out.println("a : "+a);  // 20? 10?
	
		int[] b = {1,2,3};
		System.out.println("1. b[1] : "+ b[1]);  // 2?, 30?

		test2(b);
		System.out.println("2. b[1] : "+ b[1]);  // 2?, 30?
	
		Interface1Imple i = new Interface1Imple(); 
		System.out.println("i.level : "+ i.level);
	
		test3(i);
		System.out.println("i.level : "+ i.level);
	
	}
	
	// 깊은복사
	static void test1(int b) {
		b = 20;
	}
	// 얕은복사(원본변경, 주소값만 넘겨주는 것)
	static void test2(int[] c) {
		c[1] = 30;		
	} 
		
	static void test2(Interface1Imple i2) {
		
	}
	
}
