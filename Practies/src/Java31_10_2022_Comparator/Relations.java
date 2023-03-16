package Java31_10_2022_Comparator;

import java.util.Comparator;

public class Relations //implements Comparator <Relations>
{
   String name;
   Integer age;
   Long saving;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getSaving() {
        return saving;
    }

    public void setSaving(Long saving) {
        this.saving = saving;
    }

    public Relations(String name, Integer age, Long saving) {
        this.name = name;
        this.age = age;
        this.saving = saving;
    }

    @Override
    public String toString() {
        return "Relations name=  "+ name +  "   age=  "+ age +  "  saving=  " + saving +"  ";
    }


//    @Override
//    public int compare(Relations nam1, Relations o2) {
//        return  this.name.compareTo(nam1.name);
//
//    }

    
}
