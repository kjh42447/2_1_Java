//�̴� ������Ʈ
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

//��� �ؽ�Ʈ �г�
class WelcomePanel extends JPanel{
	private JLabel message;
	
	public WelcomePanel() {
		message = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�.");
		add(message);
	}
	
}

//�����г�
class TypePanel extends JPanel{
	private JRadioButton combo, potato, bulgogi;
	
	public TypePanel() {
		setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("�޺�", true);
		potato = new JRadioButton("��������");
		bulgogi = new JRadioButton("�Ұ��");
		ButtonGroup bg = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		setBorder(BorderFactory.createTitledBorder("����"));
		add(combo);
		add(potato);
		add(bulgogi);
	}
	
}

//�߰������г�
class ToppingPanel extends JPanel{
	private JRadioButton pimento, cheese, pepperoni, bacon;
	
	public ToppingPanel() {
		setLayout(new GridLayout(4, 1));
		pimento = new JRadioButton("�Ǹ�", true);
		cheese = new JRadioButton("ġ��");
		pepperoni = new JRadioButton("���۷δ�");
		bacon = new JRadioButton("������");
		setBorder(BorderFactory.createTitledBorder("�߰�����"));
		add(pimento);
		add(cheese);
		add(pepperoni);
		add(bacon);
	}
	
	//���� ����
	public int addTopping() {
		int topppingPrice = 0;
		
		if(pimento.isSelected()) {
			topppingPrice += 1000;
		}
		
		if(cheese.isSelected()) {
			topppingPrice += 1000;
		}
		
		if(pepperoni.isSelected()) {
			topppingPrice += 1500;
		}
		
		if(bacon.isSelected()) {
			topppingPrice += 2000;
		}
			
		return topppingPrice;
	}
	
}

//ũ���г�
class SizePanel extends JPanel{
	private JRadioButton small, medium, large;
	
	public SizePanel() {
		setLayout(new GridLayout(3, 1));
		small = new JRadioButton("Small", true);
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		ButtonGroup bg = new ButtonGroup();
		bg.add(small);
		bg.add(medium);
		bg.add(large);
		setBorder(BorderFactory.createTitledBorder("ũ��"));
		add(small);
		add(medium);
		add(large);
	}
	
	//������ �߰� ����
	public int changeSize() {
		int sizePrice = 0;
		
		if(medium.isSelected()) {
			sizePrice += 5000;
		}
		
		if(large.isSelected()) {
			sizePrice += 10000;
		}
		
		return sizePrice;
	}
	
}

//�ֹ� ������
class MiniPizza extends JFrame{
	private JPanel defaultPanel = new JPanel(new BorderLayout());
	private WelcomePanel welcomePanel = new WelcomePanel();
	private TypePanel typePanel = new TypePanel();
	private ToppingPanel toppingPanel = new ToppingPanel();
	private SizePanel sizePanel = new SizePanel();
	private JPanel orderPanel = new JPanel();
	private JButton order, cancel;
	private JTextField price = new JTextField("" + 0, 7);
	
	public MiniPizza() {
		setTitle("���� �ֹ�");
		setSize(500, 200);
		
		order = new JButton("�ֹ�");
		order.addActionListener(e -> {
			int sum = 19000;
			sum += toppingPanel.addTopping();
			sum += sizePanel.changeSize();
			price.setText("" + sum);
		});
		
		cancel = new JButton("���");
		cancel.addActionListener(e -> {
			price.setText("" + 0);
		});
		
		price.setEditable(false);
		
		orderPanel.add(order);
		orderPanel.add(cancel);
		orderPanel.add(price);
		
		defaultPanel.add(welcomePanel, BorderLayout.NORTH);
		defaultPanel.add(typePanel, BorderLayout.WEST);
		defaultPanel.add(toppingPanel, BorderLayout.CENTER);
		defaultPanel.add(sizePanel, BorderLayout.EAST);
		defaultPanel.add(orderPanel, BorderLayout.SOUTH);
		add(defaultPanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class MiniProject10_1 {

	public static void main(String[] args) {
		new MiniPizza();
	}

}
