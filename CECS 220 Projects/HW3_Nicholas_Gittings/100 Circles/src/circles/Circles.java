package circles;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.Group;
import javafx.scene.Scene;

public class Circles extends Application { 
	
	public void start(Stage primaryStage) {
		
		//Creating random object
		Random rand = new Random();
		
		//Creating group and scene
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600, Color.WHITE);
		
		//Adds 100 circles
		for(int i = 0; i <= 100; i++) {
			
			//Random x&y pos and radius
			int x = rand.nextInt(800) + 1;
			int y = rand.nextInt(600) + 1;
			int rad = rand.nextInt(100) + 1;
			//if radius is bigger than 50 not filled
			if(rad >= 50) {
				Circle circle = new Circle(x, y, rad);
				circle.setStroke(Color.BLACK);
				circle.setFill(null);
				root.getChildren().add(circle);
			}
			//else radius is smaller, fill
			else {
				Circle circle = new Circle(x, y, rad, Color.BLUE);
				root.getChildren().add(circle);
			}
			
		}
		
		//Adds scene to stage, sets title and shows 
		primaryStage.setTitle("100 Circles");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	//Launches without IDE
	public static void main(String[] args) {
		launch(args);
	}
	
}
