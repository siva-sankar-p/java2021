package Java31_10_2022_Comparator;

import java.util.Comparator;

public class Age_comparator implements Comparator<Relations> {

    @Override
    public int compare(Relations ag1, Relations ag2) {
                if (ag1.age==ag2.age)
                    return 0;
                else if (ag1.age>ag2.age)
                    return 1;
                else
                    return -1;

    }
}
