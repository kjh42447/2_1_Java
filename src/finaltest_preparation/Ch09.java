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
		
		//액션리스너
		b.addActionListener(e -> {
			//람다식은 요래 쓰셈
		});
		
		//키
		b.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {			}
			public void keyReleased(KeyEvent e) {		}
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_ENTER) {
					//내용쓰셈
				}
			}
		});
		
		//마우스
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
			public void mouseClicked(MouseEvent e) {		}	//어뎁터는 요래 쓰셈
		});
		
		//마우스 모션
		b.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {		}
			public void mouseDragged(MouseEvent e) {	}
		});
		
		//레이블
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setIcon(new ImageIcon("주소넣으셈"));
		
		//스크롤페인
		JTextArea ta = new JTextArea(10, 30);
		JScrollPane sp = new JScrollPane(ta);
		panel.add(sp);
		
		//메뉴바 단축키 10장 85p 키보드와의 관계
		
		//대화상자(다이얼로그)
		JOptionPane.showMessageDialog(this, "내용", "제목?", JOptionPane.WARNING_MESSAGE);
	}
	
}

class GT extends JFrame {
	
	
	class GP extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(null, 10, 10, this);	//이미지, x, y, this
		}
		
	}
	
	public GT() {
		setResizable(false);

		GP gp = new GP();
		add(gp);
		
		int 반복회수 = 1;
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Ch09 {
	//한정된 타입 매개변수
	public static <T extends Comparable> T getMax(T[] a) {
		return a[0];	//요런식으로 쓰셈
	}
	
	//와일드카드
	public static double sumOfList(ArrayList<? extends Number> list) {
		return 0;	//extends없애면 한도 없는 와일드카드, super쓰면 하한 있는 와일드카드
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
		GT gt = new GT();

		
		//반복자 Iterator e = list.iterator();
		
		//큐, 맵
		Queue<String> queue = new LinkedList<String>();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이렇게", "입력함");
		hm.remove("이렇게");
	}

}
