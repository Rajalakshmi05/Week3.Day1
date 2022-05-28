package Week3.Day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp()
	{
		System.out.println("Connect to WhatsApp");
	}
	public void takeVideo()
	{
		System.out.println("Take all Videos in smartPhone");
	}
	public static void main(String[] args) {
		
		SmartPhone Mysp= new SmartPhone();
		
		Mysp.makeCall();
		Mysp.connectWhatsApp();
		Mysp.saveContact();
		Mysp.sendMsg();
		Mysp.takeVideo();

	}

}

