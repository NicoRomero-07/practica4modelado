package Ejc3;

import java.util.Objects;

public class Priority {
    private int priority;

    protected Priority(int priority){
        this.priority = priority;
    }

    public boolean equals(Object o){
        return (o instanceof Priority) && ((Priority) o).priority == priority;
    }

    public int hashCode(){
        return Objects.hashCode(priority);
    }
}
