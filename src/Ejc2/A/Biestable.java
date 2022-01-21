package Ejc2.A;

public class Biestable {
    private Estado estado;

    protected Biestable(){
        estado = new Rojo(this);
    }

    protected void cambiarEstado(Estado nuevoEst){
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
