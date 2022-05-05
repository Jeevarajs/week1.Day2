package week1.day1;

import java.util.Iterator;

public class Fibonaaci {
public static void main(String[] args) {
	int firstnumber= 0;
	int secondnumber=1;
	int range=8;
	for (int i=1; i <=range; i++) {
		System.out.println(firstnumber);
		int sum=firstnumber+secondnumber;
		firstnumber=secondnumber;
		secondnumber=sum;
		
	}
}
}
