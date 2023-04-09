import java.lang.annotation.Target;

public class Pepita {
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

    public void pescar(){
        Integer numero = (int)(Math.random()*10+1);
        this.energia-=2;
        if(numero == 10) {
            this.energia += 10;
        }
    }
}
