module app {
    requires javafx.controls;
    requires javafx.fxml;

    opens app to javafx.fxml;
    exports app;
    exports app.CommandLine;
    exports app.Controller;
    opens app.CommandLine to javafx.fxml;
    opens app.Controller to javafx.fxml;
}
