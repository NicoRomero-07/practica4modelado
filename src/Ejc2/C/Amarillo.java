package Ejc2.C;

public class Amarillo extends Estado {
    private Mediador mediador;

    protected Amarillo(Estable b, Mediador m) {
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
        mediador.cerrar(estado());
    }

    @Override
    protected String estado() {
        return "Precaucion";
    }

    @Override
    public void cambio() {

    }
}
