package trafficlight;

//Importing JavaFX scene & application and also state from trafficlight
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import trafficlight.TrafficLight.State;
import javafx.scene.layout.FlowPane;

public class TrafficLightDisplayer extends Application {
	
	//Creates TrafficLight object named displayer
	TrafficLight displayer = new TrafficLight();
	
	//Creating stop, caution, and go buttons
	private Button stopButton = new Button("Stop");
	private Button cautionButton = new Button("Caution");
	private Button goButton = new Button("Go");
	
	
	public void start(Stage primaryStage) {
			
			//Sets displayer's graphic colors
			displayer.box.setFill(Color.BLACK);
			displayer.redlight.setFill(Color.GREY);
			displayer.yellowlight.setFill(Color.GREY);
			displayer.greenlight.setFill(Color.GREY);
			
			//Setting actions for stop, caution, and go buttons
			stopButton.setOnAction(event -> {
				displayer.SwitchState(State.STOP);
			});
			
			cautionButton.setOnAction(event -> {
				displayer.SwitchState(State.CAUTION);
			});
			
			goButton.setOnAction(event -> {
				displayer.SwitchState(State.GO);
			});
			
			//Creating FlowPane for buttons
			FlowPane pane = new FlowPane(stopButton, cautionButton, goButton);
			pane.setAlignment(Pos.CENTER);
			pane.setHgap(100);
			
			//Grouping displayer's graphics
			Group root = new Group(displayer.box, displayer.greenlight, displayer.redlight, displayer.yellowlight, pane);
			
			//Creating scene
			Scene scene = new Scene(root, 800, 600, Color.WHITE);
			
			//Setting title, scene, and showing stage
			primaryStage.setTitle("Traffic Light Displayer");
			primaryStage.setScene(scene);
			primaryStage.show();
				
	}
	
	//For launching JavaFX program without IDE
	public static void main(String[] args) {
		launch(args);
	}
}

