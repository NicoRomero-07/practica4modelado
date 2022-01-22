package Ejc3;

import java.util.Objects;

public class Priority implements Comparable<Priority>{
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

    @Override
    public int compareTo(Priority p) {
        int res = 0;
        if(priority<p.priority){
            res = -1;
        }else if(priority<p.priority){
            res = 1;
        }else{
            res = 0;
        }
        return res;
    }
}
