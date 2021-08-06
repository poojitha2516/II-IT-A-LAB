/* Write a Java program that creates a user interface to perform integer divisions. The user enters two numbers in the
text fields, Num1 and Num2. The division of Num1 and Num 2 is displayed in the Result field when the Divide
button is clicked. If Num1 or Num2 were not an integer, the program would throw a Number Format Exception. If
Num2 were Zero, the program would throw an Arithmetic Exception. Display the exception in a message dialog box.*/


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "Division" width = 230 height = 250></applet> */

public class Division extends Applet implements ActionListener {
	String msg;
	TextField num1,num2,result;
	Label l1,l2,l3;
	Button div;
	
	public void init() {
		l1 = new Label("Dividend");
		l2 = new Label("Divisor");
		l3 = new Label("Result");
		num1 = new TextField(10);
		num2 = new TextField(10);
		result = new TextField(10);
		div = new Button("Click");
		div.addActionListener(this);
		add(l1);
		add(num1);
		add(l2);
		add(num2);
		add(l3);
		add(result);
		add(div);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		int num1 = 0,num2 = 0;
		if(s.equals("Click")) {
			if(this.num1.getText().isEmpty() | this.num2.getText().isEmpty()) {
				msg = "Enter the valid numbers: ";
				repaint();
			}
			else {
				try {
					num1 = Integer.parseInt(this.num1.getText());
					num2 = Integer.parseInt(this.num2.getText());
					int num3 = num1 / num2;
					result.setText(String.valueOf(num3));
					msg = "Division Successfull..";
					repaint();
				}
				catch(NumberFormatException ex) {
					System.out.println(ex);
					result.setText("");
					msg = "NumberFormatException - Non-numeric";
					repaint();
				}
				catch(ArithmeticException e) {
					System.out.println("Cant be divide by Zero"+e);
					result.setText("");
					msg = "Cant be divide by Zero";
					repaint();
				}
			}
		}
	}
	
	public void paint(Graphics g) {
		g.drawString(msg,30,70);
	}
}
