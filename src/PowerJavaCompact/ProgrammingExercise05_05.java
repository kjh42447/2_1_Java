package PowerJavaCompact;

class BankAccount{
	private int balance;
	
	//접근자, 설정자
	public int getBalance() {		return balance;		}
	public void setBalance(int balance) {		this.balance = balance;		}

	//생성자
	BankAccount(int amount){
		this.balance = amount;
	}
	
	//현재 객체의 잔액에서 amount만큼을 otherAccount 계좌로 송금한다.
	public int transfer(int amount, BankAccount otherAccount) {
		this.balance -= amount;
		otherAccount.balance += amount;
		return amount;
	}
}
public class ProgrammingExercise05_05 {

	public static void main(String[] args) {
		BankAccount myAccount1 = new BankAccount(10000);
		BankAccount myAccount2 = new BankAccount(0);
		
		System.out.println("myAccount1 : 현재 잔액은 " + myAccount1.getBalance() + "입니다. ");
		System.out.println("myAccount2 : 현재 잔액은 " + myAccount2.getBalance() + "입니다. ");
		
		//송금
		System.out.println("tranfer(" + myAccount1.transfer(1000, myAccount2) + ")");
		
		System.out.println("myAccount1 : 현재 잔액은 " + myAccount1.getBalance() + "입니다. ");
		System.out.println("myAccount2 : 현재 잔액은 " + myAccount2.getBalance() + "입니다. ");
	}

}
