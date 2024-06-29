package week4codingp;

public class Project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 1. Create an Array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93. 
		
		int[] ages =  { 3, 9, 23, 64, 2, 8, 28, 93 };
		//a. Programmatically subtract the value of the first element in the Array from the value in the last element of the Array (i.e. do not use ages[7] in your code). Print the result to the console.
		int result = ages[ages.length -1 ] - ages[0];
		System.out.println(result); 
		
//		
//		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 104 }; 
		 
		
//		i. Make sure that there are 9 elements of type int in this new array.
		
		
//		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of
//		the first element in the new array ages2 from the last element of ages2).
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(result2);  
		
//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//		c. Use a loop to iterate through the Array and calculate the average age. Print the result to the console.
		
	    double sum = 0;
		for (int age : ages) {
		sum = sum + age; 
			
		}
		System.out.println(sum / ages.length);  
//		2. Create an Array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.  
		String[] names = {"Sam",  "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		
		
//		a. Use a loop to iterate through the Array and calculate the average number of letters per name. Print the result to the console. 
		 sum = 0;
		 for (int i = 0; i < names.length; i++) { 
		 sum = sum +	 names[i].length(); 
				 
			 
		 } 
		 System.out.println(sum / names.length);
		
//		b. Use a loop to iterate through the Array again and concatenate all the names together, separated by spaces, and print the result to the console. 
		 String nameConcat = "";
		 for (int i = 0; i < names.length; i++) {
		 nameConcat = nameConcat + names[i] + " "; 
		 
		 }
		 System.out.println(nameConcat);
		 
//		3. How do you access the last element of any Array?
		// arrayName.[length - 1]
		 
//		 4. How do you access the first element of any Array?
		 	
		 //	int firstNumber = ages[0];		
		 			
//		5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously created names Array and add the length of each name to the nameLengths Array. 
		 
		 int[] nameLengths = new int[names.length];
		 for (int i = 0; i < names.length; i++) {
		 nameLengths[i] = names[i].length();
		 }
		 
		 
//		6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in the Array. Print the result to the console. 
		 sum = 0;
		 for (int i = 0; i < nameLengths.length; i++) {
			 sum = sum + nameLengths[i];
			 
		 }
			 System.out.println(sum);
		 
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).  
			
			System.out.println(multiplyString("Thor", 6));
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space). 
			System.out.println(properNames("Bruce", "Wayne"));
//		9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100. 
            System.out.println(moreThan100(ages));
			
//		10. Write a method that takes an Array of double and returns the average of all the elements in the Array. 
            double[] ray = { 15.9, 38.1, 21.7, 41.3 };
            System.out.println(decimalD(ray));
//		11. Write a method that takes two Arrays of double and returns true if the average of the elements in the first Array is greater than the average of the elements in the second Array.
            double[] rai = { 50.8, 70.3, 100.7}; 
           System.out.println(deePoint(ray, rai));
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		
		
	} // End of Main  
	
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
	
	public static String multiplyString(String word, int n) {
		String marvel = ""; 
		for (int i = 0; i < n; i++) {
			 
		marvel = marvel + word;
		
		}
			
		return marvel;
	}
	
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space). 
	public static String properNames(String firstName, String lastName) {
		
		
		String fullName = firstName + " " + lastName;
		
		return fullName;
		
	}
	
//	9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100. 
		public static boolean moreThan100(int[] arr) {
	    int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			 sum = sum + arr[i]; 
			 
		}
		return (sum > 100);
//	    if (sum > 100) {
//	    	return true;
//	    } else {
//	    	return false;
//	    } 
		}
//	10. Write a method that takes an Array of double and returns the average of all the elements in the Array. 
		public static double decimalD(double[] ray) {
		double sum = 0; 
		for (int i = 0; i < ray.length; i++) {
		sum = sum + ray[i]; 
		
		}
		return sum / ray.length;
		}
//	11. Write a method that takes two Arrays of double and returns true if the average of the elements in the first Array is greater than the average of the elements in the second Array. 
		public static boolean deePoint(double[] ray, double[] rai) {
		double sum = 0;
		for (int i = 0; i < rai.length; i++) {
			
			
		sum = sum + rai[i];
		}
		double summ = 0;
		for (int i = 0; i < ray.length; i++) {
			
			
			summ = summ + ray[i];
			}
		if (summ / ray.length > sum / rai.length) {
		return true; 
		} else { 
		return false;	
		}
		}
		
		
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket > 10.50) {
				return true; 
			   } else {
			   return false;   
				
			}
		}
		
//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
} // End of Class
