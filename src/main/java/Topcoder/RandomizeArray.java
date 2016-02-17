package Topcoder;
/****
 * randomly order the array element 
 * running time is O(n)
 */
import java.util.Random;

public class RandomizeArray {

	
	public int[] randomize(int[] array) {
		Random rnd = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i);
			int temp = array[i];
			array[i] = array[index];
			array[index]= temp;

		}
		return array;
	}
	private void printArray(int[] arr) {
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] array= {2,1,3,4,5,6};
		RandomizeArray obj = new RandomizeArray();
		obj.printArray(obj.randomize(array));
		
	}
}
