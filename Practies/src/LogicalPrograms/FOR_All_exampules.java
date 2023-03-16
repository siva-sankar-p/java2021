package LogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FOR_All_exampules {

	public static void main(String[] args) {
		
		//reverse  number
//		Scanner sc= new Scanner(System.in);
//		System.out.println("entera munber");
//		int num= sc.nextInt();

//		int res=0;
//		if(num%10==0) {      //this loop logic only for if number last digit is 0 we add that 0 intenally on sysout 
//			
//			while(num!=0) {
//				
//				res=res*10+num%10;
//				num=num/10;
//		}
//			System.out.println("0"+res);	
//		}
//		else {
//		while(num!=0) {
//			
//			res=res*10+num%10;
//			num=num/10;
//					
//		}
//		System.out.println(res);
//		
//	}
		
		// for string revers
		
//		String name = "siva sankar";
//		String res="";
//		char[]valu=name.toCharArray();
//		
//		for(int i=name.length()-1;i>=0;i--) {
//			
//			res=res+valu[i];
//		}
//		System.out.println(res);
		
	


	
		//for reverse each word in string 
		
//		String name= "siva sankar pindi merakapalem";
//		
//		String reversestring= "";
//		
//		String[] words =name.split(" ");
//		
//		for(String c:words) {
//			
//			String reverseword = "";
//			for(int i=c.length()-1;i>=0;i--) {
//				
//				reverseword= reverseword+c.charAt(i);
//			}
//			reversestring = reversestring+reverseword+" ";
//
//		}
//		System.out.println(reversestring);
//		
		
		//remove the space 
		
//		String name= "siva sankar p";
//		String afterremove=name.replaceAll(" ", "");
//		System.out.println(afterremove);
	
		//  swapping number
		
//		int a=10;
//		int b=20;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+"  "+b);
		
		// swaping string
		
//		String s1="siva";
//		String s2="sankar";
//		
//		s1=s1+s2;
//		s2=s1.substring(0,s1.length()-s2.length());
//		s1=s1.substring(s2.length());
//		
//		System.out.println(s1+" "+s2);
		
		
		//adding someof digits
		
//		int num= 1325460;
//		
//		int sum=0;
//		while(num>0) {
//			sum= sum+num%10;
//			num=num/10;
//		}
//		System.out.println(sum);
		
		
		//sorting array number
		
//		Integer[]values= {1,10,3,16,12,15,4,60};
//		
//		System.out.println("before sorting  "+Arrays.toString(values));
//		
//		int n= values.length;
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-1;j++) {
//				
//				if(values[j]<values[j+1]) {
//					
//					int temp=values[j];
//					values[j]=values[j+1];
//					values[j+1]= temp;
//				}
//			}
//		}
//		System.out.println("after sorting "+ Arrays.toString(values));
//
//		Integer[]num = {1,10,3,16,12,15,4,60};
//		Arrays.sort(num);   // this alwase do assending order 
//		System.out.println("after sorting "+ Arrays.toString(num));
		
		
		
		// for match the requrirement
		
//		String name= "siva sankar@PINDI48";
//		System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
//		System.out.println(name.toLowerCase().matches(".*[qz].*"));
//		System.out.println(name.replaceAll("[^a-zA-Z]", ""));
//		System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
//		System.out.println(name.replaceAll("[^a-z]", ""));


		// PRINT EVEN AND ODD IN ARREY
		
		Integer[]num= {10,2,3,8,4,50,16,9,13,80,12,15,18,99 ,100};
		System.out.println("even numbers");
		for(int i=0;i<num.length-1;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
//	
//		System.out.println("odd numbers");
//		for(int i=0;i<num.length;i++) {
//			if(num[i]%2!=0) {
//				System.out.println(num[i]);
//			}
//		}
		
		//primenumber find
		
//		int num=7;
//		int count=0;
//		
//		
//		for (int i=1;i<=num;i++) {
//			if(num%i==0) 
//				count++;
//			}
//			if(count==2) 
//				System.out.println(num+" is prime number");
//			else 
//				System.out.println(num+" not a prime number");
//				
			
		//pilindrome string
		
//		String name="madam";
//		String orginalname=name;
//		String rev="";
//		int l=name.length();
//		for(int i=l-1;i>=0;i--) {
//			rev= rev+name.charAt(i);
//		}
//
//			
//		if(orginalname.equals(rev)) {
//			System.out.println(orginalname+"  is pelindrome name");
//		}else
//			System.out.println(orginalname+"  is not a pelindrome name");

		
		//pilindrome number
		
//		int num= 12321;
//		int originalnum=num;
//		int rev=0;
//		while(num!=0) {
//		 rev = rev*10+num%10;
//		 num=num/10;
//		}
//		if(originalnum==rev) {
//			System.out.println(originalnum +"  is pilindrome number");
//		}else {
//			System.out.println(originalnum +"  is not a pilindrome number");
//
//		}
		
		
		//how to find occurence of charecter in string
		
//		String name = "siva sankar pindi";
//		
//		int originalchar= name.length();
//		
//		String newname=name.replaceAll("a","");
//		
//		int afterchar=newname.length();
//		
//		System.out.println(originalchar-afterchar);
		
		//find some of elements in arrayes
		
//		Integer []values= {10,10,10,100,20};
//		int sum=0;
//		for(int a:values) {
//			
//			sum=sum+a;
//		}
//		System.out.println(sum);
//		
		
		
		// Find missing number in sequence numbers
		
		
		
		// approche is sum of values and sum of acutal values seqence then subtract each other
//		Integer [] values= {1,2,3,4,6,7,8};
//		int sum1=0;
//		int sum2=0;
//		for(int a:values) {
//			
//			sum1=sum1+a;
//		}
//		for(int i=1;i<=8;i++) {
//			
//			sum2=sum2+i;
//		}
//		System.out.println(sum2-sum1);
		
		//Find largest number in array 
		
//		Integer []values= {1,10,3,5,22,26,50,6,4};
//		int largevalue=0;
//		for(int i=1;i<values.length;i++) {
//			
//			if(values[0]<values[i]) {
//				values[0]=values[i];
//				 largevalue=values[0];
//			}
//		}
//		System.out.println(largevalue);
		
		//Find lwest number in array 
		
//				Integer []values= {49,10,3,5,22,26,50,6,4};
//				int largevalue=0;
//				for(int i=1;i<values.length;i++) {
//					
//					if(values[0]>values[i]) {
//						values[0]=values[i];
//						 largevalue=values[0];
//					}
//				}
//				System.out.println(largevalue);
		
		//Find largest number in 3numbers
		
//		int a=10,b=50,c=20;
//		if(a>b &&a>c) {
//			System.out.println("a is large number");
//		}else if (b>a && b>c) {
//			System.out.println("b is largen umber");
//		}else {
//			System.out.println("c is large number");
//
//		}
		
		//Find number in array list

//		Integer [] values = {15,20,55,60,70,55};
//		
//		int num=55;
//		int count=0;
//		for(int i=0;i<=values.length-1;i++) {
//			
//			if(num==values[i]) {
//				System.out.println("index of required value is "+ i);
//				count++;
//			}
//		
//		}	System.err.println("total "+count+" times present in array ");
		
		// find duplicates in array
		 
//		Integer[] values = { 15, 20, 55, 60, 70, 55, 55 };
//		int count = 0;
//		for (int a = 0; a <= values.length; a++) {
//			for (int i = a + 1; i <= values.length - 1; i++) {
//
//				if (values[a] == values[i]) {
//					System.out.println("index of duplicate value is " + i);
//					count++;
//				}
//			}
//
//		}
//		System.err.println("total " + count + " times present in array ");

		
//		//count the number of digits in a number
//		
//		int num = 27236876;
//		int count =0;
//		while(num!=0) {
//			num=num/10;
//			count++;
//		}
//		System.out.println(count);
		
		
		//count the words in astring
		
//		String name= "siva sankar pindi";
//		
//	String newname=name.replaceAll(" ","");
//	
//	char[]total=newname.toCharArray();
//	int l=total.length;
//	System.out.println(l);
		
		
		//count even and odd numbers
		
		
//		Integer []values= {1,2,3,4,5,6,78,9,10,12,13,14,15,16};
//		int evencount=0;
//		int oddcount=0;
//		for(int a:values) {
//			if(a%2==0) {
//				evencount++;
//			}else {
//				oddcount++;
//				
//			}
//		}
//		System.out.println("even count is "+evencount+" oddcount is "+oddcount);
		
		
		
		// capitalize each starting word 
		
//		String name= "siva sankar pindi from merakapalem";
//		
//		String[]words= name.split(" ");
//		
//		String totalstring="";
//		
//		for(String w: words) {
//			
//		String	wordsstring="";
//			
//			String startingletter=w.substring(0,1);
//			String remaingletters=w.substring(1);
//			wordsstring=startingletter.toUpperCase()+remaingletters+" ";
//		
//			totalstring= totalstring+wordsstring;
//		}
//		System.out.println(totalstring);
		
		
		//How do you check if a list of integers contains only odd
		
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(2);
//		list.add(4);
//		list.add(33);
//		list.add(26);
//        list.add(8);
//		list.add(10);
//		list.add(12);
//		
//	boolean status=true;
//		for(int i:list) {
//		if(i%2!=0) {
//			status=false;
//		System.out.println("list has odd numbers");
//			break;	
//		}
//		
//		}
//		if(status==true) {
//			System.out.println("list has no odd numbers");
//		}
		
		
		//How do you remove leading and trailing spaces from a string
		
		
//		String name= "  siva sankar pindi  ";
//		
//		//name=name.strip();
//		String afterstrip = name.trim();
//		System.out.println(afterstrip);
		
		//find secomd higest value in array
		
//		Integer []values= {1,10,2,5,18,14,100,50,105};
//		Arrays.sort(values);
//		System.out.println(Arrays.toString(values));
//		System.out.println("second higest value is "+values[values.length-2]);
		
		// reverse string
//	     String str = "Automation";
//         StringBuilder str2 = new StringBuilder();
//         str2.append(str);
//         System.out.println(str2);
//         str2 = str2.reverse();     // used string builder to reverse
//        System.out.println(str2);
		
		//terinaryoperator
		
//		int a=10;
//		int age=18;
//	    int eligibulity= age>a ? 18:17;
//      System.out.println(eligibulity);
         
		
//         int x=20;
//         int y= 40;
//         int z=10;
//         
//         
//         int largenumber=(x > y) ? (x > z ? x : z) : (y > z ? y : z);
//         System.out.println(largenumber);
		
		
		// switch case
		
		
//		String name="surendra";
//		switch (name) {
//		case "siva sankar":System.out.println("java devloper");
//			
//			break;
//		case "surendra":System.out.println("marcketing manager");
//		break;
//
//		case "venkatrao":System.out.println("former");
//		break;
//		
//		case "nagendra mani":System.out.println("home maker");
//		
//		default:System.out.println("non of the famely ");
//			break;
//		}
		
		
		//while loop 
		
//		int a=20;
//		while(a>=9) {
//			System.out.println(a);
//			a--;   // if we will for got this it will infinet loop 
//		}
//		
		// dowhile loop
		
//		int b=15;
//		do {System.out.println(b);
//		b++;
//		}while(b<20);
//		
		//for loop piramid
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//number piramid
		
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//reverse number piramid
		
//		for(int i=1;i<=6;i++) {
//			for(int j=6;j>=i;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//multi dimentonal array
		
		
//		Integer[][]values= {{1,2,3,4,5},{6,7,8,9},{10,12,15}};
//		int x= values[0][2];
//		System.out.println(x);
		
		//recursion
		
//		sum(10);
//		
//	}
//		public static int sum(int a) {
//			if(a>0) {
//				return a+sum(a-1);
//			}else
//			return 0;
//			}
	
		
	}
}