package dicTest;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("addDic.fxml"));
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("adminDic.fxml"));
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("dicInter.fxml"));
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("login.fxml"));
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("modDic.fxml"));
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("signup.fxml"));
			// AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("supprDic.fxml"));
			
			Scene scene = new Scene(root,955,563);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

//dicInter