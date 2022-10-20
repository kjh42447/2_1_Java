//Example8_2_1 �ҽ������� PianoBaseŬ������ ��ӹ޾� ��ư�� ����� ���� �������� �����Ͽ� ǥ���ϴ� ���α׷��� �ۼ��϶�.
package ch08_example;

import java.awt.*;
import javax.swing.*;

class ColorPiano extends PianoBase {
	int R, G, B;
	public ColorPiano() {
		super();
		setTitle("ColorPiano");
		
		R = (int)(Math.random()*256);
		G = (int)(Math.random()*256);
		B = (int)(Math.random()*256);
		getContentPane().setBackground(new Color(R, G, B));
	}
	
	@Override
	void PianoGrid(JPanel panel) {
		panel.setSize(600, 150);
		panel.setLayout(new GridLayout(0, 10, 5, 3));
		
		R = (int)(Math.random()*256);
		G = (int)(Math.random()*256);
		B = (int)(Math.random()*256);
		panel.setBackground(new Color(R, G, B));
		
		for(int i = 0; i < 10; i++) {
			JButton button = new JButton("C" + i);
			button.setBackground(new Color(R, G, B));
			R = (int)(Math.random()*256);
			G = (int)(Math.random()*256);
			B = (int)(Math.random()*256);
			panel.add(button);
		}
	}
	
	@Override
	void PianoAbsolute(JPanel panel) {
		panel.setSize(600, 130);
		panel.setLayout(null);
		
		R = (int)(Math.random()*256);
		G = (int)(Math.random()*256);
		B = (int)(Math.random()*256);
		panel.setBackground(new Color(R, G, B));
		
		for(int i = 0; i < 10; i++) {
			JButton button = new JButton("D" + i);
			button.setLocation(i*59, 0);
			button.setSize(53, 130);
			
			button.setBackground(new Color(R, G, B));
			R = (int)(Math.random()*256);
			G = (int)(Math.random()*256);
			B = (int)(Math.random()*256);
			panel.add(button);
		}
	}
	
}

public class Example8_2_2 {

	public static void main(String[] args) {
		ColorPiano f = new ColorPiano();
	}

}
