package Ejc2.C;

public abstract class EstadoEstable {
    MediadorConcreto mediador;

    protected EstadoEstable(MediadorConcreto m){ mediador=m;}

    protected abstract void cerrar(String e);

    protected abstract void abrir(String e);
}
