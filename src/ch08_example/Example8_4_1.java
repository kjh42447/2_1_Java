//������ȯ ���α׷��� ȭ�鸸 ������.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class UnitConvertor1 extends JFrame {
	
	public UnitConvertor1() {
		setTitle("Unit Convertor");
		setResizable(false);
		setSize(250, 200);
		setLayout(new GridLayout(2, 0, 0, 10));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//�ٲ� ��
		ButtonGroup bgi = new ButtonGroup();
		JRadioButton kmbi = new JRadioButton("km");
		JRadioButton mbi = new JRadioButton("m");
		JRadioButton cmbi = new JRadioButton("cm");
		JRadioButton mmbi = new JRadioButton("mm");
		bgi.add(kmbi);	panel1.add(kmbi);
		bgi.add(mbi);	panel1.add(mbi);
		bgi.add(cmbi);	panel1.add(cmbi);
		bgi.add(mmbi);	panel1.add(mmbi);
		
		JLabel label1 = new JLabel("��ȯ�� ��");
		JTextField textinput = new JTextField(15);
		panel1.add(label1);
		panel1.add(textinput);
		add(panel1);
		
		//ǥ��
		ButtonGroup bgo = new ButtonGroup();
		JRadioButton kmbo = new JRadioButton("km");
		JRadioButton mbo = new JRadioButton("m");
		JRadioButton cmbo = new JRadioButton("cm");
		JRadioButton mmbo = new JRadioButton("mm");
		bgo.add(kmbo);	panel2.add(kmbo);
		bgo.add(mbo);	panel2.add(mbo);
		bgo.add(cmbo);	panel2.add(cmbo);
		bgo.add(mmbo);	panel2.add(mmbo);
		
		JLabel label2 = new JLabel("��ȯ�� ��");
		JTextField textoutput = new JTextField(15);
		panel2.add(label2);
		panel2.add(textoutput);
		add(panel2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example8_4_1 {

	public static void main(String[] args) {
		UnitConvertor1 f = new UnitConvertor1();
	}

}
