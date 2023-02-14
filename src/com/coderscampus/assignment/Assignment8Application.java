package com.coderscampus.assignment;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Assignment8Application {
	static Map<Integer, Integer> results = new HashMap();
	
	public static void main(String[] args) { 
		System.out.println();
		Assignment8 assignment = new Assignment8();
		Executor executor = Executors.newCachedThreadPool();
		for( int i = 0; i < 1000; i++) {
			CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(
																() -> assignment.getNumbers(), executor)
																.thenApply(list -> list.stream())
																.thenAccept(stream -> stream.forEach(x -> System.out.println(x)));	
		}
		System.out.println(results.values());
	}
}
