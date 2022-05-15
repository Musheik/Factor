package com.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {
	
	
	public void usingBuffer () {
		// first method
				String given = "Nila Maryam";
				
				StringBuffer buffer = new StringBuffer();
				
				buffer.append(given);
				System.out.println(buffer.reverse());
				
		}
	
	public void usingownlogic() {
		
		// second method
				String given = "musheik fahath";
				
				char[] characterarray = given.toCharArray();
				String reversed = "";
				 
				
				// tghis is regular for loop in ascending order  for(int i =0 ; i<=n ; i++);
				
				// here i need in desending order
				
				for (int i = characterarray.length-1 ; i>=0 ; i--) {
					
					reversed= reversed+characterarray[i];
				}
				
				System.out.println(reversed);
		}
	
	
	public void usingcollections(){
		String given = "safwan ali & hayyan ali";
		
		char[] chararray = given.toCharArray();
		
		// we are using array list class from collection
		
		List <Character> list = new ArrayList<Character>(); 
		
		// using adavnced for loop
		
		for (Character character : chararray ) {
			list.add(character);
			
		}
		
		Collections.reverse(list);
		
		// reverse list in void so im using iterator
		
		ListIterator iterator =  list . listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}	
	
	public static void main(String[] args) {
		ReverseAString aString = new ReverseAString();
		
		aString.usingcollections();

}}
