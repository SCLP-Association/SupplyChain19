module com.example.supplychain19 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.supplychain19 to javafx.fxml;
    exports com.example.supplychain19;
}