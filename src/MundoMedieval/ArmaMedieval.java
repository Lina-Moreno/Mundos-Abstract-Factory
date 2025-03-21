package MundoMedieval;

import ClasesAbstractasMundos.Arma;

public class ArmaMedieval extends Arma {
    // Constructor
    public ArmaMedieval(String dano) {
        super(dano);
    }

    // Implementación del método obtenerUso
    @Override
    public String obtenerUso() {
        return "Arma medieval causa " + getDano() + " de daño y se usa solo en combate cuerpo a cuerpo.";
    }
}