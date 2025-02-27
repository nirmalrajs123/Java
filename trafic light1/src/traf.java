

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class traf {
	public static void main(String arg[]) {
	   JFrame f=new JFrame("TRAFIC LIGHT");
	   f.setSize(600,600);
	   f.setVisible(true);
	   f.setLayout(null);
	  trafic t=new trafic();
		f.add(t);
	}
	}
	 class trafic extends JPanel implements ActionListener{
		JRadioButton r1;
		JRadioButton r2;
		JRadioButton r3;
		Color red;
	    Color yellow;
	    Color green;
		trafic(){
			setBounds(0,0,400,400);
			r1=new JRadioButton("RED");
			r2=new JRadioButton("YELLOW");
			r3=new JRadioButton("GREEN");
		r1.setSelected(true);
		red=Color.red;
		yellow=getBackground();
		green=getBackground();
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		
		add(r1);
		add(r2);
		add(r3);
	    r1.addActionListener(this);
	    r2.addActionListener(this);	
	    r3.addActionListener(this);	

		}
		public void actionPerformed(ActionEvent e) {
			if (r1.isSelected()==true) {
				red=Color.red;
				yellow=getBackground();
				green=getBackground();
			}if (r2.isSelected()==true) {
				red=getBackground();
				yellow=Color.yellow;
				green=getBackground();
			}if (r1.isSelected()==true) {
				red=getBackground();
				yellow=getBackground();
				green=Color.green;
			}repaint();
			
		}
		 public void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 g.drawOval(50, 50, 50, 50);
			 g.drawOval(50, 50, 50, 50);
			 g.drawOval(50, 50, 50, 50);
			 g.setColor(red);
			 g.fillOval(50, 50, 50, 50);
			 g.setColor(yellow);
			 g.fillOval(50, 50, 50, 50);
			 g.setColor(green);
			 g.fillOval(50, 50, 50, 50);
		 }
	}
	 

