package array;

public class array1 {
public static void main(String[] args) {
	
	int [] arr = new int[10];
	for(int i = 0; i < arr.length;i++) {
		arr[i] = 2*(i+1);
		
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+  " ");
	}
	System.out.println();
	
}

}