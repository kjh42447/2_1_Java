//���� 10-10�� �̹��� ũ�⸦ �����ϴ� �޴� ��ư�� �߰��϶�.
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
		
		//����
		JMenuBar mbar = new JMenuBar();
		JMenu file = new JMenu("File");
		open = new JMenuItem("Open");
		open.addActionListener(viewerlistener);
		file.add(open);
		exit = new JMenuItem("Exit");
		exit.addActionListener(viewerlistener);
		file.add(exit);
		mbar.add(file);
		
		//����
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
	
	//���� ����
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
						JOptionPane.showMessageDialog(null, "�ڿ����� �Է��ϼ���", "���", JOptionPane.ERROR_MESSAGE);
					}
				});
				
			}
			
		}
		
		//ũ�� ���� ���̾�α�
		class ReSizeFrame extends JFrame{
			private JTextField width, height;
			private JButton enter;
			
			public ReSizeFrame() {
				setSize(230, 130);
				setResizable(false);
				setLayout(new FlowLayout());
				
				add(new JLabel("����"));
				width = new JTextField(15);
				add(width);
				add(new JLabel("����"));
				height = new JTextField(15);
				add(height);
				enter = new JButton("Ȯ��");
				
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
