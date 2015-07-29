
package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String sam=JOptionPane.showInputDialog("what is your name?");
		String can=JOptionPane.showInputDialog("where do you live");
		JOptionPane.showMessageDialog(null, " now I know your name is "+sam +" and you live in "+can);
	}

	

}
