package MundoPostapocaliptico;

import ClasesAbstractasMundos.Estructura;

public class EstructuraPostapocaliptica extends Estructura {
    // Constructor
    public EstructuraPostapocaliptica(String estado) {
        super(estado);
    }

    // Implementación del método obtenerUso
    @Override
    public String obtenerUso() {
        return "Estructura postapocaliptica esta en estado " + getEstado() + " y se usa solo como refugio.";
    }
}