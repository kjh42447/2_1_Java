//ppt + �̰�����
package ch08_practice;

import java.awt.*;
import javax.swing.*;

class FlowLayout02_Base extends JFrame {
	   private JPanel panel;   // ������

	   public FlowLayout02_Base() {
	      setTitle("FlowLayoutTest");                                    // �������� ����
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      panelLayout();                                                    // �����ӿ� ������Ʈ ��ġ
	      add(panel);
	      pack();                                                             // ������ �ϼ�
	      setVisible(true);                                                  // ������ ����
	   }

	   private void panelLayout() {          // �г� ���� : �гο� ������Ʈ ��ġ
	      panel = new JPanel(); 
	      panel.setLayout(new FlowLayout(FlowLayout.CENTER)); // �г��� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
	      
	      // �гο� ��ư�� �����Ͽ� �߰�
	      panel.add(new JButton("Button1"));
	      panel.add(new JButton("Button2"));
	      panel.add(new JButton("Button3"));
	      panel.add(new JButton("B4"));
	      panel.add(new JButton("Long Button5"));
	   }
	
}

public class FlowLayout02 {

	public static void main(String[] args) {
		FlowLayout02_Base f = new FlowLayout02_Base();
	}

}
