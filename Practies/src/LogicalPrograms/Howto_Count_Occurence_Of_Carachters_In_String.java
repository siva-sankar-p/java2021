package LogicalPrograms;

public class Howto_Count_Occurence_Of_Carachters_In_String {

	public static void main(String[] args) {
		
		
		String a= "siva sankar will be the upcoming software devaloper";
		
	int total_length = a.length();
	
         a = a.replaceAll("a", "") ;
         
         int after_length = a.length();
         
            System.out.println(total_length);
            System.out.println(total_length-after_length+" no of times repeated");
       

	}

}
