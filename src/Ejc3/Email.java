package Ejc3;

import java.util.Date;

public class Email {
    protected String from, subject, text;
    protected Date date;
    protected Priority priority;

    protected Email(String from, String subject, Date date, Priority priority, String text){
        this.from = from;
        this.subject = subject;
        this.date = date;
        this.priority = priority;
        this.text = text;
    }

}
