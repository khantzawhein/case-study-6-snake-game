module com.se233.snakegame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires org.apache.logging.log4j;


    opens com.se233.snakegame to javafx.fxml;
    exports com.se233.snakegame;
}