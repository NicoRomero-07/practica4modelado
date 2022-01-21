package Ejc2.A;

public class TriVerde extends Verde{
    protected TriVerde(Biestable b) {
        super(b);
    }

    protected void cerrar(){
        biest.setEstado(new Amarillo(biest));
    }
}
