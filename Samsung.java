package Overriding;

public class Samsung implements Andriod{

	public void watchvedio() {
             System.out.println("Extending from Abstract class watchvedio");		
	}

	public void openanapp() {
        System.out.println("Extending from Abstract class Open App");		
		
	}
	
	public double  version(double x) 
	{
		System.out.println(x);
		return x;
	}
	
	public static void main(String[] args) {
		Samsung sx=new Samsung();
		sx.watchvedio();
		sx.openanapp();
		sx.version(4.12);
		
		
		
	}
	

}
