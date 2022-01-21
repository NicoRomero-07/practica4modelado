package Ejc1;

import Ejc1.Pack1.Proxy;
import Ejc1.Pack1.X;

public class A {
    private X x = new X();
    private Proxy p = new Proxy(x);
    A(){

    }

    public void accesoRutina3(int y){
        p.rutina3(y, new A());
    }
}
