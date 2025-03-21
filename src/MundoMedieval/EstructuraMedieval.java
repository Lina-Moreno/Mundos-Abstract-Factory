package MundoMedieval;

import ClasesAbstractasMundos.Estructura;

public class EstructuraMedieval extends Estructura {
    // Constructor
    public EstructuraMedieval(String estado) {
        super(estado);
    }

    // Implementación del método obtenerUso
    @Override
    public String obtenerUso() {
        return "Estructura medieval esta en estado " + getEstado();
    }
}