module pertermuan_pertama_paw {
    requires javafx.controls;
    requires javafx.fxml;

    opens pertermuan_pertama_paw to javafx.fxml;
    exports pertermuan_pertama_paw;
}
