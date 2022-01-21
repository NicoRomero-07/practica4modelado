package Ejc1.Pack1;

import Ejc1.A;
import Ejc1.B;
import Ejc1.C;

public class Proxy {
    private X x;

    public Proxy(X x){
        this.x = x;
    }
    public void rutina1(){
        x.rutina1();
    }

    public void rutina2(double y, Object o){
        try {
            if(o instanceof A || o instanceof B){
                x.rutina2(y);
            }else {
                System.out.println("No autorizado");
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean rutina3(int i, Object o){
        try {
            if (o instanceof A || o instanceof C) {
                return x.rutina3(i);
            } else {
                System.out.println("No autorizado");
                throw new Exception();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
