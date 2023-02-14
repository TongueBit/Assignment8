package com.coderscampus.assignment;


import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Assignment8Application {

	public static void main(String[] args) { 
		System.out.println();
		Assignment8 assignment = new Assignment8();
		Executor executor = Executors.newCachedThreadPool();
		for( int i = 0; i < 1000; i++) {
			CompletableFuture<List<Integer>> completableFuture = CompletableFuture.supplyAsync(
							() -> assignment.getNumbers()
			, executor);
			
		}
	}
}
