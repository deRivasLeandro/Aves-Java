public class Paloma extends Ave {

    public Paloma(Logger logger, String nombre) {
        super(logger, nombre);
    }
    public void defecar() {
        if(this.energia >= 1) {
            this.energia--;
            this.distanciaRecorrida++;
            logger.showWarn(this.nombre + " defecó.");
        }
        else {
            logger.showError(this.nombre + " no tiene energía suficiente para defecar.");
        }
    }
}
