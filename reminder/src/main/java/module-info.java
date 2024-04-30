module org.example.reminder {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.reminder to javafx.fxml;
    exports org.example.reminder;
}