//import the packages for using the classes in them into this class
import java.awt.*;
import javax.swing.*;

/**
 *A CLASS FOR CREATING ABOUT PANEL
 */
public class About extends JPanel{
	public About(){
		//Create a Label & an image icon in it
		JLabel label1 = new JLabel(new ImageIcon("images/java.gif"));
		//adding label1 to the JPanel
	  	this.add(label1);
	  	//Create a Label & put a HTML script
		JLabel label2 = new JLabel("<html><li>JAVA™ Notepad</li><li><p>Ver# 2.0</li>"
		+"<li><p>Coded by: Suraj Dubey</li><li><p>St. Francis Institute Of Technology</li><li>"
		+"<p>dbysuraj@gmail.com</p>"
		+"<p>CopyRight© 2012-2013</li></html>");
		//adding label2 to the JPanel
		this.add(label2);
	}
}