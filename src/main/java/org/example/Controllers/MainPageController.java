package org.example.Controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.App;

public class MainPageController {

    @FXML
    private void switchToDatabaseActions() throws IOException {
        App.setRoot("fx-database-page");
    }

    @FXML
    private void switchToMailActions() throws IOException {
        App.setRoot("fx-mail-page");
    }
}
