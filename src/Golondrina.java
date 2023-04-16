public class Golondrina extends Ave {
    protected int energiaParaPescar;
    public Golondrina(int energiaParaPescar, String nombre) {
        super(nombre);
        this.energiaParaPescar = energiaParaPescar;
    }
    public void pescar(){
        if (this.energia >= this.energiaParaPescar) {
            Integer numero = (int)(Math.random()*10+1);
            this.energia-=this.energiaParaPescar;
            this.distanciaRecorrida++;
            if(numero == 10) {
                this.energia += 10;
                Logger.getInstance("INFO").showInfo(this.nombre + " consiguió pescar.");
            }
            else {
                Logger.getInstance("INFO").showWarn(this.nombre + " no pudo pescar.");
            }
        }
        else {
            Logger.getInstance("INFO").showError(this.nombre + " no tiene energía suficiente para pescar.");
        }

    }
}
