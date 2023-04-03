module com.example.tresillo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tresillo to javafx.fxml;
    exports com.example.tresillo;
}