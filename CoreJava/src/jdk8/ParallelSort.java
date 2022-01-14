package jdk8;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {

		int[] arr = { 11, 2, 53, 14, 85, 16, 47, 88, 99 };
		
		Arrays.parallelSort(arr);
		//by for each
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
