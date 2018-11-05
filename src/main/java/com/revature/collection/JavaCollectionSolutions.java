package com.revature.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollectionSolutions implements JavaCollection {
	
	public static void main(String[] args) {
		new JavaCollectionSolutions();
	}
	
	public JavaCollectionSolutions() {
		for (int n : digits (89342)) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println(countCharacters("Hello World").toString());
		
		System.out.println(isPalindrome(123454321));
		
		System.out.println(balancedBrackets("{[({})]}"));
		
		Person[] people = new Person[] {new Person(5),new Person(3), new Person(4),new Person(6),new Person(1)};
		
		Set<Person> tree = sort(people);
		for (Person person:tree)
			System.out.println(person.age);
		
		
	}

	@Override
	public List<Integer> digits(int n) throws IllegalArgumentException {
		if (n<=0) {
			throw new IllegalArgumentException();
		}
		
		List<Integer> output = new ArrayList<Integer>();
		for (int i=0;Math.pow(10, i)<n;i++)
			output.add(0, (int) ((n%Math.pow(10,i+1))/Math.pow(10, i)));
		return output;
	}
	
	@Override
	public Set<Person> sort(Person[] array) throws IllegalArgumentException {
		if (array==null) {
			throw new IllegalArgumentException();
		}
		
		TreeSet<Person> output = new TreeSet<>();
		
		for (Person person: array) {
			output.add(person);
		}
		
		return output;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		if (brackets==null)
			throw new IllegalArgumentException("String cannot be null");
		
		LinkedList<Character> stack = new LinkedList<Character>();
		
		for (int n=0;n<brackets.length();n++) {
			if (brackets.charAt(n)=='(' || brackets.charAt(n)=='{' || brackets.charAt(n)=='[') {
				stack.push(brackets.charAt(n));
			}
			else if (brackets.charAt(n)==')' && (char)stack.pop()!='(') {
				return false;
			}
			else if (brackets.charAt(n)=='}' && (char)stack.pop()!='{') {
				return false;
			}
			else if (brackets.charAt(n)==']' && (char)stack.pop()!='[') {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public boolean isPalindrome(int n) throws IllegalArgumentException {
		if (n<0) {
			throw new IllegalArgumentException();
		}
		
		List<Integer> digitsArray = digits(n);
		for (int i=0;i<digits(n).size()/2;i++) {
			if (digitsArray.get(i)!=digitsArray.get(digitsArray.size()-1-i)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Map<Character, Integer> countCharacters(String string) throws IllegalArgumentException {
		Map<Character, Integer> theMap = new HashMap<Character,Integer>();
		
		int amount = 0;
		for (char c:string.toCharArray()) {
			amount = string.split(c+"").length-1;
			if (!theMap.containsKey(c)) {
				theMap.put(c, amount);
			}
		}
		
		return theMap;
	}

}