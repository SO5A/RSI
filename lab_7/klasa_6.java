import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import java.util.Scanner;

public class klasa_6 extends Agent {
	
	protected void setup()
	{
		System.out.println("Agent "+ getLocalName() );
		addBehaviour(new CheckNumberVersionTwo());
	}

}

class CheckNumberVersionTwo extends SimpleBehaviour{

	boolean tmp= false;

	public void action()
	{
		System.out.println("Zachowanie startuje");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int num = scanner.nextInt();
		if(num < 0) {
			tmp = true;
		}
	}
		
	
	public boolean done()
	{
		if(tmp)
			System.out.println("Zachowanie zakonczone");
		return tmp;
	}
}