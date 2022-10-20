package PowerJavaCompact;

class Account{
	private int balance;

	//생성자
	Account(){
		this.balance = 0;
		System.out.println("새로운 계좌가 만들어졌습니다. ");
	}
	
	//접근자, 설정자
	public int getBalance() {		return balance;		}
	public void setBalance(int balance) {		this.balance = balance;		}
	
	//출금
	void withdraw(int amount){
		if(amount <= 0)
			System.out.println("금액이 잘못 입력되었습니다. ");
		else if(this.balance < amount)
			System.out.println("잔액이 부족합니다. ");
		else {
			this.balance -= amount;
			System.out.println(this.balance + "원 인출");
		}
	}
	
	//입금
	void deposit(int amount) {
		if(amount <= 0)
			System.out.println("금액이 잘못 입력되었습니다. ");
		else {
			this.balance += amount;
			System.out.println(this.balance + "원 저축");
		}
	}
	
	//통장잔고 확인
	int Balance() {		return this.balance;	}
}
public class ProgrammingExercise04_05 {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.deposit(50000);
		Account account2 = new Account();
		account2.deposit(100000);
		
		System.out.println("고객#1 계좌 잔고=" + account1.Balance());
		System.out.println("고객#2 계좌 잔고=" + account2.Balance());
	}

}
