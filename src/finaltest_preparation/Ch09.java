//9, 10, 11, 12
package finaltest_preparation;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.html.HTMLDocument.Iterator;

class ETC extends JFrame {
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public ETC() {
		JButton b = new JButton();
		
		//�׼Ǹ�����
		b.addActionListener(e -> {
			//���ٽ��� �䷡ ����
		});
		
		//Ű
		b.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {			}
			public void keyReleased(KeyEvent e) {		}
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_ENTER) {
					//���뾲��
				}
			}
		});
		
		//���콺
		b.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {		}
			public void mousePressed(MouseEvent e) {	
				int x = e.getX();
			}
			public void mouseExited(MouseEvent e) {			}
			public void mouseEntered(MouseEvent e) {		}
			public void mouseClicked(MouseEvent e) {		}
		});
		b.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {		}	//��ʹ� �䷡ ����
		});
		
		//���콺 ���
		b.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {		}
			public void mouseDragged(MouseEvent e) {	}
		});
		
		//���̺�
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setIcon(new ImageIcon("�ּҳ�����"));
		
		//��ũ������
		JTextArea ta = new JTextArea(10, 30);
		JScrollPane sp = new JScrollPane(ta);
		panel.add(sp);
		
		//�޴��� ����Ű 10�� 85p Ű������� ����
		
		//��ȭ����(���̾�α�)
		JOptionPane.showMessageDialog(this, "����", "����?", JOptionPane.WARNING_MESSAGE);
	}
	
}

class GT extends JFrame {
	
	
	class GP extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(null, 10, 10, this);	//�̹���, x, y, this
		}
		
	}
	
	public GT() {
		setResizable(false);

		GP gp = new GP();
		add(gp);
		
		int �ݺ�ȸ�� = 1;
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Ch09 {
	//������ Ÿ�� �Ű�����
	public static <T extends Comparable> T getMax(T[] a) {
		return a[0];	//�䷱������ ����
	}
	
	//���ϵ�ī��
	public static double sumOfList(ArrayList<? extends Number> list) {
		return 0;	//extends���ָ� �ѵ� ���� ���ϵ�ī��, super���� ���� �ִ� ���ϵ�ī��
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
		GT gt = new GT();

		
		//�ݺ��� Iterator e = list.iterator();
		
		//ť, ��
		Queue<String> queue = new LinkedList<String>();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("�̷���", "�Է���");
		hm.remove("�̷���");
	}

}
