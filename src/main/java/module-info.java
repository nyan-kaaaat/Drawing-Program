module org.example.drawingprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.drawingprogram to javafx.fxml;
    exports org.example.drawingprogram;
}