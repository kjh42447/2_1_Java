//예제10-4에 회원가입을 추가하고 버튼에 이벤트를 추가하라
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
				JOptionPane.showMessageDialog(null, "해당 아이디는 이미 존재합니다.");
			}
			else {
				account.put(idField.getText(), pwField.getPassword());
				JOptionPane.showMessageDialog(null, "회원가입을 축하합니다.");
			}
		});
		panel.add(signUp);
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//로그인
	class Login implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(account.containsKey(idField.getText())) {
				//비밀번호 체크
				if(Arrays.equals(account.get(idField.getText()), pwField.getPassword())) {
					JOptionPane.showMessageDialog(null, "" + idField.getText() + " 회원님 환영합니다.");
					idField.requestFocus(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
					pwField.requestFocus(true);
				}
				
			}
			
			else {
				JOptionPane.showMessageDialog(null, "해당 계정은 존재하지 않습니다.");
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
