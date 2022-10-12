module com.example.project9_part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project9_part2 to javafx.fxml;
    exports com.example.project9_part2;
}