package org.system;

public class Desktop extends Computer{
public void desktopSize()
{
	System.out.println("My Desktop Size is:15.6inch");
}
	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.computerMode();
		d.desktopSize();
	}

}
