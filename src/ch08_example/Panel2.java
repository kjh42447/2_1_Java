//4���� �г��� �ִ� �������� ����� �г��� ��ư�� ���� �ٸ� ���̾ƿ����� �����϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class PanelTest2 extends JFrame {
	
	//������
	public PanelTest2() {
		setTitle("PanelTest2");
		setSize(600, 500);
		setLayout(new GridLayout(2, 2));
		
		JPanel flowPanel = new JPanel();
		JPanel gridPanel = new JPanel();
		JPanel boxPanel = new JPanel();
		JPanel borderPanel = new JPanel();
		
		setFlowPanel(flowPanel);
		setGridPanel(gridPanel);
		setBoxPanle(boxPanel);
		setBorderPanle(borderPanel);
		
		add(flowPanel);
		add(gridPanel);
		add(boxPanel);
		add(borderPanel);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//FlowLayout����
	void setFlowPanel(JPanel panel) {
		panel.setLayout(new FlowLayout());
		panel.setToolTipText("FlowLayout");
		panel.setBackground(Color.CYAN);
		
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		
		b1.setPreferredSize(new Dimension(100, 50));
		b2.setPreferredSize(new Dimension(100, 50));
		b3.setPreferredSize(new Dimension(100, 50));
		b4.setPreferredSize(new Dimension(100, 50));
		
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.MAGENTA);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.WHITE);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
	}
	
	//GridLayout����
	void setGridPanel(JPanel panel) {
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		panel.setToolTipText("GridLayout");
		panel.setBackground(Color.MAGENTA);
		
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.MAGENTA);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.WHITE);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
	}
	
	//BoxLayout����
	void setBoxPanle(JPanel panel) {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setToolTipText("BoxLayout");
		panel.setBackground(Color.ORANGE);
		
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		
		b1.setMaximumSize(new Dimension(100, 50));
		b2.setMaximumSize(new Dimension(100, 50));
		b3.setMaximumSize(new Dimension(100, 50));
		b4.setMaximumSize(new Dimension(100, 50));
		
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		b3.setAlignmentX(Component.CENTER_ALIGNMENT);
		b4.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.MAGENTA);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.WHITE);
		
		panel.add(Box.createVerticalStrut(5));
		panel.add(b1);
		panel.add(Box.createVerticalStrut(5));
		panel.add(b2);
		panel.add(Box.createVerticalStrut(5));
		panel.add(b3);
		panel.add(Box.createVerticalStrut(5));
		panel.add(b4);
	}
	
	//BorderLayout����
	void setBorderPanle(JPanel panel) {
		panel.setLayout(new BorderLayout());
		panel.setToolTipText("BorderLayout");
		panel.setBackground(Color.WHITE);
		
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.MAGENTA);
		b3.setBackground(Color.ORANGE);
		b4.setBackground(Color.WHITE);

		panel.add(b1, BorderLayout.NORTH);
		panel.add(b2, BorderLayout.WEST);
		panel.add(b3, BorderLayout.EAST);
		panel.add(b4, BorderLayout.SOUTH);
	}
	
}

public class Panel2 {

	public static void main(String[] args) {
		PanelTest2 f = new PanelTest2();
	}

}
