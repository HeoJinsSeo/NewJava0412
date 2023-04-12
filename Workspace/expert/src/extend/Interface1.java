package extend;

public interface Interface1 {

	int a = 10;
	public static final double pi = 3.14;
	
	void test(int a);
	public abstract void test2(int a);
	
	default String search(String keyword) {
		return null;
	}
	
	
}
