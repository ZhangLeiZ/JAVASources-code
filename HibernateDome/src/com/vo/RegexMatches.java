package com.vo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	public RegexMatches() {
		String line = "This order was placed for QT3000! OK?";
		String prttan = "(\\D*)(\\d*)(.*)";
		Pattern pattern = Pattern.compile(prttan);
		Matcher matcher  = pattern.matcher(line);
		System.out.println(matcher.groupCount());
		if(matcher.find()){
			System.out.println("Found value: " + matcher.group(0) );
	         System.out.println("Found value: " + matcher.group(1) );
	         System.out.println("Found value: " + matcher.group(2) );
	         System.out.println("Found value: " + matcher.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
	}
	public static void main(String[] args) {
		new RegexMatches();
	}
}
