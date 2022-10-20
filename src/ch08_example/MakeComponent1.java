//�����̳ʿ� JButten ������Ʈ�� �߰��ϰ� ȭ����ġ�� �߾������϶�. �������� �ܺο��� �����ͼ� ����϶�.
package ch08_example;

import javax.swing.*;
import java.awt.*;

public class MakeComponent1 extends JFrame {

	public MakeComponent1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(300, 200);
		setTitle("MakeComponent1");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ȭ�� ��ġ ����
		Dimension screenSize = kit.getScreenSize();
		setLocation(screenSize.width/2, screenSize.height/2);
		
		//������ ����
		Image img = kit.getImage("E:\\����\\2�г�\\1�б�\\��ü�������α׷���\\image\\icon1.png");
		setIconImage(img);
		
		//��ư ���̾ƿ�
		setLayout(new FlowLayout());
		JButton button1 = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		add(button1);
		add(button2);
	}
	
	public static void main(String[] args) {
		MakeComponent1 mc = new MakeComponent1();
	}

}
