package Ejc2.C;

public class EstadoTriestable extends EstadoEstable{

    protected EstadoTriestable(MediadorConcreto m) {
        super(m);
    }

    @Override
    protected void cerrar(String e) {
        switch (e) {
            case "precaucion":
                super.mediador.setEstadoEstable(new Rojo(super.mediador.getEstado().est, super.mediador));
                break;
            case "abierto":
                super.mediador.setEstadoEstable(new Amarillo(super.mediador.getEstado().est, super.mediador));
                break;
        }

    }

    @Override
    protected void abrir(String e) {
        switch (e) {
            case "precaucion":
                super.mediador.setEstadoEstable(new Verde(super.mediador.getEstado().est, super.mediador));
                break;
            case "abierto":
                super.mediador.setEstadoEstable(new Amarillo(super.mediador.getEstado().est, super.mediador));
                break;
        }
    }

}
