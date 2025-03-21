package mundosvideojuegos;
import ClasesAbstractasMundos.Estructura;
import ClasesAbstractasMundos.Personaje;
import ClasesAbstractasMundos.Arma;

public abstract class FabricaMundos {
   
    public abstract Personaje crearPersonaje();
    public abstract Estructura crearEstructura();
    public abstract Arma crearArma();
}