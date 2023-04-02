package week1.day2;

/*Write a java program to find the number of times '5' occured in the array
{1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67}*/


public class Arrays {
	
	public static void main(String[] args) {
		
		int[] occurenceofNumber = {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		
		int count =0;
		
		for (int i = 0; i <= occurenceofNumber.length-1; i++) {
			
			if(occurenceofNumber[i]==5) {
				count = count+1;
			}
			
		}
		System.out.println(count);
	}

}
