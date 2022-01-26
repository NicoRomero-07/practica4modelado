package Ejc2.C;

public class EstadoBiestable extends EstadoEstable{

    protected EstadoBiestable(MediadorConcreto m) {
        super(m);
    }

    @Override
    protected void cerrar(String e) {
        super.mediador.setEstadoEstable(new Rojo(super.mediador.getEstado().est, super.mediador));
    }

    @Override
    protected void abrir(String e) {
        super.mediador.setEstadoEstable(new Verde(super.mediador.getEstado().est, super.mediador));
    }

}
