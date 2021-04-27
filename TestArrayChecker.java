import static org.junit.Assert.*;
import org.junit.Test;
/**
 * This JUnit test case tests the method isOrderInts and isOrderStrings from the ArrayChecker class
 * 8 tests total: testPositiveAscendingNumbers(), testPositiveDesendingOrder(), testNegativeNumbers(), testSameNumber(),
 * testAscendingWords(), testStringandInt(), testSameStartofWord(), testNotAscendingOrder().
 * 
 * @author Thomas Putman
 * @version March 13, 2018
 * 
 */
public class TestArrayChecker {
	/**
	 * This tests method isOrderInts to ensure that the test returns true when testing
	 * for numbers that are in ascending order.
	 */
	@Test
	public void testPositiveAscendingNumbers() {
		int[]arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertTrue(ArrayChecker.isOrderInts(arr));
	}
	/**
	 * This tests method isOrderInts to ensure that the test returns false when testing 
	 * for numbers that are in ascending order because in fact they are in descending order.
	 */
	@Test
	public void testPositiveDesendingOrder() {
		int[]arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		assertFalse(ArrayChecker.isOrderInts(arr));
	}
	/**
	 * This tests method isOrderInts to ensure that the test returns false even when 
	 * using negative numbers that are not in ascending order.
	 */
		@Test
	public void testNegativeNumbers() {
		int[]arr = {-14, -67, -1, -3, -5};
		assertFalse(ArrayChecker.isOrderInts(arr));
	}
	/**
	 * This tests method isOrderInts to insure that the same number in a set 
	 * returns true because it is in ascending order.
	 */
	@Test
	public void testSameNumeber() {
		int[]arr = {33, 33, 33, 33, 33, 33};
		assertTrue(ArrayChecker.isOrderInts(arr));
	}
	/**
	 * This tests method compareOrderInts to ensure that the program returns 
	 * true on a basic set of words in ascending order.
	 */
	@Test
	public void testAscendingWords() {
		String[]arr = {"apple", "bear", "cat", "snail"};
		assertTrue(ArrayChecker.isOrderStrings(arr));
	}
	/**
	 * This tests method compareOrderInts to ensure that the program returns 
	 * false when checking an int and a string for ascending order.
	 */
	@Test
	public void testStringandInt() {
		String[]arr = {"viola", "1"};
		assertFalse(ArrayChecker.isOrderStrings(arr));
	}
	/**
	* This tests method compareOrderInts to ensure that the program returns true when 
	* the first letter is the same in all of the words, but it checks the next numbers 
	* to see if it is in ascending order.
    */
	@Test
	public void testSameStartOfWord() {
		String[]arr = {"Tammy", "ten", "tommy", "trace"};
		assertTrue(ArrayChecker.isOrderStrings(arr));
	}
	/**
	* This tests method compareOrderInts to ensure that the program will return
	* false when testing for ascending order because this is not in ascending order.
	*/
	@Test
	public void testNotAscendingOrder() {
		String[]arr = {"pear", "cat", "family", "giraffe", "pencil"};
		assertFalse(ArrayChecker.isOrderStrings(arr));
	}
}
