package Ejc1;

import Ejc1.Pack1.Proxy;
import Ejc1.Pack1.X;

public class B {

    private X x = new X();
    private Proxy p = new Proxy(x);
    B(){

    }
    public void accesoRutina3(int y){
        p.rutina3(y, new B());
    }
}
