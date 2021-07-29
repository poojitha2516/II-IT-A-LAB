/* Write a java program that works as a simple calculator. 
Use a grid layout to arrange buttons for the digits and for the +, -,*, % operations.
Add a text field to display the result. Handle any possible exceptions like divided by zero.*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "Calculator" width = 500 height = 500></applet> */

public class Calculator extends Applet implements ActionListener {
	String msg = " ";
	int v1,v2,result;
	TextField t1;
	Button b[] = new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
	char OP;
	
	public void init() {
		Color k = new Color(10,89,90);
		setBackground(k);
		t1 = new TextField(50);
		GridLayout g1 = new GridLayout(6,3);
		setLayout(g1);
		for(int i=0;i<10;i++) {
			b[i] = new Button(""+i);
		}
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		mod = new Button("%");
		clear = new Button("Clear");
		EQ = new Button("=");
		t1.addActionListener(this);
		add(t1);
		for(int i=0;i<10;i++) {
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		for(int i=0;i<10;i++) {
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		char ch = s.charAt(0);
		if(Character.isDigit(ch)) {
			t1.setText(t1.getText()+s);
		}
		else {
			if(s.equals("+")) {
				v1 = Integer.parseInt(t1.getText());
				OP = '+';
				t1.setText("");
			}
			else if(s.equals("-")) {
				v1 = Integer.parseInt(t1.getText());
				OP = '-';
				t1.setText("");
			}
			else if(s.equals("*")) {
				v1 = Integer.parseInt(t1.getText());
				OP = '*';
				t1.setText("");
			}
			else if(s.equals("/")) {
				v1 = Integer.parseInt(t1.getText());
				OP = '/';
				t1.setText("");
			}
			else if(s.equals("%")) {
				v1 = Integer.parseInt(t1.getText());
				OP = '%';
				t1.setText("");
			}
		}
		
		if(s.equals("=")) {
			v2 = Integer.parseInt(t1.getText());
			if(OP == '+') {
				result = v1+v2;
			}
			else if(OP == '-') {
				result = v1-v2;
			}
			else if(OP == '*') {
				result = v1*v2;
			}
			else if(OP == '/') {
				result = v1/v2;
			}
			else if(OP == '%') {
				result = v1%v2;
			}
			t1.setText(""+result);
		}
		
		if(s.equals("Clear")) {
			t1.setText("");
		}
	}
}
