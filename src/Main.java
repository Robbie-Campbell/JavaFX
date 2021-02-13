import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{

    Stage window;
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;

        HBox topMenu = new HBox();
        Button button1 = new Button("Home");
        Button button2 = new Button("Fireplaces");
        Button button3 = new Button("Suppliers");
        topMenu.getChildren().addAll(button1, button2, button3);
        
        VBox leftMenu = new VBox();
        Button buttonA = new Button("Blash");
        Button buttonB = new Button("Hello");
        Button buttonC = new Button("Pffft");
        leftMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram()
    {
        Boolean answer = ConfirmBox.display("Exit", "Are you sure you want to exit?");
        if (answer)
            window.close();
    }
}