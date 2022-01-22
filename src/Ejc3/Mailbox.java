package Ejc3;

import java.util.ArrayList;

public class Mailbox {

    private ArrayList<Email> listEmail;
    private SortStrategy strategy;

    protected Mailbox(){
        listEmail = new ArrayList<>();
    }

    protected void show(){
        System.out.println(listEmail);
    }

    private void sort(){
        for(int i=2; i<listEmail.size(); i++){
            for(int j=listEmail.size(); j>=i; j--){
                Email e1 = listEmail.get(j);
                Email e2 = listEmail.get(j-1);
                if(before(e1,e2)){
                    Email aux = e1;
                    listEmail.add(j,e2);
                    listEmail.add(j-1,aux);
                }
            }
        }
    }

    private Boolean before(Email m1, Email m2){
        return strategy.before(m1,m2);
    }
}
