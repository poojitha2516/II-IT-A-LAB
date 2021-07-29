/* Develop an applet in Java that receives an integer in one text field, and computes its factorial Value and
returns it in another text field, when the button named “Compute” is clicked. */

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/* <applet code = "Factorial.class" height = 300 width = 300></applet> */

public class Factorial extends Applet implements ActionListener {
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public void init() {
		l1 = new Label("Enter any Integer: ");
		add(t1);
		t1 = new TextField(5);
		add(t1);
		b1 = new Button("Calculate");
		add(b1);
		b1.addActionListener(this);
		l2 = new Label("Factorial of given Integer is: ");
		add(l2);
		t2 = new TextField(10);
		add(t2);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			int fact = fact(Integer.parseInt(t1.getText()));
			t2.setText(String.valueOf(fact));
		}
	}
	
	int fact(int f) {
		if(f==0) {
			return 1;
		}
		else {
			return f * fact(f-1);
		}
	}
}
