package Ejc3;

import java.util.Locale;

public class FromStrategy implements SortStrategy{
    @Override
    public boolean before(Email m1, Email m2) {
        return m1.from.toLowerCase(Locale.ROOT).compareTo(m2.from.toLowerCase(Locale.ROOT)) < 0;
    }
}
