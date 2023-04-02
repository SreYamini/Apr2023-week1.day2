package week1.day2.assignments;

import java.util.Arrays;

/*https://github.com/TestLeafPages/SeleniumAssignments/blob
/master/week1/day2/classroom/arrays/MissingElementInAnArray.java
//Sort the array	
// loop through the array (start i from arr[0] till the length of the array)
// check if the iterator variable is not equal to the array values respectively
// print the number
// once printed break the iteration*/
public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; i++) {
			
		if(arr[i-1]!=i) {
			System.out.println(i);
			break;
					
		}
		
		}
		
	}

}
