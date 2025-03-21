package FabricasMundosConcretos;

import ClasesAbstractasMundos.Estructura;
import ClasesAbstractasMundos.Personaje;
import ClasesAbstractasMundos.Arma;
import MundoPostapocaliptico.*;
import mundosvideojuegos.FabricaMundos;

public class MundoPostapocaliptico extends FabricaMundos {
    @Override
    public Personaje crearPersonaje() {
        return new PersonajePostapocaliptico("Zombie", 80);
    }

    @Override
    public Estructura crearEstructura() {
        return new EstructuraPostapocaliptica("Destruida parcialmente");
    }

    @Override
    public Arma crearArma() {
        return new ArmaPostapocaliptica("50 puntos");
    }
}
