import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EnumDemo extends Application {
public enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("All The Months");
		primaryStage.setWidth(500);
		ComboBox<Months> combo = new ComboBox<>();
		combo.getItems().addAll(Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September,Months.October,Months.November,Months.December );
		Label label = new Label("Hello there please select a month from the list of months.");
		Button button = new Button("Exit");
		VBox BigBod = new VBox();
		combo.setOnAction(e-> {
				switch(combo.getValue()) {
				case January :
				case February:
				case December :
						label.setText("Would you like it to snow? or not? Its winter so impossible.");
						break;
				case March :
				case April :
				case May : 
						label.setText("Spring break is upon us my friends");
						break;
				case June : 
				case July :
				case August :
						label.setText("Make sure not to get sun brun in the summer heat dude");
						break;
				case September :
				case October :
				case November :
						label.setText("Got a rake for them fall leaves");
						break;
				}
		});
		
		
	button.setOnAction(e->System.exit(0));
	BigBod.getChildren().add(label);
	BigBod.getChildren().add(combo);
	BigBod.getChildren().add(button);
	Scene scene = new Scene(BigBod);
	primaryStage.setScene(scene);
	primaryStage.show();
	
				
		}
	
	
	
	}


