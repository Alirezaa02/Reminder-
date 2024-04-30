package org.example.reminder;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;


public class MainController {
    @FXML
    private DatePicker datePicker;

    public void initialize() {
        // Optional: You can set an initial date for the DatePicker
        datePicker.setValue(LocalDate.now());
    }

    // Method to retrieve the selected date and perform some action
    public void handleDateSelection() {
        LocalDate selectedDate = datePicker.getValue();
        System.out.println("Selected date: " + selectedDate);
        // You can perform further actions with the selected date here
    }

}
