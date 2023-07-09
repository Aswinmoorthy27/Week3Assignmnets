package Org.system;

public class Desktop extends Computer{

	
	public void desktopSize() 
	{
		System.out.println("Compact size desktop");
	}
	
	public static void main(String[] args) {
		
		Desktop dsk=new Desktop();
		dsk.desktopSize();
		dsk.computerModel(3);
	}
}
