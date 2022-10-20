//예제 10-10에 이미지 크기를 설정하는 메뉴 버튼을 추가하라.
package ch10_example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class ImageViewer extends JFrame {
	private JLabel label;
	private JMenuItem open, exit, reSize;
	private ViewerListener viewerlistener = new ViewerListener();
	
	public ImageViewer() {
		setTitle("ImageViewer");
		setSize(600, 300);
		
		//파일
		JMenuBar mbar = new JMenuBar();
		JMenu file = new JMenu("File");
		open = new JMenuItem("Open");
		open.addActionListener(viewerlistener);
		file.add(open);
		exit = new JMenuItem("Exit");
		exit.addActionListener(viewerlistener);
		file.add(exit);
		mbar.add(file);
		
		//편집
		JMenu edit = new JMenu("Edit");
		reSize = new JMenuItem("Change Size");
		reSize.addActionListener(viewerlistener);
		edit.add(reSize);
		mbar.add(edit);
		setJMenuBar(mbar);
		
		label = new JLabel();
		JPanel panel = new JPanel();
		panel.add(label, "Center");
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//파일 열기
	class ViewerListener implements ActionListener{
		private ImageIcon icon = new ImageIcon();
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == open) {
				JFileChooser chooser = new JFileChooser();
				int r = chooser.showOpenDialog(getContentPane());
				if(r == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getAbsolutePath();
					icon = new ImageIcon(name);
					label.setIcon(icon);
				}
				
			}
			else if(source == exit) {
				System.exit(0);
			}
			
			else if(source == reSize) {
				Image image = icon.getImage();
				ReSizeFrame rsf = new ReSizeFrame();
				rsf.enter.addActionListener(ale -> {
					try {
						int x = Integer.parseInt(rsf.width.getText());
						int y = Integer.parseInt(rsf.height.getText());
						label.setIcon(new ImageIcon(image.getScaledInstance(x, y, Image.SCALE_DEFAULT)));
						rsf.setVisible(false);
					}
					catch (Exception exeption) {
						JOptionPane.showMessageDialog(null, "자연수를 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
					}
				});
				
			}
			
		}
		
		//크기 설정 다이얼로그
		class ReSizeFrame extends JFrame{
			private JTextField width, height;
			private JButton enter;
			
			public ReSizeFrame() {
				setSize(230, 130);
				setResizable(false);
				setLayout(new FlowLayout());
				
				add(new JLabel("길이"));
				width = new JTextField(15);
				add(width);
				add(new JLabel("높이"));
				height = new JTextField(15);
				add(height);
				enter = new JButton("확인");
				
				add(enter);
				
				setVisible(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
		}
		
	}
	
}

public class Example10_10_1 {

	public static void main(String[] args) {
		new ImageViewer();
	}

}
