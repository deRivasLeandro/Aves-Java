public class Paloma extends Ave {

    public Paloma(String nombre) {
        super(nombre);
    }
    public void defecar() {
        if(this.energia >= 1) {
            this.energia--;
            this.distanciaRecorrida++;
            Logger.getInstance("INFO").showWarn(this.nombre + " defecó.");
        }
        else {
            Logger.getInstance("INFO").showError(this.nombre + " no tiene energía suficiente para defecar.");
        }
    }
}
