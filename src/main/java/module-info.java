module com.example.javafxmlassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmlassignment to javafx.fxml;
    exports com.example.javafxmlassignment;
}