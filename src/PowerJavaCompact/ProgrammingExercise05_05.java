package PowerJavaCompact;

class BankAccount{
	private int balance;
	
	//������, ������
	public int getBalance() {		return balance;		}
	public void setBalance(int balance) {		this.balance = balance;		}

	//������
	BankAccount(int amount){
		this.balance = amount;
	}
	
	//���� ��ü�� �ܾ׿��� amount��ŭ�� otherAccount ���·� �۱��Ѵ�.
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
		
		System.out.println("myAccount1 : ���� �ܾ��� " + myAccount1.getBalance() + "�Դϴ�. ");
		System.out.println("myAccount2 : ���� �ܾ��� " + myAccount2.getBalance() + "�Դϴ�. ");
		
		//�۱�
		System.out.println("tranfer(" + myAccount1.transfer(1000, myAccount2) + ")");
		
		System.out.println("myAccount1 : ���� �ܾ��� " + myAccount1.getBalance() + "�Դϴ�. ");
		System.out.println("myAccount2 : ���� �ܾ��� " + myAccount2.getBalance() + "�Դϴ�. ");
	}

}
