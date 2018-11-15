package logger;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String ...args) {
        logger.setLevel(Level.ALL);
        logger.finer("ENTRY");
        logger.log(Level.INFO, "logger info");
        Main.exampleFunction();
        logger.finer("RETURN");

        try {
            FileHandler h = new FileHandler("%t/logger.log", 1000, 2);
            h.setFormatter(new SimpleFormatter());
            logger.addHandler(h);
            logger.log(Level.SEVERE, "test log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void exampleFunction() {
        logger.entering("Main", "exampleFunction" );
        System.out.println("in function");
        logger.exiting("Main", "exampleFunction" );
    }
}
