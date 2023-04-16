public class Ave implements Voladores{
    protected int energia;
    protected int distanciaRecorrida = 0;

    protected String nombre;


    public Ave(String nombre) {
        this.energia = 2;
        this.nombre = nombre;
    }
    public void volar(int kms) {
        if (this.energia >= kms*3){
            this.energia -= kms*3;
            this.distanciaRecorrida += kms;
            Logger.getInstance("INFO").showInfo(this.nombre + " voló " + kms + " kms.");
        }
        else {
            Logger.getInstance("INFO").showError(this.nombre + " no tiene energía suficiente para volar tantos kms.");
        }
    }

    public void comer(int grs) {
        this.energia += grs;
        Logger.getInstance("INFO").showInfo(this.nombre + " ingirió " + grs + " grs de comida.");
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }
}