package Ejc2.A;

public class Verde extends Estado{
    public Verde(Biestable b) {
        super(b);
    }

    @Override
    public void abrir() {

    }

    @Override
    public void cerrar() {
        super.biest.cambiarEstado(new Rojo(super.biest));
    }

    @Override
    public String estado() {
        return "abierto";
    }
}
