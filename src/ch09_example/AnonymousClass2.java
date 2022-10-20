//무명클래스를 이용하여 메뉴바를 이용해 창을 생성하는 동작을 추가하라.
package ch09_example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UnitConvertorBase extends JFrame {
	JPanel defaultpanel = new JPanel();
	
	public UnitConvertorBase() {
		setTitle("Unit Convertor");
		setSize(100, 100);
		defaultpanel.setLayout(new GridLayout(2, 0));
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("변환");
		JMenuItem mi1 = new JMenuItem("거리");
		JMenuItem mi2 = new JMenuItem("온도");
		JMenuItem mi3 = new JMenuItem("무게");
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LengthConvertor f = new LengthConvertor();
			}
			
		});
		
		mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TemperatureConvertor f = new TemperatureConvertor();	
			}
			
		});
		
		mi3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				WeightConvertor f = new WeightConvertor();	
			}
			
		});
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		mb.add(m1);
		setJMenuBar(mb);
		
		add(defaultpanel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}

//길이
class LengthConvertor extends UnitConvertorBase{
	
	public LengthConvertor() {
		super();
		setSize(230, 200);
		setLocation(0, 0);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//바꿀 값
		ButtonGroup bgi = new ButtonGroup();
		JRadioButton kmbi = new JRadioButton("km");
		JRadioButton mbi = new JRadioButton("m");
		JRadioButton cmbi = new JRadioButton("cm");
		JRadioButton mmbi = new JRadioButton("mm");
		bgi.add(kmbi);	panel1.add(kmbi);
		bgi.add(mbi);	panel1.add(mbi);
		bgi.add(cmbi);	panel1.add(cmbi);
		bgi.add(mmbi);	panel1.add(mmbi);
		
		JLabel label1 = new JLabel("변환할 값");
		JTextField textinput = new JTextField(10);
		panel1.add(label1);
		panel1.add(textinput);
		defaultpanel.add(panel1);
		
		//표시
		ButtonGroup bgo = new ButtonGroup();
		JRadioButton kmbo = new JRadioButton("km");
		JRadioButton mbo = new JRadioButton("m");
		JRadioButton cmbo = new JRadioButton("cm");
		JRadioButton mmbo = new JRadioButton("mm");
		bgo.add(kmbo);	panel2.add(kmbo);
		bgo.add(mbo);	panel2.add(mbo);
		bgo.add(cmbo);	panel2.add(cmbo);
		bgo.add(mmbo);	panel2.add(mmbo);
		
		JLabel label2 = new JLabel("변환한 값");
		JTextField textoutput = new JTextField(10);
		panel2.add(label2);
		panel2.add(textoutput);
		defaultpanel.add(panel2);
		
	}
	
}

//온도
class TemperatureConvertor extends UnitConvertorBase{
	
	public TemperatureConvertor() {
		super();
		setSize(200, 200);
		setLocation(0, 300);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//바꿀 값
		JLabel label1 = new JLabel("변환할 값");
		panel1.add(label1);
		
		ButtonGroup bgi = new ButtonGroup();
		JRadioButton ci = new JRadioButton("섭씨");
		JRadioButton fi = new JRadioButton("화씨");
		bgi.add(ci);	panel1.add(ci);
		bgi.add(fi);	panel1.add(fi);
		
		JTextField textinput = new JTextField(10);
		panel1.add(textinput);
		defaultpanel.add(panel1);
		
		//표시
		JLabel label2 = new JLabel("변환한 값");
		panel2.add(label2);
		
		ButtonGroup bgo = new ButtonGroup();
		JRadioButton co = new JRadioButton("섭씨");
		JRadioButton fo = new JRadioButton("화씨");
		bgo.add(co);	panel2.add(co);
		bgo.add(fo);	panel2.add(fo);
		
		JTextField textoutput = new JTextField(10);
		panel2.add(textoutput);
		defaultpanel.add(panel2);
	}
	
}

//무게
class WeightConvertor extends UnitConvertorBase{
	
	public WeightConvertor() {
		super();
		setSize(230, 200);
		setLocation(0, 600);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//바꿀 값
		ButtonGroup bgi = new ButtonGroup();
		JRadioButton ti = new JRadioButton("t");
		JRadioButton kgi = new JRadioButton("kg");
		JRadioButton gi = new JRadioButton("g");
		JRadioButton mgi = new JRadioButton("mg");
		bgi.add(ti);	panel1.add(ti);
		bgi.add(kgi);	panel1.add(kgi);
		bgi.add(gi);	panel1.add(gi);
		bgi.add(mgi);	panel1.add(mgi);
		
		JLabel label1 = new JLabel("변환할 값");
		JTextField textinput = new JTextField(10);
		panel1.add(label1);
		panel1.add(textinput);
		defaultpanel.add(panel1);
		
		//표시
		ButtonGroup bgo = new ButtonGroup();
		JRadioButton to = new JRadioButton("t");
		JRadioButton kgo = new JRadioButton("kg");
		JRadioButton go = new JRadioButton("g");
		JRadioButton mgo = new JRadioButton("mg");
		bgo.add(to);	panel2.add(to);
		bgo.add(kgo);	panel2.add(kgo);
		bgo.add(go);	panel2.add(go);
		bgo.add(mgo);	panel2.add(mgo);
		
		JLabel label2 = new JLabel("변환한 값");
		JTextField textoutput = new JTextField(10);
		panel2.add(label2);
		panel2.add(textoutput);
		defaultpanel.add(panel2);
	}
	
}

public class AnonymousClass2 {

	public static void main(String[] args) {
		UnitConvertorBase f = new UnitConvertorBase();
	}

}
