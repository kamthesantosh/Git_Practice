package com.velocity;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(18);
		al.add(12);
		al.add(11);
		al.add(10);
		al.add(16);
		for (Integer i : al) {
			System.out.println(i);
		}
	}
}
