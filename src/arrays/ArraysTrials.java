package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTrials {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		int counter = 0;
		for (int current: array) {
		   for (int i = 1; i < array.length; i++) {
			if(current == array[i]) {
				counter++;
			}
		  }
		}

		
		
		//Q2Arrays
		//		Random rand = new Random();
//        int[] array = new int[50];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = rand.nextInt(99)+1;
//		}
//		int max = array[0];
//		int location = 0;
//		for (int i = 1 ; i < array.length; i++) {
//			System.out.println(array[i]);
//			if(array[i]>max) {
//				max = array[i];
//				location = i;
//			}
//		}
//		System.out.printf("The max is %d and its location is %d", max, location);
//		
		
		
		
		//Q1Arrays
		//		Random rand = new Random();
//        int[] array = new int[10];
//        int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			array[i] = rand.nextInt(99)+1;
//			sum += array[i];
//			System.out.println(array[i]);
//		}
//		System.out.printf("the sum is %d and the avreage is %d",sum , sum/array.length);
		
		
		
		
		//RandomShit
		//		Random rand = new Random();
//		int arraySize = rand.nextInt(9)+1;
//		int[] arrayNum = new int[arraySize];
//		for (int i = 0; i < arrayNum.length; i++) {
//			arrayNum[i] = rand.nextInt(99)+1;
//		}
//		System.out.println(Arrays.toString(arrayNum));

	}

}
