public class Pepon {
    public Integer energia = 2;

    public void pescar(){
        Integer numero = (int)(Math.random()*10+1);
        this.energia-=1;
        if(numero == 10) {
            this.energia += 10;
        }
    }
    public Integer getEnergia(){
        return this.energia;
    }
}
