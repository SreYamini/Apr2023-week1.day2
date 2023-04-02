package week1.day2;

/*1. Print the brand of the car
2. Get the reg (1234) of the car
3. Check the car is puncture
4. Multiple 3 integers
5. Get the model of the car
6. create a main() -> call the methods and understand the implementation*/

public class Car {
	
	public String brand ="Baleno";
	
	public String model ="abc";
	
public int regNo() {
		
		return 1234;
	}
	
	
	public void multiplyNumbers(int a,int b,int c) {
		
		int d = a*b*c;
		System.out.println("The multiplication of three number is"+d);

	}

	public static void main(String[] args) {
		 boolean isPuncture = true;
		 
		Car obj =new Car();
		
		String brand2 = obj.brand;
		System.out.println("The brand of car is "+brand2);
		
		int regNo = obj.regNo();
		
		System.out.println("The register number of car is "+regNo);
		if(isPuncture==true) {
			System.out.println("The car is punctured");
		}
		else {
			System.out.println("The car is not punctured");
		}
		
		
		obj.multiplyNumbers(1,2,3);
		
		String model2 = obj.model;
		
		System.out.println("The model of car is "+model2);
		
		

	}

}
