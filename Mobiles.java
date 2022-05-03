package week1.day2;

public class Mobiles {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	public void sendDocument() {
		System.out.println("sendDocument");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[] args) {
		Mobiles alexa =new Mobiles();
		alexa.call();
	}
	
	

}
