//ppt+이것저것
package ch08_practice;

import java.awt.*;
import javax.swing.*;

public class ButtonTest1 extends JFrame {

	public ButtonTest1() {
		setLayout(new GridLayout(3, 0, 5, 5));
		setSize(600, 400);
		
		//JCheckBox
		JPanel p1 = new JPanel();
		p1.setBackground(Color.CYAN);
		JCheckBox b11 = new JCheckBox("b1");
		b11.setBorderPainted(false); 			//버튼 경계
		JCheckBox b12 = new JCheckBox("b2");
		b12.setContentAreaFilled(false); 		//배경 채울지 여부
		JCheckBox b13 = new JCheckBox("b3");
		b13.setEnabled(false); 				//버튼 비활성화
		JCheckBox b14 = new JCheckBox("b4");
		b14.setRolloverEnabled(false); 		//마우스 올리면 경계 진하게 하기
		p1.add(b11);
		p1.add(b12);
		p1.add(b13);
		p1.add(b14);
		add(p1);
		
		//JRadioButton
		ButtonGroup bg1 = new ButtonGroup();
		JPanel p2 = new JPanel();
		p2.setBackground(Color.ORANGE);
		JRadioButton b21 = new JRadioButton("b1");
		JRadioButton b22 = new JRadioButton("b2");
		JRadioButton b23 = new JRadioButton("b3");
		JRadioButton b24 = new JRadioButton("b4");
		bg1.add(b21);	p2.add(b21);
		bg1.add(b22);	p2.add(b22);
		bg1.add(b23);	p2.add(b23);
		bg1.add(b24);	p2.add(b24);
		add(p2);
		
		//JMenuItem
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("menu1");
		m1.add(new JMenuItem("item1"));
		m1.add(new JMenuItem("item2"));
		mb.add(m1);
		
		//JCheckBoxMenuItem
		JMenu m2 = new JMenu("menu2");
		m2.add(new JCheckBoxMenuItem("item1"));
		m2.add(new JCheckBoxMenuItem("item2"));
		m2.add(new JCheckBoxMenuItem("item3"));
		m2.add(new JCheckBoxMenuItem("item4"));
		mb.add(m2);
		
		//JRAdioButtonMenuItem
		//위에 라디오박스처럼 해야하는데 귀찮아서 생략
		ButtonGroup bg2 = new ButtonGroup();
		JMenu m3 = new JMenu("menu3");
		m3.add(new JRadioButtonMenuItem("item1"));
		m3.add(new JRadioButtonMenuItem("item2"));
		m3.add(new JRadioButtonMenuItem("item3"));
		m3.add(new JRadioButtonMenuItem("item4"));
		mb.add(m3);
		setJMenuBar(mb);
		
		//JToggleButton
		JPanel p3 = new JPanel();
		p3.setBackground(Color.MAGENTA);
		ButtonGroup bg3 = new ButtonGroup();
		JToggleButton b31 = new JToggleButton("b1");
		JToggleButton b32 = new JToggleButton("b2");
		JToggleButton b33 = new JToggleButton("b3");
		JToggleButton b34 = new JToggleButton("b4");
		bg3.add(b31); p3.add(b31);
		bg3.add(b32); p3.add(b32);
		bg3.add(b33); p3.add(b33);
		bg3.add(b34); p3.add(b34);
		add(p3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ButtonTest1 f = new ButtonTest1();
	}

}
