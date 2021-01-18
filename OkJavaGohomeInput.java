import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;


public class OkJavaGohomeInput {

	//patamter, 매개변수
	public static void main(String[] args) {
		
		String id = args[0]; //JOptionPane.showInputDialog("Enter a ID"); 입력값을 지정하기 위한 input 생성
		String bright = args[1]; //JOptionPane.showInputDialog("Enter a Bright level");
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		//Security offs
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
	    Lighting floorLamp = new Lighting(id+" / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+ " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
