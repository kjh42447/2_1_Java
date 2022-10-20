//�α��� ȭ���� �ۼ��϶�. �α����� �����ϸ� �ؽ�Ʈ �ʵ尡 �ִ� �г��� ����.
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
	private JMenu menu = new JMenu("�޴�");
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
		
		//�г�1
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
				JOptionPane.showMessageDialog(null, "�ش� ���̵�� �̹� �����մϴ�.");
			}
			else {
				account.put(idField.getText(), pwField.getPassword());
				JOptionPane.showMessageDialog(null, "ȸ�������� �����մϴ�.");
			}
		});
		panel1.add(signUp);
		
		//�г�2
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
		
		//�޴���
		logout = new JMenuItem("�α׾ƿ�");
		logout.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ǿ����ϴ�.");
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
	
	//�α���
	class Login implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(account.containsKey(idField.getText())) {
				//��й�ȣ üũ
				if(Arrays.equals(account.get(idField.getText()), pwField.getPassword())) {
					JOptionPane.showMessageDialog(null, "" + idField.getText() + " ȸ���� ȯ���մϴ�.");
					idField.setText("");
					pwField.setText("");
					panel1.setVisible(false);
					panel2.setVisible(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					pwField.requestFocus(true);
					pwField.setText("");
				}
				
			}
			
			else {
				JOptionPane.showMessageDialog(null, "�ش� ������ �������� �ʽ��ϴ�.");
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
