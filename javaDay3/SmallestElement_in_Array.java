package javaDay3;

public class SmallestElement_in_Array {
	public static void main(String[] args) {
		int [] arr = new int[] {15, 25, 36, 12, 3, 56, 80, 99};
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest Element Present in Given Array: " + min);
	}
}
