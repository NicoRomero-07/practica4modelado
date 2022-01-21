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
        biest.setEstado(new Rojo(biest));
    }

    @Override
    protected String estado() {
        return "abierto";
    }
}
