public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Constructor con capacidad máxima
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    // Constructor con ambas capacidades
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
    }

    // Getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método para llenar la cafetera
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    // Método para servir una taza
    public void servirTaza(int capacidad) {
        if (this.cantidadActual < capacidad) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= capacidad;
        }
    }

    // Método para vaciar la cafetera
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    // Método para agregar café
    public void agregarCafe(int cantidad) {
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }
}