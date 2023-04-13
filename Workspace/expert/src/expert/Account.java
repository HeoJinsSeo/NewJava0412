package expert;

public class Account {

	private double balance = 1000;
	private String owner = "허진서";
	double deposit;
	double withdraw;
		
	
	public Account (String owner) {
		this.owner = owner;
	}

	
	
	
	public String getOwner() {
		return owner;
	}




	public void setOwner(String owner) {
		this.owner = owner;
	}




	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		if( balance < 0 ) {
			System.out.println("음수는 입력할 수 없습니다.");
			return;
		}
		this.balance = balance;
	}
	
	
	public void deposit(double amount) {
		if(amount < 0 ) {
			System.out.println("음수는 입금할 수 없습니다.");
			return;
		}
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount < 0 ) {
			System.out.println("음수는 출금할 수 없습니다.");
			return;
		}
		
		if(this.balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.balance -= amount;
	}	
	
	}
