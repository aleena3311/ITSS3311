/* sample run: 
Enter 5 elements of list1: 23 55 31 21 10
Enter 5 elements of list2: 23 55 31 21 10
Two lists are strictly identical.*/
import java.util.Scanner;//import scanner

public class StrictlyIdentical {//declare name 

	public static void main(String[] args) {//public static void

		    Scanner scan = new Scanner(System.in);//introduce scanner to scan input
		    int[] list1 = new int[5];//declare list1 array and define it as 5 integers
		    int[] list2 = new int[5];////declare list2 array and define it as 5 integers
				System.out.print("Enter 5 elements of list1: ");//output "Enter 5 elements of list1: "
		    for (int i = 0; i < 5; i++) {//declare for loop to store user input for list1
				  list1[i] = scan.nextInt();//nextInt stores 5 integers from user input
				}//close bracket
		    System.out.print("Enter 5 elements of list2: ");//output "Enter 5 elements of list2: "
		    for (int i = 0; i < 5; i++) {//declare for loop to store user input for list2
				  list2[i] = scan.nextInt();//nextInt stores 5 integers from user input
				}//close bracket
		    if ((equals(list1, list2)) == true) {//pass list1 and list2 to equal function
		      System.out.print("Two lists are strictly identical. ");//output "Two lists are strictly identical. "
		    }//close bracket
		    else//if above statement is not met
		      System.out.print("Two lists are not strictly identical. ");//output "Two lists are not strictly identical. "
		  }//close bracket

		public static boolean equals(int[] array1, int[] array2) {//declares method that returns true if the two arrays are equal
		  boolean equal = true;//create boolean variable and assign true to it 
		  for (int i = 0; i < array1.length; i++) {//declare for loop to store user input
		    if (array1[i] == array2[i]) {// if statement for if array 1 and 2 are equal
		      equal = true;//returns as true
		    }//close bracket
		    else//if above if statement is not met
		      equal = false;// returns as false
		  }//close bracket
		return equal;//return equal outside the for loop
	}//close bracket
}//close bracket

	
