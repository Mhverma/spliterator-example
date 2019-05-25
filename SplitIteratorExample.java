package com.manoj.test;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		Spliterator<String> sp1 = list.spliterator();
		Spliterator<String> sp2 = sp1.trySplit();

		sp1.forEachRemaining(System.out::println);

		System.out.println("========");

		sp2.forEachRemaining(System.out::println);
	}

}
