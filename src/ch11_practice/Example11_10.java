//복붙
package ch11_practice;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Example11_10 extends JFrame {
	BufferedImage image;
	int width;
	int height;
	
	class MyPanel_10 extends JPanel {
		public void paintComponent(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
		
		public Dimension getPreferredSize() {
			if(image == null) {
				return new Dimension(100, 100);
			}
			else {
				return new Dimension(image.getWidth(null), image.getHeight(null));
			}
		}
	}
	
	public Example11_10() {
		try {
			File input = new File(".\\src\\image\\치즈피자.png");
			image = ImageIO.read(input);
			width = image.getWidth();
			System.out.println(width);
			height = image.getHeight();
			System.out.println(height);
			
			for(int r = 0; r < height; r++) {
				for(int c = 0; c < width; c++) {
					Color color = new Color(image.getRGB(c, r));
					int red = (int) (color.getRed());
					int green = (int) (color.getGreen());
					int blue = (int) (color.getBlue());
					int avg = (red + green + blue) / 3;
					Color newColor = new Color(avg, avg, avg);
					image.setRGB(c, r, newColor.getRGB());
				}
			
			}
			
			File output = new File("output.png");
			ImageIO.write(image, "png", output);
			add(new MyPanel_10());
			pack();
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch (IOException e) {
			System.out.println("이미지 읽기 실패");
		}
	
	}
	
	public static void main(String[] args) {
		Example11_10 f = new Example11_10();
	}

}
