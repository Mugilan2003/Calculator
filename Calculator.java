import java.util.Scanner;

public class Calculator {
	public static double add(double num1,double num2) {
		return num1+num2;
	}
	public static double sub(double num1,double num2) {
		return num1-num2;
	}
	public static double mul(double num1,double num2) {
		return num1*num2;
	}
	public static double div(double num1,double num2) {
		if(num2==0) {
			System.out.println("Can't Divisible by zero");
			return Double.NaN;
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean keepRun=true;
		while(keepRun) {
		System.out.print("\n");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("Enter Your Choice (1-5):");
		
		int choice=sc.nextInt();
      
		if(choice==5) {
			keepRun=false;
			System.out.println("Exit from calculator.GoodBye.....!");
			break;
		}
      
		System.out.println("Enter first number");
		double num1=sc.nextDouble();
		
		System.out.println("Enter second number");
		double num2=sc.nextDouble();
      
		double result=0;
		
		switch(choice) {
		case 1 : 
			result=add(num1,num2);
			System.out.println("Result : "+result);
			break;
		case 2:
			result=sub(num1,num2);
			System.out.println("Result : "+result);
			break;
		case 3:
			result=mul(num1,num2);
			System.out.println("Result : "+result);
			break;
		case 4:
			result=div(num1,num2);
			System.out.println("Result : "+result);
			break;
		default:
			System.out.println("Invalid choice. Please try again");
			}
		}
		sc.close();
	}
}
