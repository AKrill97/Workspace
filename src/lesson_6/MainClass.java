package lesson_6;


import org.apache.log4j.Logger;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Need things for external libraries' connection
        //
        // file.jar
        // file.properties
        // optional -> [Class] for library
        //

        Logger logger = Logger.getLogger("MainClass");
        logger.error("Error");
        logger.info("Info");
        logger.debug("Debug");

    }
}
