//콤보박스로 생년월일을 입력받아 레이블로 출력하라.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_8_1 extends JFrame {
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	
	private JComboBox<Integer> year, month, date;
	private JButton button = new JButton("확인");
	private JLabel label = new JLabel();
	
	private Integer[] yyyy = new Integer[100];
	private Integer[] mm = new Integer[12];
	private Integer[] dd = new Integer[31];
	private int y = 2000, m = 1, d = 1;
	
	public Example10_8_1() {
		setTitle("Example10_8_1");
		setSize(300, 200);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		for(int i = 0; i < 100; i++) {
			yyyy[i] = 1920+i;
		}
		for(int i = 0; i < 12; i++) {
			mm[i] = i+1;
		}
		for(int i = 0; i < 31; i++) {
			dd[i] = i+1;
		}
		
		//콤보박스
		year = new JComboBox<Integer>(yyyy);
		month = new JComboBox<Integer>(mm);
		date = new JComboBox<Integer>(dd);
		
		year.setSelectedIndex(80);
		year.addActionListener(e -> {
			y = (int) year.getSelectedItem();
		});
		month.addActionListener(e -> {
			m = (int) month.getSelectedItem();
		});
		date.addActionListener(e -> {
			d = (int) date.getSelectedItem();
		});
		
		//버튼
		button.addActionListener(e -> {
			label.setText("현재 선택된 날짜는 " + y + "년 " + m + "월 " + d+ "일 입니다.");
		});
		
		panel1.add(year);
		panel1.add(month);
		panel1.add(date);
		panel2.add(button);
		panel3.add(label);
		add(panel1);
		add(panel2);
		add(panel3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Example10_8_1();
	}

}
