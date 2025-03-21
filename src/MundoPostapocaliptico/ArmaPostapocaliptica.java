package MundoPostapocaliptico;

import ClasesAbstractasMundos.Arma;

public class ArmaPostapocaliptica extends Arma {
    // Constructor
    public ArmaPostapocaliptica(String dano) {
        super(dano);
    }

    // Implementación del método obtenerUso
    @Override
    public String obtenerUso() {
        return "Arma postapocaliptica causa " + getDano() + " de daño.";
    }
}