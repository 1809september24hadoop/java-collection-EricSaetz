package com.revature.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Same rules, suggestions and guidelines as first assignment.
 * 
 * Feel free to use whatever you need for your solution related to collections.
**/
public interface JavaCollection {
	
	/**
	 * 1. Obtain each digit of an int.
	 * 
	 * f(153) = [1,5,3]
	 * f(32767) = [3,2,7,6,7]
	 * 
	 * Rule: Do NOT use the String or any related class.
	 * 
	 * Hint: Use modulus.
	 * 
	 * @return A list containing each digit of the int.
	 * 
	 * @throws IllegalArgumentException if n is 0 or less.
	**/
	public List<Integer> digits(int n) throws IllegalArgumentException;
	
	/**
	 * 2. Sort a given array using Comparable or Comparator.
	 * 
	 * Remember, you can use your own POJO on the implementation.
	 * 
	 * @return A sorted collection based on the input array.
	 * 
	 * @throws IllegalArgumentException if the array is null.
	**/
	public Set<?> sort(Person[] array) throws IllegalArgumentException;
	
	/**
	 * 3. The Brackets problem of the first assignment.
	 * 
	 * Rules: 
	 * - Do NOT use the Stack solution this time.
	 * - Use any other Collection instead.
	 *
	 * Hint: Use a LinkedList.
	 * 
	 * @throws IllegalArgumentException if brackets String is null.
	**/
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException;
	
	/**
	 * 4. Check if a number is palindrome using collections.
	 * 
	 * Hint: Use your digits solution.
	 * 
	 * @throws IllegalArgumentException if n is less than 0.
	 */
	public boolean isPalindrome(int n) throws IllegalArgumentException;
	
	/**
	 * 5. Count how many times each character existing in a String repeats using
	 * a map as the storing structure.
	 * 
	 * Hint: Remember, the key part of a map is a Set.
	 * 
	 * @return The Map containing each character and how many times it repeats.
	 * 
	 * @throws IllegalArgumentException if the string is null
	 */
	public Map<Character, Integer> countCharacters(String string) throws IllegalArgumentException;
}
