module org.una.uber {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.una.uber to javafx.fxml;
    exports org.una.uber;
}
