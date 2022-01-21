package Ejc2.A;

public class TriRojo extends Rojo{

    protected TriRojo(Biestable b) {
        super(b);
    }

    protected void abrir(){
        biest.setEstado(new Amarillo(biest));
    }
}
