package Assignment;

import java.util.Scanner;

public class Assignment3 {

	/*
	 * String 1: abcdefqwa
       String 2: gfdkghye
       Output:
       String 1: yecdefqgf
       String 2: wadkghab
	*/
	
	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String in1 = scan.next();
      String in2 = scan.next();
      int length1 = in1.length();
      int length2 = in2.length();
      String last2for2 = in2.substring(length2-2, length2);
      String last2for1 = in2.substring(length1-2, length1);
      String first2for2 = in2.substring(0, 2);
      String first2for1 = in1.substring(0, 2);
      
      String result1 = last2for2 + in1.substring(2, length1-2)
+first2for2;
      String result2 = last2for1 + in2.substring(2, length1-2)
      +first2for1;
      System.out.println(result1);
      System.out.println(result2);
		

	}

}
