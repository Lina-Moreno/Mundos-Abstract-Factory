package ClasesAbstractasMundos;

public abstract class Personaje {
       // Atributos
    private String nombre;
    private int vida;

    // Constructor
    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para vida
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    // Métodos abstractos
    public abstract void atacar();
    public abstract void defenderse(); 
}
