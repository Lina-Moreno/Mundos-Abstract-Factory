package ClasesAbstractasMundos;

public abstract class Estructura {
    private String estado;

    // Constructor
    public Estructura(String estado) {
        this.estado = estado;
    }

    // Métodos get y set para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método abstracto
    public abstract String obtenerUso(); 
}
