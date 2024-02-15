module com.uniquindio.tallerconceptos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.uniquindio.tallerconceptos to javafx.fxml;
    exports com.uniquindio.tallerconceptos;
}