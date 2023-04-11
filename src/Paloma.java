public class Paloma extends Ave {

    public Paloma(Logger logger) {
        super(logger);
    }
    public void defecar() {
        if(this.energia >= 1) {
            this.energia -= 1;
            logger.showWarn("La paloma defecó y perdió energía.");
        }
        else {
            logger.showError("La paloma no tiene energía suficiente para defecar.");
        }
    }
}
