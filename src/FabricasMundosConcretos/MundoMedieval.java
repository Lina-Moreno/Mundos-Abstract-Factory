package FabricasMundosConcretos;

import ClasesAbstractasMundos.Estructura;
import ClasesAbstractasMundos.Personaje;
import ClasesAbstractasMundos.Arma;
import MundoMedieval.*;
import mundosvideojuegos.FabricaMundos;

public class MundoMedieval extends FabricaMundos {
    @Override
    public Personaje crearPersonaje() {
        return new PersonajeMedieval("Caballero", 120);
    }

    @Override
    public Estructura crearEstructura() {
        return new EstructuraMedieval("Fortificada");
    }

    @Override
    public Arma crearArma() {
        return new ArmaMedieval("50 puntos");
    }
}
