package Ejc2.B;

public class Rojo extends Estado {
    private Mediador mediador;

    protected Rojo(Estable b, Mediador m) {
        super(b);
        setMediador(m);
    }
    public void setMediador(Mediador m){mediador=m;}
    @Override
    protected void abrir() {
        mediador.abrir(estado());
    }

    @Override
    protected void cerrar() {

    }

    @Override
    protected String estado() {
        return "cerrado";
    }

}
