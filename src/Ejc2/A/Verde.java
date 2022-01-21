package Ejc2.A;

public class Verde extends Estado{
    protected Verde(Biestable b) {
        super(b);
    }

    @Override
    protected void abrir() {

    }

    @Override
    protected void cerrar() {
        super.biest.setEstado(new Rojo(super.biest));
    }

    @Override
    protected String estado() {
        return "abierto";
    }
}
