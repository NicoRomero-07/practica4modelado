package Ejc2.C;

public class Verde extends Estado {

    private Mediador mediador;

    protected Verde(Estable b, Mediador m) {
        super(b);
        setMediador(m);
    }
    public void setMediador(Mediador m){mediador=m;}
    @Override
    protected void abrir() {

    }

    @Override
    protected void cerrar() {
        mediador.cerrar(estado());
    }

    @Override
    protected String estado() {
        return "abierto";
    }

    @Override
    public void cambio() {
        mediador.cambio();
    }
}
