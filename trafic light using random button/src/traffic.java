import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class traffic{
public static void main(String arg[]) throws Exception {
	JFrame f=new JFrame("TRAFFIC LIGHT");
	f.setSize(600,600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	Trafficlights t=new Trafficlights();
	f.add(t);
	}
}
class Trafficlights extends JPanel implements ActionListener{
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	Color red;
	Color yellow;
	Color green;
	public Trafficlights(){
		r1=new JRadioButton("RED");
		r2=new JRadioButton("YELLOW");
		r3=new JRadioButton("GREEN");
		r1.setBounds(0,0,600,480);
		r2.setBounds(0,0,650,480);
		r3.setBounds(0,0,700,480);
		r1.setSelected(true);
		red();
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);bg.add(r2);bg.add(r3);
	add(r1);add(r2);add(r3);
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(r1.isSelected()==true) {
			red();
		}else if(r2.isSelected()==true) {
		yellow();
		}else if(r3.isSelected()==true) {
			green();
		}
		repaint();
	
	
}
	void red() {
		this.red=Color.red;
		this.yellow=Color.white;
		this.green=Color.white;	
		repaint();
	}
	void yellow() {
		this.red=Color.white;
		this.yellow=Color.yellow;
		this.green=Color.white;
		repaint();
	}
	void green() {
		this.red=Color.white;
		this.yellow=Color.white;
		this.green=Color.green;	
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(red);
		g.fillOval(100, 100, 100, 100);
		g.setColor(yellow);
		g.fillOval(100, 220, 100, 100);
		g.setColor(green);
		g.fillOval(100, 340, 100, 100);
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 220, 100, 100);
		g.drawOval(100, 340, 100, 100);
	}
	}

