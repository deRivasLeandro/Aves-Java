
public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("INFO");
        Golondrina pepita = new Golondrina(logger, 2);
        Golondrina pepon = new Golondrina(logger, 1);
        Paloma bombon = new Paloma(logger);
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
