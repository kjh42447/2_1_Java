//�����̳ʸ� �����϶�.
package ch08_example;

import javax.swing.*;

public class MakeContainer1 extends JFrame {
	
	public MakeContainer1() {
		setSize(300, 200);
		setTitle("MakeContainer");
		setVisible(true);
		setResizable(false);
		setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//â ����� ���μ������� ���� ����
	}
	
	public static void main(String[] args) {
		MakeContainer1 mc = new MakeContainer1();
	}

}
