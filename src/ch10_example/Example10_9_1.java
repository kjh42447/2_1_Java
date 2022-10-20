//���� �ֹ� �гΰ� ���� ���� �г��� �ִ� �������� �ۼ��϶�. �� �г��� �޴��ٷ� �̵��� �����ϴ�.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//���� ���� �г� Ŭ����
class ExplainPanel extends JPanel{
	private JPanel buttonPanel = new JPanel();
	private JPanel explainPanel = new JPanel();
	private JRadioButton cheeseButton, combinationButton, potatoButton, bulgogiButton;
	private JLabel imageLabel = new JLabel();
	private JTextArea explainArea = new JTextArea();
	
	//�̹���
	ImageIcon cheese = new ImageIcon(".\\src\\image\\ġ������.png");
	ImageIcon combination = new ImageIcon(".\\src\\image\\�޺���̼�����.png");
	ImageIcon potato = new ImageIcon(".\\src\\image\\������������.png");
	ImageIcon bulgogi = new ImageIcon(".\\src\\image\\�Ұ������.png");
	
	public ExplainPanel() {
		setSize(300, 250);
		setLayout(new BorderLayout());
		
		//��ư �г�
		buttonPanel.setLayout(new GridLayout(0, 1, 0, 1));
		ButtonGroup bg = new ButtonGroup();
		cheeseButton = new JRadioButton("Cheese");
		combinationButton = new JRadioButton("combination");
		potatoButton = new JRadioButton("potato");
		bulgogiButton = new JRadioButton("bulgogi");
		
		cheeseButton.addActionListener(e -> {
			imageLabel.setIcon(cheese);
			explainArea.setText("ġ�� ���� �����");
		});
		combinationButton.addActionListener(e -> {
			imageLabel.setIcon(combination);
			explainArea.setText("�޺���̼� ���� �����");
		});
		potatoButton.addActionListener(e -> {
			imageLabel.setIcon(potato);
			explainArea.setText("�������� ���� �����");
		});
		bulgogiButton.addActionListener(e -> {
			imageLabel.setIcon(bulgogi);
			explainArea.setText("�Ұ�� ���� �����");
		});
		
		buttonPanel.add(cheeseButton);
		bg.add(cheeseButton);
		buttonPanel.add(combinationButton);
		bg.add(combinationButton);
		buttonPanel.add(potatoButton);
		bg.add(potatoButton);
		buttonPanel.add(bulgogiButton);
		bg.add(bulgogiButton);
		
		//�޴� ���� �г�
		explainPanel.setLayout(new BoxLayout(explainPanel, BoxLayout.Y_AXIS));
		imageLabel.setAlignmentX(CENTER_ALIGNMENT);
		explainArea.setAlignmentX(CENTER_ALIGNMENT);
		explainArea.setFont(new Font(null, Font.BOLD, 12));
		explainArea.setEditable(false);
		explainPanel.add(imageLabel);
		explainPanel.add(Box.createVerticalStrut(10));
		explainPanel.add(explainArea);
		
		
		explainPanel.setBackground(Color.WHITE);
		buttonPanel.setBackground(Color.BLACK);
		
		this.add(buttonPanel, BorderLayout.WEST);
		this.add(explainPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	
}

//���� �ֹ� �г� Ŭ����
class OrderPanel extends JPanel {
	private Integer[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private JPanel defaultPanel = new JPanel(new BorderLayout());
	private JPanel textePanel = new JPanel();
	private JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 30, 10));
	private JPanel pricePanel = new JPanel();
	
	private JCheckBox chb = new JCheckBox("ġ������");
	private JCheckBox cob = new JCheckBox("�޺���̼�����");
	private JCheckBox pob = new JCheckBox("������������");
	private JCheckBox bub = new JCheckBox("�Ұ������");
	
	private JComboBox<Integer> chc = new JComboBox<Integer>(count);
	private JComboBox<Integer> coc = new JComboBox<Integer>(count);
	private JComboBox<Integer> poc = new JComboBox<Integer>(count);
	private JComboBox<Integer> buc = new JComboBox<Integer>(count);
	
	private JLabel printPrice = new JLabel("���� �հ� �ݾ� : 0");
	
	public OrderPanel() {
		setSize(500, 450);
		setLayout(new FlowLayout());
		
		//�г�
		JPanel bp1 = new JPanel();
		JPanel bp2 = new JPanel();
		JPanel bp3 = new JPanel();
		JPanel bp4 = new JPanel();
		
		defaultPanel.setBackground(Color.WHITE);
		textePanel.setBackground(Color.WHITE);
		buttonPanel.setBackground(Color.WHITE);
		pricePanel.setBackground(Color.WHITE);
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
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�.");
		label.setFont(new Font("SansSerif", Font.BOLD, 20));
		textePanel.add(label);
		
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
		chb.addActionListener(e -> {
			chc.setEnabled(!chc.isEnabled());
			printPrice.setText("���� �հ� �ݾ� : " + sumPrice());
		});
		cob.addActionListener(e -> {
			coc.setEnabled(!coc.isEnabled());
			printPrice.setText("���� �հ� �ݾ� : " + sumPrice());
		});
		pob.addActionListener(e -> {
			poc.setEnabled(!poc.isEnabled());
			printPrice.setText("���� �հ� �ݾ� : " + sumPrice());
		});
		bub.addActionListener(e -> {
			buc.setEnabled(!buc.isEnabled());
			printPrice.setText("���� �հ� �ݾ� : " + sumPrice());
		});
		
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
		
		//����ǥ��
		bp1.add(new JLabel("15000��"));
		bp2.add(new JLabel("17000��"));
		bp3.add(new JLabel("18000��"));
		bp4.add(new JLabel("20000��"));
		
		//�޺��ڽ�
		chc.addActionListener(new ComboBoxEvent());
		coc.addActionListener(new ComboBoxEvent());
		poc.addActionListener(new ComboBoxEvent());
		buc.addActionListener(new ComboBoxEvent());
		
		chc.setEnabled(false);
		coc.setEnabled(false);
		poc.setEnabled(false);
		buc.setEnabled(false);
		
		chc.setAlignmentX(Component.CENTER_ALIGNMENT);
		coc.setAlignmentX(Component.CENTER_ALIGNMENT);
		poc.setAlignmentX(Component.CENTER_ALIGNMENT);
		buc.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		bp1.add(chc);
		bp2.add(coc);
		bp3.add(poc);
		bp4.add(buc);
		
		buttonPanel.add(bp1);
		buttonPanel.add(bp2);
		buttonPanel.add(bp3);
		buttonPanel.add(bp4);
		
		pricePanel.add(printPrice);
		
		defaultPanel.add(textePanel, BorderLayout.NORTH);
		defaultPanel.add(buttonPanel, BorderLayout.CENTER);
		defaultPanel.add(pricePanel, BorderLayout.SOUTH);
		add(defaultPanel);
		
		setVisible(false);
	}
	
	//�޺��ڽ� �̺�Ʈ
	class ComboBoxEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<Integer> cb = (JComboBox<Integer>) e.getSource();
			printPrice.setText("���� �հ� �ݾ� : " + sumPrice());
		}
		
	}
	
	//��� �޼ҵ�
	int sumPrice() {
		int price = 0;
		if(chb.isSelected()) {
			price += (int) chc.getSelectedItem()*15000;
		}
		if(cob.isSelected()) {
			price += (int) coc.getSelectedItem()*17000;
		}
		if(pob.isSelected()) {
			price += (int) poc.getSelectedItem()*18000;
		}
		if(bub.isSelected()) {
			price += (int) buc.getSelectedItem()*20000;
		}
		return price;
	}
}

