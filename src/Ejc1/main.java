package Ejc1;

import Ejc1.Pack1.Proxy;
import Ejc1.Pack1.X;

public class main {

    public static void main (String [ ] args) {
        X x = new X();
        A a = new A();
        B b = new B();
        C c = new C();
        Proxy p = new Proxy(x);
        p.rutina2(1,a);
        p.rutina2(1,c);
        a.accesoRutina3(1);
        b.accesoRutina3(1);






    }
}
