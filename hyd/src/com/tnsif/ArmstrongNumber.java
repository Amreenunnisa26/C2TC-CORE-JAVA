
package com.tnsif;

import java.util.Scanner;

public class ArmstrongNumber {
	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int n = scanner.nextInt();
	        
	        if (isArmstrong(n)) {
	            System.out.println(n + " is an Armstrong number.");
	        } else {
	            System.out.println(n + " is not an Armstrong number.");
	        }
	        
	        scanner.close();
	    }
	    
	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int n) {
	        int originalNumber = n;
	        int numberOfDigits = countDigits(n);
	        int sum = 0;
	        
	        while (n > 0) {
	            int digit = n % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            n /= 10;
	        }
	        
	        return sum == originalNumber;
	    }
	    
	    // Function to count the number of digits in a number
	    public static int countDigits(int n) {
	        int count = 0;
	        while (n > 0) {
	            n /= 10;
	            count++;
	        }
	        return count;
	    }
	}


}
