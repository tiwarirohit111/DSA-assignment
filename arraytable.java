package array;

import java.util.Scanner;
import java .lang.Math;

public class arraytable {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
	    
		for(int i = 2; i< Math.sqrt(num); i++) {
	        while(num%i == 0) {
	        	num = num/i;
	       
	           System.out.print(i+" ");
	           
	        }
	     }
	     if(num >2) {
	        System.out.println(num);
	     }
}
	}
