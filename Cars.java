package week1.day2;

public class Cars {
	public void applybreak() {
		System.out.println("applybreak");
	}
	public void applygear( ) {
		System.out.println("applygear");
	}
	public void switchonAc( ) {
		System.out.println("switchonAc");
	}
	public void acclerate() {
		System.out.println("acclerate");
	}
	public static void main(String[] args) {
		Cars vehicle =new Cars();
		vehicle.acclerate() ;
		
	}

}
