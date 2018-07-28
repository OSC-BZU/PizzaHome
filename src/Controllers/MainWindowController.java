package Controllers;

import Services.BaseViewInterface;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Created by jihadbadran on 7/28/18.
 */
public class MainWindowController implements BaseViewInterface{



    Stage stage = new Stage();

    public void goToLogin(MouseEvent mouseEvent){
        try {
            loadFXMLLocal("/Views/LogInComponent/LogInPage.fxml", stage);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
