public class Logger {
    public static Logger instance;
    public String type;

    public Logger(String typeOfLogger) {
        this.type = typeOfLogger;
    }

    public static Logger getInstance(String type) {
        if (instance == null) {
            instance = new Logger(type);
        }
        return instance;
    }

    public void showInfo(String message) {
        if (type == "INFO") {
            System.out.println("INFO: " + message);
        }
    }

    public void showWarn(String message) {
        if (type == "INFO" || type == "WARN") {
            System.out.println("WARN: " + message);
        }
    }

    public void showError(String message) {
            System.out.println("ERROR: " + message);
    }
}
