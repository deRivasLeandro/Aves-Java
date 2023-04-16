public class Mariposa implements Voladores{
    protected String nombre;
    protected int peso = 0;
    protected int grsIngeridos = 0;
    protected int distanciaRecorrida = 0;

    public Mariposa(String nombre) {
        this.nombre = nombre;
    }

    public void volar(int kms) {
        this.distanciaRecorrida += kms;
        Logger.getInstance("INFO").showInfo(this.nombre + " recorrió " + kms + " kms.");
    }

    public void comer(int grs) {
        this.grsIngeridos += grs;
        Logger.getInstance("INFO").showInfo(this.nombre + " ingirió " + grs + " grs.");
        if (this.grsIngeridos>=5) {
            this.peso += this.grsIngeridos/5;
            this.grsIngeridos = this.grsIngeridos%5;
        }
    }

    public int getPeso() {
        return this.peso;
    }

    public int getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }
}
