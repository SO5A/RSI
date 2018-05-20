import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ThreadedBehaviourFactory;

public class Klasa_2_5 extends Agent {
    protected void setup() {
        ThreadedBehaviourFactory tdBF = new ThreadedBehaviourFactory();
        Behaviour a = new CyclicBehaviour(this) {
            public void action() {
                System.out.println("cyclic 1");
            }
        };
        Behaviour b = new CyclicBehaviour(this) {
            public void action() {
                System.out.println("cyclic 2");
            }
        };

        addBehaviour(tdBF.wrap(a));
        addBehaviour(tdBF.wrap(b));
    }
}
