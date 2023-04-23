module com.example.twitterclon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.twitterclon to javafx.fxml;
    exports com.example.twitterclon;
}