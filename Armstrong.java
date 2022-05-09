package week1.dayS5;

public class Armstrong {
public static void main(String[] args) {
	int n=153;
	int originalnumber=n;
	int sum=0;
	while (n>0) {
		int rem = n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
		
		
	}
	if (sum==originalnumber) {
		System.out.println("given number is arm strong");
	}
	else {
		System.out.println("given number is not arm strong");
	}
}
}
