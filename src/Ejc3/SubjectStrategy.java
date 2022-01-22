package Ejc3;

import java.util.Locale;

public class SubjectStrategy implements SortStrategy{
    @Override
    public boolean before(Email m1, Email m2) {
        return m1.subject.toLowerCase(Locale.ROOT).compareTo(m2.subject.toLowerCase(Locale.ROOT)) < 0;

    }
}
