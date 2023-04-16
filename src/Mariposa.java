public class Mariposa implements Voladores{
    protected String nombre;
    protected int peso = 0;
    protected int grsIngeridos = 0;
    protected int distanciaRecorrida = 0;

    protected Logger logger;

    public Mariposa(Logger logger, String nombre) {
        this.nombre = nombre;
        this.logger = logger;
    }

    public void volar(int kms) {
        this.distanciaRecorrida += kms;
        logger.showInfo(this.nombre + " recorrió " + kms + " kms.");
    }

    public void comer(int grs) {
        this.grsIngeridos += grs;
        logger.showInfo(this.nombre + " ingirió " + grs + " grs.");
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
