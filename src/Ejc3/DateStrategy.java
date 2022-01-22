package Ejc3;

import java.util.Locale;

public class DateStrategy implements SortStrategy{
    @Override
    public boolean before(Email m1, Email m2) {
        return m1.date.compareTo(m2.date) < 0;

    }
}
