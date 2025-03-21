package MundoFuturista;

import ClasesAbstractasMundos.Estructura;

public class EstructuraFuturista extends Estructura {
    // Constructor
    public EstructuraFuturista(String estado) {
        super(estado);
    }

    // Implementación del método obtenerUso
    @Override
    public String obtenerUso() {
        return "Estructura futurista esta en estado " + getEstado();
    }
}