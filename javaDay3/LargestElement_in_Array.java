package javaDay3;

public class LargestElement_in_Array {
	public static void main(String[] args) {
		//initialize array
		int [] arr = new int [] {35, 52, 74, 89,49};
		//initialize max with first element of array
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			//compare element of array with max
			if(arr[i] > max)
				max = arr[i];
		}
		System.out .println("Largest Element Present in given array:" + max);
	}
}
