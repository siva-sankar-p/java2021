package arraylist2;

public class ExceptionHndling {
public static void main(String[] args)  {
	ExceptionHndling ex= new ExceptionHndling();
	ex.booth();
}
	public void booth() {
		int age =13;
		try {
			if (age>18) {
				System.out.println("eligibule to vote");
			}else {
				throw new UserdefinedExeception("age is less than 18 not eligibule to vote ");
			}
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
