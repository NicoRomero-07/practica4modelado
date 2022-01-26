package Ejc2.C;

public class MediadorConcreto implements Mediador{
    private EstadoEstable estado;
    private Estado est;

    protected MediadorConcreto(){

        estado = new EstadoBiestable(this);
    }
    @Override
    public void abrir(String e) {
        estado.abrir(e);
    }

    @Override
    public void cerrar(String e) {
        estado.cerrar(e);
    }

    @Override
    public void cambio() {
        if(estado instanceof EstadoTriestable){
            estado = new EstadoBiestable(this);
        }else{
            estado = new EstadoTriestable(this);
        }
    }

    protected Estado getEstado(){
        return est;
    }
    protected void setEstadoEstable(EstadoEstable e){
        estado=e;
    }

    protected void setEstadoEstable(Estado e){
        est.est.setEstado(e);
    }

}
