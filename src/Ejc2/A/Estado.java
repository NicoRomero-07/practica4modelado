package Ejc2.A;

public abstract class Estado {
    Biestable biest;

    protected Estado(Biestable b){
        biest = b;
    }

    protected abstract void abrir();
    protected abstract  void cerrar();
    protected abstract String estado();
}
