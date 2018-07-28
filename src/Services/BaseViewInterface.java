package Services;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by jihadbadran on 7/28/18.
 */
public interface BaseViewInterface {

    /**
     * this method just load the selected fxml file
     * generate a Scene
     * put the scene in the Stage
     * @see Scene
     * @see Stage
     * @see FXMLLoader
     * @param resource - String location of the give fxml file
     * @param stage - Stage is the stage that will hold the FXML contents
     * @throws Exception
     */
    default void loadFXMLLocal(String resource, Stage stage) throws Exception{
        // this line will load the file 'Views/MainWindow.fxml'
        // this is the main window file that will show every button that can lead to any other window
        Parent layout = FXMLLoader.load(getClass().getResource(resource));

        // this is the main scene
        Scene mainScene = new Scene(layout);

        stage.setScene(mainScene);
    }
}
