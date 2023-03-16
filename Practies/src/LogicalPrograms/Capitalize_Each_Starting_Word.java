package LogicalPrograms;

import java.util.Iterator;

public class Capitalize_Each_Starting_Word {

	public static void main(String[] args) {
		
		String words= "pindi siva sankar";
		String[]word =words.split(" ");
		String capitalstring ="";
		
		for(String w :word) {
			
			String capital_word="";
	
			String first=	w.substring(0,1);
			String remaing= w.substring(1);
			capital_word=capital_word+first.toUpperCase()+remaing+"  ";

			capitalstring = capitalstring+capital_word;
			
			
		}
		System.out.println(capitalstring);

	}

}
