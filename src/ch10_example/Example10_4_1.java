//����10-4�� ȸ�������� �߰��ϰ� ��ư�� �̺�Ʈ�� �߰��϶�
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class LoginFrame1 extends JFrame{
	private JPanel panel = new JPanel();
	private JTextField idField = new JTextField(20);
	private JPasswordField pwField = new JPasswordField(20);
	private JButton login, signUp;
	private HashMap<String, char[]> account = new HashMap<String, char[]>(); 
	
	public LoginFrame1() {
		setTitle("Example10_4_1");
		setSize(280, 150);
		setResizable(false);
		
		panel.add(new JLabel("id     "));
		idField.addActionListener(new Login());
		panel.add(idField);
		panel.add(new JLabel("pass"));
		pwField.addActionListener(new Login());
		panel.add(pwField);
		
		login = new JButton("login");
		login.addActionListener(new Login());
		panel.add(login);
		
		signUp = new JButton("sign up");
		signUp.addActionListener(e -> {
			if(account.containsKey(idField.getText())) {
				JOptionPane.showMessageDialog(null, "�ش� ���̵�� �̹� �����մϴ�.");
			}
			else {
				account.put(idField.getText(), pwField.getPassword());
				JOptionPane.showMessageDialog(null, "ȸ�������� �����մϴ�.");
			}
		});
		panel.add(signUp);
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//�α���
	class Login implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(account.containsKey(idField.getText())) {
				//��й�ȣ üũ
				if(Arrays.equals(account.get(idField.getText()), pwField.getPassword())) {
					JOptionPane.showMessageDialog(null, "" + idField.getText() + " ȸ���� ȯ���մϴ�.");
					idField.requestFocus(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					pwField.requestFocus(true);
				}
				
			}
			
			else {
				JOptionPane.showMessageDialog(null, "�ش� ������ �������� �ʽ��ϴ�.");
				idField.requestFocus(true);
			}
			
		}
		
	}
	
}

public class Example10_4_1 {
	
	public static void main(String[] args) {
		LoginFrame1 f = new LoginFrame1();
	}
	
}
