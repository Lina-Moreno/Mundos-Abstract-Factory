package ClasesAbstractasMundos;

public abstract class Arma {
    
private String dano;

    // Constructor
    public Arma(String dano) {
        this.dano = dano;
    }

    // Métodos get y set para dano
    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }
    
    public abstract String obtenerUso();
}
