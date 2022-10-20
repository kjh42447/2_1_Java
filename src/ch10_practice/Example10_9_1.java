//ppt ����
package ch10_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_9_1 extends JFrame implements ActionListener, ItemListener {
	private JMenuBar menuBar;
	private JMenu menu, submenu;
	private JMenuItem menuItem1, menuItem2;
	private JMenuItem sbMenuItem1, sbMenuItem2;
	private JRadioButtonMenuItem rbMenuItem1, rbMenuItem2;
	private JCheckBoxMenuItem cbMenuItem1, cbMenuItem2;
	
	public Example10_9_1() {
		setTitle("�޴� �̺�Ʈ");
		setSize(500, 200);
		
		menuBar = new JMenuBar();
		
		//�޴�
		menu = new JMenu("�޴�");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		//�޴��׸�
		menuItem1 = new JMenuItem("�޴��׸� 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		ImageIcon icon = new ImageIcon(".\\src\\image\\ġ������.png");
		menuItem2 = new JMenuItem("�޴��׸�2", icon);
		menu.add(menuItem2);
		
		//������ư
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		
		rbMenuItem1 = new JRadioButtonMenuItem("������ư �޴��׸�1");
		rbMenuItem1.setSelected(true);
		group.add(rbMenuItem1);
		menu.add(rbMenuItem1);
		
		rbMenuItem2 = new JRadioButtonMenuItem("������ư �޴��׸�2");
		group.add(rbMenuItem2);
		menu.add(rbMenuItem2);
		
		//üũ�ڽ�
		menu.addSeparator();
		cbMenuItem1 = new JCheckBoxMenuItem("üũ�ڽ� �޴��׸�1");
		cbMenuItem1.addItemListener(this);
		menu.add(cbMenuItem1);
		
		cbMenuItem2 = new JCheckBoxMenuItem("üũ�ڽ� �޴��׸�2");
		menu.add(cbMenuItem2);
		
		//����Ŵ�
		menu.addSeparator();
		submenu = new JMenu("���� �޴�");
		submenu.setMnemonic(KeyEvent.VK_S);
		
		sbMenuItem1 = new JMenuItem("���� �޴� �׸�1");
		sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		submenu.add(sbMenuItem1);
		
		sbMenuItem2 = new JMenuItem("���� �޴� �׸�2");
		submenu.add(sbMenuItem2);
		menu.add(submenu);
		
		//�ι�° �޴�
		menu = new JMenu("�޴�2");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);
		
		 setJMenuBar(menuBar);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "�޴� �׸� 1�� ���õǾ����ϴ�.");
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cbMenuItem1) {
			JOptionPane.showMessageDialog(this, "üũ �ڽ� �޴� �׸� 1�� ����Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new Example10_9_1();
	}

}
