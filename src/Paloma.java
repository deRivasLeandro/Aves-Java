public class Paloma {
    public Integer energia = 2;
    public void volar(Integer km) {
        if(!(this.energia < km*3)) {
            this.energia -= km * 3;
        }
    }
    public void comer(Integer gramos) {
        this.energia += gramos;
    }
    public Integer getEnergia(){
        return this.energia;
    }

    public void defecar() {
        if(this.energia >= 1) {
            this.energia -= 1;
        }
    }
}
