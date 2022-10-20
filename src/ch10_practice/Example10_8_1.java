//복붙
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_8_1 extends JFrame implements ActionListener{
	JLabel label;
	
	public Example10_8_1() {
		setTitle("콤보 박스");
		setSize(400, 200);
		
		String[] pizzas = { "치즈피자", "콤비네이션피자", "포테이토피자", "불고기피자", "없는 피자"};
		JComboBox<String> pizzaList = new JComboBox<String>(pizzas);
		pizzaList.setSelectedIndex(0);
		pizzaList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePicture(pizzas[pizzaList.getSelectedIndex()]);
		add(pizzaList, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> cb = (JComboBox<String>) e.getSource();
		String name = (String) cb.getSelectedItem();
		changePicture(name);
	}
	
	protected void changePicture(String name) {
		ImageIcon icon = new ImageIcon(".\\src\\image\\" + name + ".png");
		label.setIcon(icon);
		if(icon != null) {
			label.setText(null);
		}
		else {
			label.setText("이미지가 발견되지 않았습니다.");
		}
	}
	
	public static void main(String[] args) {
		new Example10_8_1();
	}

}
