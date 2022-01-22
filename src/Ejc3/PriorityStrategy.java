package Ejc3;

public class PriorityStrategy implements SortStrategy{
    @Override
    public boolean before(Email m1, Email m2) {
        return m1.priority.compareTo(m2.priority) < 0;
    }
}
