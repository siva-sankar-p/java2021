package LogicalPrograms;

import java.util.Iterator;

public class SwapWord_StartingLetterandEndingLetter {
public static void main(String[] args) {
	
	String name= "siva sankar pindi";
	String[]words= name.split(" ");
	String totalString="";
	
	for(String w: words) {	
	//System.out.println(w);	
	char[] word = w.toCharArray();
	// Swapping first and the last
	// character of a string
	char temp=word[0];
	word[0]=word[word.length-1];
	word[word.length-1]=temp;
	String newword = String.valueOf(word);
	// System.out.println(newword);
	totalString =totalString+newword+" ";
       }
     System.out.println(totalString);
}
}
