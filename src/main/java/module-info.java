module com.example.sae201 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.sae201 to javafx.fxml;
    exports com.example.sae201;
}