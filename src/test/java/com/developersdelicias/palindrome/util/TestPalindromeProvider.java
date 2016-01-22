package com.developersdelicias.palindrome.util;

import java.util.ArrayList;
import java.util.List;

public class TestPalindromeProvider {
	
	public static List<String> validPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("oso");
		list.add("taco cat");
		list.add("Borrow or rob?");
		list.add("1");
		
		list.add("Anita lava la tina");
		list.add("Campus motto: Bottoms up Mac.");
		list.add("Marge lets Norah see Sharon’s telegram.");
		
		list.add("A man, a plan, a canal, Panama!");
		list.add("A Toyota! Race fast, safe car! A Toyota!");
		list.add("A new order began, a more Roman age bred Rowena.");
		list.add("Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.");
		return list;
	}
	
	public static List<String> invalidPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("");
		list.add(null);
		list.add("not a palindrome");
		list.add("!#$%&()=?+´*12345678980");
		return list;	
	}
}
