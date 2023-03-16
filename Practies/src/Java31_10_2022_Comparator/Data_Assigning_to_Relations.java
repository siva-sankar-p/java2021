package Java31_10_2022_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Data_Assigning_to_Relations {
    public static void main(String[] args) {
        ArrayList<Relations> re = new ArrayList<Relations>();


        re.add(new Relations("mother",40,100000l));
        re.add(new Relations("father",50,200000l));
        re.add(new Relations("brother",28,500000l));
        re.add(new Relations("elder brother",24,null));
        re.add(new Relations("Abrother",28,500000l));

//        Collections.sort(re,new Name_Comparator());
//        System.out.println(re);
//        System.out.println("soting by name ");
//          for (Relations rel :re)
//          {
//              System.out.println(rel);
//          }
        System.out.println("sorting by age");
          Collections.sort(re,new Age_comparator());
          System.out.println(re);


          //OR USING JAVA 8 FEATURE
          
     //    Collections.sort(re, Comparator.comparing(Relations::getAge).thenComparing(Relations::getName));
         
     //    System.out.println(re);
    }
}
