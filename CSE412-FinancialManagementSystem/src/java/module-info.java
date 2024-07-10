module com.example.cse412financialmanagementsystem {
    // Requires JavaFX controls module for UI components
    requires javafx.controls;
    
    // Requires JavaFX FXML module for FXML file handling
    requires javafx.fxml;
    
    // Requires Java SQL module for database connectivity
    requires java.sql;
    
    // Opens the specified package to JavaFX FXML for controller access
    opens com.example.cse412financialmanagementsystem to javafx.fxml;
    
    // Exports the specified package to make it accessible to other modules
    exports com.example.cse412financialmanagementsystem;
}
