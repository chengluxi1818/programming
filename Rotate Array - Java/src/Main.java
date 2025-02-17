
public class Main {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] res = rotateRecursion(array1, 8);
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] rotate(int[] theArray, int pivot) {
		for(int i = pivot; i < theArray.length; i++) {
			int j = i;
			int count = pivot;
			while(count-- != 0) {
				int temp = theArray[j-1];
				theArray[j-1] = theArray[j];
				theArray[j] = temp;
				j--;
			}
		}
		
		return theArray;
	}
	
	public static int[] rotateRecursion(int[] theArray, int pivot) {
		int count = theArray.length - 1 - pivot;
		
		helper(theArray, pivot, count);
		
		return theArray;
	}
	
	public static void helper(int[] theArray, int pivot, int count) {
		if(pivot == 0) return;
		
		for(int i = pivot; i < pivot + count + 1; i++) {
			int temp = theArray[i-1];
			theArray[i-1] = theArray[i];
			theArray[i] = temp;
		}
		
		helper(theArray, pivot-1, count);
	}
}
