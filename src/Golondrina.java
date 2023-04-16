public class Golondrina extends Ave {
    protected int energiaParaPescar;
    public Golondrina(Logger logger, int energiaParaPescar, String nombre) {
        super(logger, nombre);
        this.energiaParaPescar = energiaParaPescar;
    }
    public void pescar(){
        if (this.energia >= this.energiaParaPescar) {
            Integer numero = (int)(Math.random()*10+1);
            this.energia-=this.energiaParaPescar;
            this.distanciaRecorrida++;
            if(numero == 10) {
                this.energia += 10;
                this.logger.showInfo(this.nombre + " consiguió pescar.");
            }
            else {
                this.logger.showWarn(this.nombre + " no pudo pescar.");
            }
        }
        else {
            this.logger.showError(this.nombre + " no tiene energía suficiente para pescar.");
        }

    }
}
