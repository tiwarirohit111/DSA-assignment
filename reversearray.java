package array;

import java.util.Scanner;

public class reversearray {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	int b = scn.nextInt();
	int x  = a*a;
	int y = b*b;
	
	int c = x + y + 2* a*b;
	System.out.println(c);
	

}
}