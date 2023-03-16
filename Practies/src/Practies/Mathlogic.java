package Practies;

import java.util.Scanner;

public class Mathlogic {
	  public static void main(String[] args) {


	        Scanner sc = new Scanner(System.in);
	        int first ,second,optins,result ;
	        System.out.println("enter the first value");
	        
	        first= sc.nextInt();
	        System.out.println("enter the second value");
	        second= sc.nextInt();
	        System.out.println("chose the bellow mentined numbers for math operation");
	        System.out.println("1  for subtraction");
	        System.out.println("2  for addition");
	        System.out.println("3  for division");
	        System.out.println("4  for multiplication");
	        System.out.println("5  for reminder");
	        optins= sc.nextInt();
	switch (optins)

	{
	    case 1:
	    result=first-second;
	    System.out.println(result);
	    break;
	    case 2:
	        result=first+second;
	        System.out.println(result);
	        break;
	    case 3:
	        result=first/second;
	        System.out.println(result);
	        break;
	    case 4:
	        result=first*second;
	        System.out.println(result);
	        break;
	    case 5:
	        result=first%second;
	        System.out.println(result);
	        break;
	    default:
	        System.out.println("invalid number chosed please select from given numbers onley");
	       }
	    }
	}


