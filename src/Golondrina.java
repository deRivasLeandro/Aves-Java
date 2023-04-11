public class Golondrina extends Ave {
    protected int energiaParaPescar;
    public Golondrina(Logger logger, int energiaParaPescar) {
        super(logger);
        this.energiaParaPescar = energiaParaPescar;
    }
    public void pescar(){
        if (this.energia >= this.energiaParaPescar) {
            Integer numero = (int)(Math.random()*10+1);
            this.energia-=this.energiaParaPescar;
            if(numero == 10) {
                this.energia += 10;
                this.logger.showInfo("La golondrina consiguió pescar.");
            }
            else {
                this.logger.showWarn("La golondrina no pudo pescar.");
            }
        }
        else {
            this.logger.showError("La golondrina no tiene energía suficiente para pescar.");
        }

    }
}
