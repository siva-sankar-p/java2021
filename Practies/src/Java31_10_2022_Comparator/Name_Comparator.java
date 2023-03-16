package Java31_10_2022_Comparator;

import java.util.Comparator;

public class Name_Comparator implements Comparator<Relations> {
    @Override
    public int compare(Relations na1, Relations na2) {
        return na1.name.compareTo(na2.name);
    }
}
