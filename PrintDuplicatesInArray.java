package week1.day2.assignments;

/*https://github.com/TestLeafPages/SeleniumAssignments/blob
/master/week1/day2/classroom/arrays/PrintDuplicatesInArray.java

//get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value*/
public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length = arr.length;
		
		int count =0;
		
		for (int i = 0; i < length-1; i++) {
			
			for (int j = i; j < length; j++) {
				
				if(arr[i]==arr[j]) {
					count=count+1;
					
				}
			}
			if(count==2) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
