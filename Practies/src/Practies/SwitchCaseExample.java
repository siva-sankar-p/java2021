package Practies;

import java.util.ArrayList;
import java.util.List;

public class SwitchCaseExample {
public static void main(String[] args) {
	
//	int i=0;
//	while(i<=5) {
//	switch (i) {
//	case 0:System.out.println(i);
//		break;
//	case 1:System.out.println(i);
//	break;
//	case 3:System.out.println(i);
//	break;
//	}
//	i++;
//	}
	
	
	List<String> futureMonths = new ArrayList<String>();
	
	
	  int month = 8;

      switch (month) {
          case 1:  futureMonths.add("January");
          case 2:  futureMonths.add("February");
          case 3:  futureMonths.add("March");
          case 4:  futureMonths.add("April");
          case 5:  futureMonths.add("May");
          case 6:  futureMonths.add("June");
          case 7:  futureMonths.add("July");
          case 8:  futureMonths.add("August");
          case 9:  futureMonths.add("September");
          case 10: futureMonths.add("October");
          case 11: futureMonths.add("November");
          case 12: futureMonths.add("December");
          default: break;
      }

      if (futureMonths.isEmpty()) {
          System.out.println("Invalid month number");
      } else {
          for (String monthName :futureMonths) {
             System.out.println(monthName);
          }
      }
}
}
