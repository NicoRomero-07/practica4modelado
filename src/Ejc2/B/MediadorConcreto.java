package Ejc2.B;

public class MediadorConcreto implements Mediador {

    private Estado est;

    protected MediadorConcreto(){

    }
    @Override
    public void abrir(String e) {
        if (est.est instanceof Biestable){
            est.est.setEstado(new Verde(est.est, this));

        }else if(est.est instanceof Triestable){
            if(e.equals("cerrado")){
                est.est.setEstado(new Amarillo(est.est, this));
            }else if(e.equals("precaucion")){
                est.est.setEstado(new Verde(est.est, this));
            }
        }
    }

    @Override
    public void cerrar(String e) {
        if (est.est instanceof Biestable){
            est.est.setEstado(new Rojo(est.est, this));

        }else if(est.est instanceof Triestable){
            if(e.equals("abierto")){
                est.est.setEstado(new Amarillo(est.est, this));
            }else if(e.equals("precaucion")){
                est.est.setEstado(new Rojo(est.est, this));
            }
        }
    }

    protected Estado getEstado(){
        return est;
    }

    protected void setEstadoEstable(Estado e){
        est.est.setEstado(e);
    }

}
