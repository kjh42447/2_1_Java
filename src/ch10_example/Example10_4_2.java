//화면전환을 통한 로그아웃 버튼을 추가하라.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class LoginFrame2 extends JFrame{
	private JPanel panel1 = new JPanel(), panel2 = new JPanel();
	private JTextField idField = new JTextField(20);
	private JPasswordField pwField = new JPasswordField(20);
	private JButton login, logout, signUp;
	private HashMap<String, char[]> account = new HashMap<String, char[]>(); 
	
	public LoginFrame2() {
		setTitle("Example10_4_2");
		setSize(280, 150);
		setLayout(null);
		setResizable(false);
		
		//패널1
		panel1.setLayout(new FlowLayout());
		panel1.add(new JLabel("id     "));
		idField.addActionListener(new Login());
		panel1.add(idField);
		panel1.add(new JLabel("pass"));
		pwField.addActionListener(new Login());
		panel1.add(pwField);
		
		login = new JButton("login");
		login.addActionListener(new Login());
		panel1.add(login);
		
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
		panel1.add(signUp);
		
		//패널2
		panel2.setLayout(new FlowLayout());
		logout = new JButton("로그아웃");
		logout.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
			panel2.setVisible(false);
			panel1.setVisible(true);
		});
		panel2.add(logout);
		
		add(panel1);
		add(panel2);
		
		panel1.setBounds(10, 10, 250, 150);
		panel2.setBounds(10, 10, 250, 150);
		panel2.setVisible(false);
		
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
					idField.setText("");
					pwField.setText("");
					panel1.setVisible(false);
					panel2.setVisible(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
					pwField.requestFocus(true);
					pwField.setText("");
				}
				
			}
			
			else {
				JOptionPane.showMessageDialog(null, "해당 계정은 존재하지 않습니다.");
				idField.requestFocus(true);
				idField.setText("");
				pwField.setText("");
			}
			
		}
		
	}
	
}

public class Example10_4_2 {

	public static void main(String[] args) {
		new LoginFrame2();
	}

}
