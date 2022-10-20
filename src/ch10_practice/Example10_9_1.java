//ppt 복붙
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
		setTitle("메뉴 이벤트");
		setSize(500, 200);
		
		menuBar = new JMenuBar();
		
		//메뉴
		menu = new JMenu("메뉴");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		//메뉴항목
		menuItem1 = new JMenuItem("메뉴항목 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		ImageIcon icon = new ImageIcon(".\\src\\image\\치즈피자.png");
		menuItem2 = new JMenuItem("메뉴항목2", icon);
		menu.add(menuItem2);
		
		//라디오버튼
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		
		rbMenuItem1 = new JRadioButtonMenuItem("라디오버튼 메뉴항목1");
		rbMenuItem1.setSelected(true);
		group.add(rbMenuItem1);
		menu.add(rbMenuItem1);
		
		rbMenuItem2 = new JRadioButtonMenuItem("라디오버튼 메뉴항목2");
		group.add(rbMenuItem2);
		menu.add(rbMenuItem2);
		
		//체크박스
		menu.addSeparator();
		cbMenuItem1 = new JCheckBoxMenuItem("체크박스 메뉴항목1");
		cbMenuItem1.addItemListener(this);
		menu.add(cbMenuItem1);
		
		cbMenuItem2 = new JCheckBoxMenuItem("체크박스 메뉴항목2");
		menu.add(cbMenuItem2);
		
		//서브매뉴
		menu.addSeparator();
		submenu = new JMenu("서브 메뉴");
		submenu.setMnemonic(KeyEvent.VK_S);
		
		sbMenuItem1 = new JMenuItem("서브 메뉴 항목1");
		sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		submenu.add(sbMenuItem1);
		
		sbMenuItem2 = new JMenuItem("서브 메뉴 항목2");
		submenu.add(sbMenuItem2);
		menu.add(submenu);
		
		//두번째 메뉴
		menu = new JMenu("메뉴2");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);
		
		 setJMenuBar(menuBar);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "메뉴 항목 1이 선택되었습니다.");
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cbMenuItem1) {
			JOptionPane.showMessageDialog(this, "체크 박스 메뉴 항목 1이 변경되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		new Example10_9_1();
	}

}
