package javaDay3;

public class EvenPosition_Array {
	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4,5,6,7,8};
		System.out.println("Elements of Given array present on even position: ");
		//loop through the array by incrementing value of i by 2
		//here, i will start from 1 as first even positioned element is present at position 1.
		for (int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
