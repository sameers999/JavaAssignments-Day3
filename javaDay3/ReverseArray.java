package javaDay3;

public class ReverseArray {
	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4,5,6,7,8,9};
		System.out.println("Original array: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println("Array in Reverse Order: ");
		//Loop through the array in Reverse Order
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
