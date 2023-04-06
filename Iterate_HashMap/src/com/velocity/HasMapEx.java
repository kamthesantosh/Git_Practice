package com.velocity;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(12, "santosh");
		map.put(8, "shriram");
		map.put(15, "pranita");
		map.put(19, "omkar");

		for (Entry<Integer, String> i : map.entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}

	}
}
