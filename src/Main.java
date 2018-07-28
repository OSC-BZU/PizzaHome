import Services.BaseViewInterface;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application implements BaseViewInterface{

    @Override
    public void start(Stage primaryStage) throws Exception {
        loadFXMLLocal("Views/MainWindowComponent/MainWindow.fxml", primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
