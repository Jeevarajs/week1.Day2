package week1.dayS5;

public class Sumofdigits {
	public static void main(String[] args) {
		int input=654;
		int sum=0;
		while (input>0) {
			int rem = input%10;//4
			sum=sum+rem;
			input=input/10;
			
		}
		System.out.println(sum);
		
	}

}
