//���� 8-5�� �����ֹ�ȭ�� ��ư�� ���� ���ڻ����� �߰��϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class PizzaOrderFrame extends JFrame {
	
	public PizzaOrderFrame() {
		setSize(600, 350);
		setTitle("JAVA Pizza");
		
		//�г�
		JPanel defaultpanel = new JPanel();
		JPanel textepanel = new JPanel();
		JPanel buttonpanel = new JPanel(new GridLayout(2, 2, 10, 10));
		
		//���̺�
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����ϼ���.");
		label.setFont(new Font("SansSerif", Font.BOLD, 15));
		textepanel.add(label);
		
		//�̹���
		ImageIcon cheese = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\ġ������.png");
		ImageIcon combination = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\�޺���̼�����.png");
		ImageIcon potato = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\������������.png");
		ImageIcon bulgogi = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\�Ұ������.png");
		
		//��ư
		JButton chb = new JButton("ġ������", cheese);
		JButton cob = new JButton("�޺���̼�����", combination);
		JButton pob = new JButton("������������", potato);
		JButton bub = new JButton("�Ұ������", bulgogi);
		
		buttonpanel.add(chb);
		buttonpanel.add(cob);
		buttonpanel.add(pob);
		buttonpanel.add(bub);
		
		defaultpanel.add(textepanel);
		defaultpanel.add(buttonpanel);
		add(defaultpanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example8_5_1 {

	public static void main(String[] args) {
		PizzaOrderFrame f = new PizzaOrderFrame();
	}

}
