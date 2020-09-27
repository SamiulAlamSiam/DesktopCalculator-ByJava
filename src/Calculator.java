import javax.swing.JOptionPane;

public class Calculator {
	public void Start()
	{
		String fn =JOptionPane.showInputDialog("Input 1st Number ");
		String sn =JOptionPane.showInputDialog("Input 2nd Number ");
		
		int f=Integer.parseInt(fn);
		int s= Integer.parseInt(sn);
		
		String cn =JOptionPane.showInputDialog("Enter Your Operation");
		
		switch(cn)
		{
		case "+":
			int sum=f+s;
			JOptionPane.showMessageDialog(null, "The Sum is : "+sum, "RESULT", JOptionPane.INFORMATION_MESSAGE);	
			break;
		case "-":
			int sub=f-s;
			JOptionPane.showMessageDialog(null, "The Sub is : "+sub, "RESULT", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "*":
			int mul=f*s;
			JOptionPane.showMessageDialog(null, "The Multiplication is : "+mul, "RESULT", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "/":
			float div=(float)f/s;
			JOptionPane.showMessageDialog(null, "The Division is : "+div, "RESULT", JOptionPane.INFORMATION_MESSAGE);
			break;
			default :
				JOptionPane.showMessageDialog(null, "Invalid Opeator");			
		}
	}
}
