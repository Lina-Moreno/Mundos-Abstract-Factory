package MundoFuturista;

import ClasesAbstractasMundos.Arma;

public class ArmaFuturista extends Arma {
    // Constructor
    public ArmaFuturista(String dano) {
        super(dano);
    }

    // Implementación del método obtenerUso
    @Override
    public String obtenerUso() {
        return "Arma futurista causa: " + getDano() + " de daño";
    }
}