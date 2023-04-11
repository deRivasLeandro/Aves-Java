public class Ave {
    protected int energia;
    protected Logger logger;


    public Ave(Logger logger) {
        this.energia = 2;
        this.logger = logger;
    }
    public void volar(int kms) {
        if (this.energia >= kms*3){
            this.energia -= kms*3;
            logger.showInfo("El ave voló " + kms + " kms.");
        }
        else {
            logger.showError("El ave no tiene energía suficiente para volar tantos kms.");
        }
    }

    public void comer(int grs) {
        this.energia += grs;
        logger.showInfo("El ave ingirió " + grs + " grs de comida.");
    }

    public int getEnergia() {
        return this.energia;
    }
}