package com.perd.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZipWithIndex {

	public static void main(String[] args) {
		List<String> books = Arrays.asList(
			    "The Holy Cow: The Bovine Testament",
			    "True Hip Hop",
			    "Truth and Existence",
			    "The Big Book of Green Design"
			);
		
	/*	seq(books)
	    .zipWithIndex()
	    .map(t -> t.v2 == 2 
	            ? "Pregnancy For Dummies"
	            : t.v1)
	    .toList();*/
		
	List<String> out=	Stream.concat(
			    Stream.concat(
			        books.stream().limit(2),
			        Stream.of("Pregnancy For Dummies")
			    ),
			    books.stream().skip(3)
			).collect(Collectors.toList());
	System.out.println(out);
	}

}
