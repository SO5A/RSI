import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.core.behaviours.TickerBehaviour;

public class TimeAgent extends Agent {

		  protected void setup() {
		    System.out.println("Agent: "+getLocalName());

		    addBehaviour(new TickerBehaviour(this, 1000) {
		        protected void onTick() {
		        System.out.println("Agent "+myAgent.getLocalName()+": tick="+getTickCount());
		      } 
		    });

		    addBehaviour(new WakerBehaviour(this, 120000) {
		      protected void handleElapsedTimeout() {
		        System.out.println("Agent "+myAgent.getLocalName()+" Bye ");
		        myAgent.doDelete();
		      } 
		    });
		  } 
}

