import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        TextUserControlViewImpl customControl = new TextUserControlViewImpl();
        stage.setScene(new Scene(customControl));
        stage.setTitle("Custom Control");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
