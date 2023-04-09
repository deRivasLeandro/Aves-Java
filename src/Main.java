
public class Main {
    public static void main(String[] args) {
        Pepita pepita = new Pepita();
        Pepon pepon = new Pepon();
        Paloma bombon = new Paloma();
        pepita.comer(5);
        pepita.volar(1);
        pepita.comer(20);
        pepita.volar(2);
        System.out.println("Energía de Pepita: " + pepita.getEnergia());
        System.out.println("Energía de Pepón: " + pepon.getEnergia());
        pepita.pescar();
        pepon.pescar();
        System.out.println("Energía de Pepita: " + pepita.getEnergia());
        System.out.println("Energía de Pepón: " + pepon.getEnergia());
        pepita.pescar();
        pepon.pescar();
        System.out.println("Energía de Pepita: " + pepita.getEnergia());
        System.out.println("Energía de Pepón: " + pepon.getEnergia());
        System.out.println("Energía de Bombón: " + bombon.getEnergia());
        bombon.defecar();
        System.out.println("Energía de Bombón: " + bombon.getEnergia());
        Logger loggerInfo = new Logger("INFO");
        Logger loggerWarn = new Logger("WARN");
        Logger loggerError = new Logger("ERROR");
        loggerInfo.showInfo("LOGGER INFO");
        loggerInfo.showWarn("LOGGER INFO");
        loggerInfo.showError("LOGGER INFO");
        loggerWarn.showInfo("LOGGER WARN");
        loggerWarn.showWarn("LOGGER WARN");
        loggerWarn.showError("LOGGER WARN");
        loggerError.showInfo("LOGGER ERROR");
        loggerError.showWarn("LOGGER ERROR");
        loggerError.showError("LOGGER ERROR");
    }
}
