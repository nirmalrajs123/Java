package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class gui {
public static void main(String arg[]){
	JFrame f=new JFrame("hello");
	f.setSize(600,600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	button1 bt=new button1();
	f.add(bt);

}
}
class button1 extends JPanel implements ActionListener {
JTextField d1=new JTextField("_________");
JTextField d2=new JTextField("_________");
JTextField d3=new JTextField("...");
JButton b1=new JButton("1");
JButton b2=new JButton("2");
button1(){
    d1.setBounds(50,100, 200,30);
	d2.setBounds(10,10,110,100);
	b1.setBounds(50,50,110,100);
	b2.setBounds(50,50,110,100);
	add(d1);add(d2);add(b1);add(b2);add(d3);
    b1.addActionListener(this);  
    b2.addActionListener(this);
}
	public void actionPerformed(ActionEvent e) {
	       String s1=d1.getText();
	       String s2=d1.getText();    
	       int a=Integer.parseInt(s1);
	       int b=Integer.parseInt(s2);
	       int c=0;
	       if(e.getSource()==b1) {
	    	  c=a+b; 
	       }
	       String res=String.valueOf(c);
	       d3.setText(res);
	        
}
	
}