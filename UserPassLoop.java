mport javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class UserPassLoop extends Application {
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage primaryStage) {

		TextInputDialog dialogLogin = new TextInputDialog();
		dialogLogin.setTitle("Login");
		dialogLogin.setHeaderText("Username and Password");
		dialogLogin.setContentText("Please enter username and Password separated by a comma in between");
		dialogLogin.setGraphic(new ImageView("http://www.lynxmobility.com/images/Login.png"));
		//Stage stage = (Stage) dialogLogin.getDialogPane().getScene().getWindow();
		//stage.getIcons().add(new Image("http://www.lynxmobility.com/images/Login.png"));
		
		Optional<String> input = dialogLogin.showAndWait();
		String[] enteredtext = input.get().split(",");
		String username = enteredtext[0];
		String password = enteredtext[1];

		if (username.equals("wmb2711")) {

			if (password.equals("WestWest")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Congratulations!");
				alert.setHeaderText("You have logged in!");
				alert.setContentText("Welcome " + username + "!");
				alert.showAndWait();

				return;
			} else {
				int passwordTemps = 1;
				while (passwordTemps < 3) {
					dialogLogin.showAndWait();
					passwordTemps++;
				}

			}
			Alert BigBoy = new Alert(AlertType.INFORMATION);
			BigBoy.setContentText("Contact God for help to figure out the password");
			BigBoy.showAndWait();

		} else {
			int passwordTemps = 1;
			while (passwordTemps < 3) {
				dialogLogin.showAndWait();
				passwordTemps++;
			}

			Alert BIGBOD = new Alert(AlertType.INFORMATION);
			BIGBOD.setContentText("Contact God for help on the Username");
			BIGBOD.showAndWait();
		}
	}
}

