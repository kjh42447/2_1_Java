//���� �ֹ�ȭ���� �ۼ��϶�. ���� ������ üũ�ϰ� ������ ���� �� �ִ�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class PizzaOrderFrame2 extends JFrame {
	private Integer[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public PizzaOrderFrame2() {
		setSize(500, 400);
		setTitle("JAVA Pizza");
		
		//�г�
		JPanel defaultpanel = new JPanel();
		JPanel textepanel = new JPanel();
		JPanel buttonpanel = new JPanel(new GridLayout(2, 2, 10, 10));
		JPanel bp1 = new JPanel();
		JPanel bp2 = new JPanel();
		JPanel bp3 = new JPanel();
		JPanel bp4 = new JPanel();
		
		defaultpanel.setBackground(Color.WHITE);
		textepanel.setBackground(Color.WHITE);
		buttonpanel.setBackground(Color.WHITE);
		bp1.setBackground(Color.WHITE);
		bp2.setBackground(Color.WHITE);
		bp3.setBackground(Color.WHITE);
		bp4.setBackground(Color.WHITE);
		
		
		bp1.setLayout(new BoxLayout(bp1, BoxLayout.Y_AXIS));
		bp2.setLayout(new BoxLayout(bp2, BoxLayout.Y_AXIS));
		bp3.setLayout(new BoxLayout(bp3, BoxLayout.Y_AXIS));
		bp4.setLayout(new BoxLayout(bp4, BoxLayout.Y_AXIS));
		
		//�̹���
		ImageIcon cheese = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\ġ������.png");
		ImageIcon combination = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\�޺���̼�����.png");
		ImageIcon potato = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\������������.png");
		ImageIcon bulgogi = new ImageIcon("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\�Ұ������.png");
		
		//���̺�
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����ϼ���.");
		label.setFont(new Font("SansSerif", Font.BOLD, 15));
		textepanel.add(label);
		
		JLabel chl = new JLabel(cheese);
		JLabel col = new JLabel(combination);
		JLabel pol = new JLabel(potato);
		JLabel bul = new JLabel(bulgogi);
		
		chl.setAlignmentX(Component.CENTER_ALIGNMENT);
		col.setAlignmentX(Component.CENTER_ALIGNMENT);
		pol.setAlignmentX(Component.CENTER_ALIGNMENT);
		bul.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		bp1.add(chl);
		bp2.add(col);
		bp3.add(pol);
		bp4.add(bul);
		
		//üũ�ڽ�
		JCheckBox chb = new JCheckBox("ġ������");
		JCheckBox cob = new JCheckBox("�޺���̼�����");
		JCheckBox pob = new JCheckBox("������������");
		JCheckBox bub = new JCheckBox("�Ұ������");
		
		chb.setAlignmentX(Component.CENTER_ALIGNMENT);
		cob.setAlignmentX(Component.CENTER_ALIGNMENT);
		pob.setAlignmentX(Component.CENTER_ALIGNMENT);
		bub.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		chb.setBackground(Color.WHITE);
		cob.setBackground(Color.WHITE);
		pob.setBackground(Color.WHITE);
		bub.setBackground(Color.WHITE);
		
		bp1.add(chb);
		bp2.add(cob);
		bp3.add(pob);
		bp4.add(bub);
		
		//�޺��ڽ�
		JComboBox<Integer> chc = new JComboBox<Integer>(count);
		JComboBox<Integer> coc = new JComboBox<Integer>(count);
		JComboBox<Integer> poc = new JComboBox<Integer>(count);
		JComboBox<Integer> buc = new JComboBox<Integer>(count);
		
		chc.setAlignmentX(Component.CENTER_ALIGNMENT);
		coc.setAlignmentX(Component.CENTER_ALIGNMENT);
		poc.setAlignmentX(Component.CENTER_ALIGNMENT);
		buc.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		bp1.add(chc);
		bp2.add(coc);
		bp3.add(poc);
		bp4.add(buc);
		
		buttonpanel.add(bp1);
		buttonpanel.add(bp2);
		buttonpanel.add(bp3);
		buttonpanel.add(bp4);
		
		defaultpanel.add(textepanel);
		defaultpanel.add(buttonpanel);
		add(defaultpanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example8_5_2 {

	public static void main(String[] args) {
		PizzaOrderFrame2 f = new PizzaOrderFrame2();
	}

}
