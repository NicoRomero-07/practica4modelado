package Ejc2.C;

public abstract class Estado {
    Estable est;

    protected Estado(Estable e){
        est = e;
    }

    protected abstract void abrir();
    protected abstract  void cerrar();
    protected abstract String estado();

    public abstract void cambio();
}
