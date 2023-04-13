package expert;

public class AccountTest {

	public static void main(String[] args) {
		double balance = 1000;
		Account account = new Account ("허진서");
		
		
		
		System.out.println();
		account.deposit(10000);
		System.out.println("현재 잔액 : "+ account.getBalance());
		account.withdraw(5000);
		System.out.println("현재잔액 : "+ account.getBalance());
		System.out.println("----------------------------------");
		
		double balance1 = 5000;
		Account2 account2 = new Account2 ("김휴먼");
		
		account2.deposit(30000);
		System.out.println("현재 잔액 : "+ account2.getBalance());
		account2.withdraw(20000);
		System.out.println("현재잔액 : "+ account2.getBalance());
		
		
		
	}
}
