//로그인 화면을 작성하라. 로그인을 성공하면 텍스트 필드가 있는 패널을 연다.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class LoginFrame7_2 extends JFrame{
	private JPanel panel1 = new JPanel(), panel2 = new JPanel();
	private JTextField idField = new JTextField(20);
	private JPasswordField pwField = new JPasswordField(20);
	private JButton login, signUp;
	private JMenuBar mb = new JMenuBar();
	private JMenu menu = new JMenu("메뉴");
	private JMenuItem logout;
	private HashMap<String, char[]> account = new HashMap<String, char[]>(); 
	
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	public LoginFrame7_2() {
		setTitle("Example10_7_2");
		setSize(280, 230);
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
		panel2.setLayout(new BorderLayout());
		textField = new JTextField(30);
		textField.addActionListener(e -> {
			String text = textField.getText();
			textArea.append(text + "\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());
		});
		
		textArea = new JTextArea(7, 30);
		textArea.setEditable(false);
		
		scrollPane = new JScrollPane(textArea);
		
		panel2.add(textField, BorderLayout.NORTH);
		panel2.add(scrollPane, BorderLayout.CENTER);
		
		//메뉴바
		logout = new JMenuItem("로그아웃");
		logout.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
			panel2.setVisible(false);
			panel1.setVisible(true);
		});
		menu.add(logout);
		mb.add(menu);
		this.setJMenuBar(mb);
		
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

public class Example10_7_2 {

	public static void main(String[] args) {
		new LoginFrame7_2();
	}

}
