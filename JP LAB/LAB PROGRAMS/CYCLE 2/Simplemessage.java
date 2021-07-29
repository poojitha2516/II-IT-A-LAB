// Develop an applet in Java that displays a simple message.

import java.awt.*;
import java.applet.*;

/*<applet code = "Simplemessage" width = 200 height = 300></applet> */

public class Simplemessage extends Applet {
	public void paint(Graphics g) {
		setForeground(Color.red);
		setBackground(Color.yellow);
		g.drawString("Applet is a special type of program that is embedded in the webpage to generate the dynamic content..",50,60);
	}
}
