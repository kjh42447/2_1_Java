//키이벤트 예제 복사
package ch09_practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyEventTest2_1 extends JFrame implements KeyListener {
	
	public KeyEventTest2_1() {
		setTitle("KeyEventTest2_1");
		setSize(300, 200);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		add(tf);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "KeyTyped ");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "KeyPressed ");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "KeyReleased ");
	}
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + ", " + e.isControlDown() + ", " + e.isShiftDown();
		System.out.println(s + ", " + c + ", " + keyCode + ", " + modifiers);
	}
	
}

public class Example9_3_2{
	
	public static void main(String[] args) {
		KeyEventTest2_1 f = new KeyEventTest2_1();
	}

}
