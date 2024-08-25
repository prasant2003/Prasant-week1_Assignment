package Assisgnment1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		System.out.println("Enter the operation");
		System.out.println("Addation(+): Substraction(-), Multiplication(*), Division(/) ");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case '+':System.out.println("Sum of given 2 number "+(n1+n2));
		break;
		
		case '-':System.out.println("Sub of given 2 number "+(n1-n2));
		break;
		
		case '*':System.out.println("mul of given 2 number "+(n1*n2));
		break;
		
		case '/':System.out.println("division of given 2 number "+(n1/n2));
		break;
		}

	}

}
