package Ejc2.C;

public class Estable {

    private Estado estado;


    public Estable(){
        estado = new Rojo(this, new MediadorConcreto());
    }

    protected void cambio(){
        estado.cambio();
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
