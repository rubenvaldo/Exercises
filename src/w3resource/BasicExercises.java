package w3resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class BasicExercises {
	
	
	
	//private static String r;



	/*
	 * Write a Java program to reverse a String
	 * 
	 */
	
	public BasicExercises() {
		
		
		
	}
	
		

	public static void main(String[] args) {
		
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		int n=0, even=0, odd=0;
		int array[] = null;
		boolean valid = false;
		
		
		// ask for the number of elements within the array
		
		n = ask();
		
		System.out.printf("number of elements within the array: %d\n",  n);
		
		
		array = new int[n];
		
		int i =0;
		
		
		do {		
	
		try {
			while(i<array.length) {
			//for(int i =0; i< array.length; i++) {
				System.out.println("type the: " + (i+1) + "  element of the array: ");
				array[i]= Integer.parseInt(myReader.readLine());
				if(array[i]%2==0) {
					even++;
					//i++;
				}
				else {
					odd++;
					//i++;
				}
				//valid = true;
				i++;
			} 
			valid = true;
			
		} catch (Exception e) {
			System.out.println("ERROR! You did not enter a number!");
			//i--;
			//valid = false;
		
		}
		
		} while (!valid);
		
		System.out.println("your array is: " + Arrays.toString(array));
		
		System.out.println("even: " + even);
		System.out.println("odd: " + odd);

	




	}



	private static int ask() {
		
		int n = 0;
		boolean valid = false;
		//do {
			
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		do {
			
		//}while(!valid);
		try {
			System.out.print("type the number of elements in the array: ");
			n = Integer.parseInt(myReader.readLine());
			valid = true;
		} catch (Exception e) {
			System.out.println("ERROR! You did not enter a number!\nPlease, type an integer ");
		}
		
		} while(!valid);
		return n;
		
		
	}

}