//���� ������
class PizzaOrderFrame9_1 extends JFrame{
	private JPanel defalultPanel = new JPanel();
	private OrderPanel orderPanel = new OrderPanel();
	private ExplainPanel explainPanel = new ExplainPanel();
	private JMenuBar mb = new JMenuBar();
	private JMenu menu = new JMenu("ȭ�� �̵�");
	private JMenuItem order, explain;
	
	public PizzaOrderFrame9_1() {
		setTitle("Pizza");
		setSize(500, 500);
		
		orderPanel.setBackground(Color.WHITE);
		explainPanel.setBackground(Color.WHITE);
		
		order = new JMenuItem("�ֹ� ȭ��");
		order.addActionListener(e -> {
			explainPanel.setVisible(false);
			orderPanel.setVisible(true);
		});
		explain = new JMenuItem("�޴� ����");
		explain.addActionListener(e -> {
			orderPanel.setVisible(false);
			explainPanel.setVisible(true);
		});
		menu.add(explain);
		menu.add(order);
		mb.add(menu);
		setJMenuBar(mb);
		
		defalultPanel.setLayout(new BorderLayout());
		defalultPanel.add(orderPanel, BorderLayout.CENTER);
		defalultPanel.add(explainPanel, BorderLayout.CENTER);
		add(defalultPanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Example10_9_1 {

	public static void main(String[] args) {
		new PizzaOrderFrame9_1();
	}

}
