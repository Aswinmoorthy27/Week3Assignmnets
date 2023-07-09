package inheritance;

public class Myphone {
	
	public static void main(String[] args) {
		iphone ip=new iphone();
		ip.startApp();
		ip.shutdown();
		ip.increaseVolume();
		ip.makeCall();
		ip.sendSMS();
		
		/*
		 * iphod ipg=new iphod(); ipg.Watchmovie(); ipg.startApp();
		 */
		
		Ios i=new Ios();
		i.startApp();
	}
	}
