//미니 프로젝트
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

//상단 텍스트 패널
class WelcomePanel extends JPanel{
	private JLabel message;
	
	public WelcomePanel() {
		message = new JLabel("자바 피자에 오신것을 환영합니다.");
		add(message);
	}
	
}

//종류패널
class TypePanel extends JPanel{
	private JRadioButton combo, potato, bulgogi;
	
	public TypePanel() {
		setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("콤보", true);
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		ButtonGroup bg = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		setBorder(BorderFactory.createTitledBorder("종류"));
		add(combo);
		add(potato);
		add(bulgogi);
	}
	
}

//추가토핑패널
class ToppingPanel extends JPanel{
	private JRadioButton pimento, cheese, pepperoni, bacon;
	
	public ToppingPanel() {
		setLayout(new GridLayout(4, 1));
		pimento = new JRadioButton("피망", true);
		cheese = new JRadioButton("치즈");
		pepperoni = new JRadioButton("페퍼로니");
		bacon = new JRadioButton("베이컨");
		setBorder(BorderFactory.createTitledBorder("추가토핑"));
		add(pimento);
		add(cheese);
		add(pepperoni);
		add(bacon);
	}
	
	//토핑 가격
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

//크기패널
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
		setBorder(BorderFactory.createTitledBorder("크기"));
		add(small);
		add(medium);
		add(large);
	}
	
	//사이즈 추가 가격
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

//주문 프레임
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
		setTitle("피자 주문");
		setSize(500, 200);
		
		order = new JButton("주문");
		order.addActionListener(e -> {
			int sum = 19000;
			sum += toppingPanel.addTopping();
			sum += sizePanel.changeSize();
			price.setText("" + sum);
		});
		
		cancel = new JButton("취소");
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
