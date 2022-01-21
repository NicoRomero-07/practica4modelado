package Ejc2.A;

public class Amarillo extends Estado{
    protected Amarillo(Biestable b) {
        super(b);
    }

    @Override
    protected void abrir() {
        biest.setEstado(new TriVerde(biest));
    }

    @Override
    protected void cerrar() {
        biest.setEstado(new TriRojo(biest));
    }

    @Override
    protected String estado() {
        return "Precaucion";
    }
}
