package Ejc2.B;

public abstract class Estable {

    private Estado estado;


    public Estable(){
        estado = new Rojo(this, new MediadorConcreto());
    }

    protected void setEstado(Estado nuevoEst){
        estado = nuevoEst;
    }

    protected void abrir(){
        estado.abrir();
    }

    protected void cerrar(){
        estado.cerrar();
    }

    protected String estado(){
        return estado.estado();
    }

}
