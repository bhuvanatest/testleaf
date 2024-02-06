package main;

public class MisingNumberArray {
	public static void main(String[] args) { 
		int[] input = {1, 4,3,2,8, 6, 7  };

		 int[] register = new int[input.length-1];
		 for (int i : input) {
			 register[i] = 1; 
			 }
		 System.out.println("missing numbers in given array"); 
		 for (int i = 1; i < register.length; i++) { 
			 if (register[i] == 0) {
				 System.out.println(i);
				 }
			 }
		 }

			
			}


