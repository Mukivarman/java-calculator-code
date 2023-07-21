
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

import javax.swing.*;

public class Calc implements ActionListener{
	JFrame j;
	JTextField tf,tf1;
	JLabel l;
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15; 
	public Calc() {
		l=new JLabel("CALCULATOR");
		l.setVisible(true);
		l.setBounds(200,10,400,40);
		//display
		tf=new JTextField();
		tf.setVisible(true);
		tf.setBounds(30,40,400,60);
		tf.setEditable(false);	
		
		//button
b1=new JButton("1");   b1.setVisible(true);      b1.setBounds(40,130,50,50);
b2=new JButton("2");	  b2.setVisible(true);	 	b2.setBounds(100,130,50,50);
b3=new JButton("3");   b3.setVisible(true);	b3.setBounds(160,130,50,50);
b4=new JButton("4");	b4.setVisible(true);		b4.setBounds(40,200,50,50);
b5=new JButton("5");	b5.setVisible(true);	b5.setBounds(100,200,50,50);
b6=new JButton("6");	b6.setVisible(true);	b6.setBounds(160,200,50,50);
b7=new JButton("7");	b7.setVisible(true);	b7.setBounds(40,270,50,50);
b8=new JButton("8");	b8.setVisible(true);	b8.setBounds(100,270,50,50);
b9=new JButton("9");	b9.setVisible(true);	b9.setBounds(160,270,50,50);
b0=new JButton("0");	b0.setVisible(true);	b0.setBounds(40,340,170,50);
b10=new JButton("%");	b10.setVisible(true); b10.setBounds(230,130,100,50);
b11=new JButton("x");	b11.setVisible(true); b11.setBounds(230,200,100,50);
b12=new JButton("-");	b12.setVisible(true); b12.setBounds(230,270,100,50);	
b13=new JButton("+");	b13.setVisible(true); b13.setBounds(230,340,100,50);		
b14=new JButton("=");	b14.setVisible(true); b14.setBounds(340,130,70,120);
b15=new JButton("clear");	b15.setVisible(true); b15.setBounds(340,270,70,120);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
//jframe
		j=new JFrame("CALCULATOR");
		j.setVisible(true);
		j.setSize(500, 500);
		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//add
		j.add(l);  j.add(b5);   j.add(b10);
		j.add(tf); j.add(b4);	j.add(b11);
		j.add(b0);	j.add(b6);	j.add(b12);
		j.add(b1);	j.add(b7);	j.add(b13);
		j.add(b2);	j.add(b8);	j.add(b14);
		j.add(b3);	j.add(b9);	j.add(b15);
	}
	public static void main(String []args) {
		Calc c=new Calc();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		tf.setText(tf.getText() + "1");
	}
		else if(e.getSource()==b2) {
			tf.setText(tf.getText() + "2");
		}
		else if(e.getSource()==b3) {
			tf.setText(tf.getText() + "3");
		}
		else if(e.getSource()==b4) {
			tf.setText(tf.getText() + "4");
		}
		else if(e.getSource()==b5) {
			tf.setText(tf.getText() + "5");
		}
		else if(e.getSource()==b6) {
			tf.setText(tf.getText() + "6");
		}
		else if(e.getSource()==b7) {
			tf.setText(tf.getText() + "7");
		}
		else if(e.getSource()==b8) {
			tf.setText(tf.getText() + "8");
		}
		else if(e.getSource()==b9) {
			tf.setText(tf.getText() + "9");
		}
		else if(e.getSource()==b0) {
			tf.setText(tf.getText() + "0");
		}
		else if(e.getSource()==b10) {
			tf.setText(tf.getText() +"%" );
		}
		else if(e.getSource()==b11) {
			tf.setText(tf.getText() + "x");
		}
		else if(e.getSource()==b12) {
			tf.setText(tf.getText() + "-");
		}
		else if(e.getSource()==b13) {
			tf.setText(tf.getText() + "+");
		}
		else if(e.getSource()==b15) {
			tf.setText("");
		}
		String s=tf.getText();
	   try { if(e.getSource()==b14) {
	    	if(s.contains("%")) {
	    		String[] a=s.split("%");
	    		int[] in=new int[a.length]; 
	    		for(int i=0;i<a.length;i++) {
	    			in[i]=Integer.parseInt(a[i]);
	    			}
	    		tf.setText("");
	    		try {
    				int c=in[0]/in[1];
    				String ts=Integer.toString(c);
    				tf.setText(ts);
    			}catch(ArithmeticException k){
    				System.out.println(k);
    			}
	    	
	    		}
	    		
	    }
	    if(e.getSource()==b14) {
	    	if(s.contains("x")) {
	    		String[] a=s.split("x");
	    		int[] in=new int[a.length]; 
	    		for(int i=0;i<a.length;i++) {
	    			in[i]=Integer.parseInt(a[i]);
	    			}
	    		tf.setText("");
	    		try {
    				int c=in[0]*in[1];
    				String ts=Integer.toString(c);
    				tf.setText(ts);
    			}catch(ArithmeticException k){
    				System.out.println(k);
    			}
	    	
	    		}
	    	if(e.getSource()==b14) {
		    	if(s.contains("-")) {
		    		String[] a=s.split("-");
		    		int[] in=new int[a.length]; 
		    		for(int i=0;i<a.length;i++) {
		    			in[i]=Integer.parseInt(a[i]);
		    			}
		    		tf.setText("");
		    		try {
	    				int c=in[0]-in[1];
	    				String ts=Integer.toString(c);
	    				tf.setText(ts);
	    			}catch(ArithmeticException k){
	    				System.out.println(k);
	    			}
		    	
		    		}}
	    	if(e.getSource()==b14) {
		    	if(s.contains("+")) {
		    		String[] a=s.split("\\+");
		    		int[] in=new int[a.length]; 
		    		for(int i=0;i<a.length;i++) {
		    			in[i]=Integer.parseInt(a[i]);
		    			}
		    		tf.setText("");
		    		try {
	    				int c=in[0]+in[1];
	    				String ts=Integer.toString(c);
	    				tf.setText(ts);
	    			}catch(ArithmeticException k){
	    				System.out.println(k);
	    			}
		    	
		    	}	    		
	}}}catch(Exception l) {
		System.out.println(l);
	}
	    	
	    }
	    
}
