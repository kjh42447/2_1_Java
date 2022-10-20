package PowerJavaCompact;

class Account{
	private int balance;

	//������
	Account(){
		this.balance = 0;
		System.out.println("���ο� ���°� ����������ϴ�. ");
	}
	
	//������, ������
	public int getBalance() {		return balance;		}
	public void setBalance(int balance) {		this.balance = balance;		}
	
	//���
	void withdraw(int amount){
		if(amount <= 0)
			System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�. ");
		else if(this.balance < amount)
			System.out.println("�ܾ��� �����մϴ�. ");
		else {
			this.balance -= amount;
			System.out.println(this.balance + "�� ����");
		}
	}
	
	//�Ա�
	void deposit(int amount) {
		if(amount <= 0)
			System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�. ");
		else {
			this.balance += amount;
			System.out.println(this.balance + "�� ����");
		}
	}
	
	//�����ܰ� Ȯ��
	int Balance() {		return this.balance;	}
}
public class ProgrammingExercise04_05 {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.deposit(50000);
		Account account2 = new Account();
		account2.deposit(100000);
		
		System.out.println("��#1 ���� �ܰ�=" + account1.Balance());
		System.out.println("��#2 ���� �ܰ�=" + account2.Balance());
	}

}
