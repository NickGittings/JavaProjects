package trafficlight;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;

public class TrafficLight extends Pane {
	
	//Creating enum State
	public enum State {STOP, CAUTION, GO};
	
	//Creating Rectangle and 3 Circles
	Rectangle box = new Rectangle(300, 100, 200, 400);
	Circle redlight = new Circle(400, 175, 50);
	Circle yellowlight = new Circle(400, 300, 50);
	Circle greenlight = new Circle(400, 425, 50);
	
	//Creating SwitchState method which checks parameter pState for STOP, CAUTION, and GO then fills colors
	public void SwitchState(State pState) {
		if(pState == State.STOP) {
			redlight.setFill(Color.RED);
			yellowlight.setFill(Color.GREY);
			greenlight.setFill(Color.GREY);
		}
		if(pState == State.CAUTION) {
			yellowlight.setFill(Color.YELLOW);
			redlight.setFill(Color.GREY);
			greenlight.setFill(Color.GREY);
		}
		if(pState == State.GO) {
			greenlight.setFill(Color.GREEN);
			redlight.setFill(Color.GREY);
			yellowlight.setFill(Color.GREY);
		}
	}
}

