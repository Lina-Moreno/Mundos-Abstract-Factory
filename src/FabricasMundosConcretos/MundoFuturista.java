package FabricasMundosConcretos;

import ClasesAbstractasMundos.Estructura;
import ClasesAbstractasMundos.Personaje;
import ClasesAbstractasMundos.Arma;
import MundoFuturista.*;
import mundosvideojuegos.FabricaMundos;

public class MundoFuturista extends FabricaMundos {
    @Override
    public Personaje crearPersonaje() {
        return new PersonajeFuturista("Robot", 80);
    }

    @Override
    public Estructura crearEstructura() {
        return new EstructuraFuturista("Intacta");
    }

    @Override
    public Arma crearArma() {
        return new ArmaFuturista("90 puntos");
    }
}
