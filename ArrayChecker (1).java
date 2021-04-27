/**
 * This program compares the contents of arrays of ints to see if it is in 
 * ascending order and to check if an array of strings is in lexicographic order.
 * @author Thomas Putman
 * @version March 13, 2018
 */
public class ArrayChecker {
	
	/**
	 * This method checks if an array of ints is in ascending order
	 * @param array 'arr' being checked if it is in order
	 * @return true if in ascending order or false if not
	 */
	public static boolean isOrderInts (int[]arr) {
		for(int i=0; i < arr.length-1; i++) {
		    if(arr[i] > arr[i+1]) {
		       return false;
		    }
		  }
		  return true;
		}
	
	/**
	 * This method checks if an array of strings is in lexicographic order.
	 * @param array 'arr' being checked if it is in order
	 * @return true if in lexicographic order or false if not in order
	 */
	public static boolean isOrderStrings (String[]arr) {
		String temp = arr[0];
		for (int i = 0; i <arr.length; i++) {
			if (temp.compareTo(arr[i]) > 0) {
				return false;
			}
			temp = arr[i];
			}
			return true;
		}
}