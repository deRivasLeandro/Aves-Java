public class Ave implements Voladores{
    protected int energia;
    protected int distanciaRecorrida = 0;

    protected String nombre;
    protected Logger logger;


    public Ave(Logger logger, String nombre) {
        this.energia = 2;
        this.logger = logger;
        this.nombre = nombre;
    }
    public void volar(int kms) {
        if (this.energia >= kms*3){
            this.energia -= kms*3;
            this.distanciaRecorrida += kms;
            logger.showInfo(this.nombre + " voló " + kms + " kms.");
        }
        else {
            logger.showError(this.nombre + " no tiene energía suficiente para volar tantos kms.");
        }
    }

    public void comer(int grs) {
        this.energia += grs;
        logger.showInfo(this.nombre + " ingirió " + grs + " grs de comida.");
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }
}