package com.welcome;

public class Count_of_objeects_created {
	static int count = 0;
	 {
		count = count + 1;
	}

	 public static void main(String[] args) {
		Count_of_objeects_created a = new Count_of_objeects_created();
		Count_of_objeects_created b = new Count_of_objeects_created();
		Count_of_objeects_created c = new Count_of_objeects_created();
		Count_of_objeects_created d = new Count_of_objeects_created();
		System.out.println("count of objects created is "  +count);

	}

}
