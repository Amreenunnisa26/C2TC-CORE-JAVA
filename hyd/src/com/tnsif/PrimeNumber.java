package com.tnsif;

import java.util.Scanner;

public class PrimeNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int n = scanner.nextInt();
	        
	        if (isPrime(n)) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }
	    
	    // Function to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}



