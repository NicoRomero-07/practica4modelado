package Ejc2.A;

public class Rojo extends Estado{
    protected Rojo(Biestable b) {
        super(b);
    }

    @Override
    protected void abrir() {
        super.biest.cambiarEstado(new Verde(super.biest));
    }

    @Override
    protected void cerrar() {

    }

    @Override
    protected String estado() {
        return "cerrado";
    }
}
