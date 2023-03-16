package LogicalPrograms;

public class FindtheNearestOReqalTO_Graterthen_targetnumber {

	public static void main(String[] args) {

		// find least 
		Integer[]values= {1,2,5,9,10,16,30,25,33,38,41};
		int target=values[5];
		
		for(int i=0;i<=values.length-1;i++) {
		
			if(target<=values[i]) {
				
				target=values[i];
			}
		}
		System.out.println(target);
	}

}
