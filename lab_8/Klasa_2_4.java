import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;

public class Klasa_2_4 extends Agent {
    protected void setup() {
        System.out.println("My name is : " + getLocalName());
        addBehaviour(new Klasa_2_4.FourStep());
        addBehaviour(new Klasa_2_4.FourStep());
        addBehaviour(new Klasa_2_4.FourStep());
    }

    private class FourStep extends Behaviour {
        private int step = 1;

        public void action() {
            switch (step) {
                case 1:
                    myAgent.addBehaviour(new OneShotBehaviour(myAgent) {
                        public void action() {
                            System.out.println("krok pierwszy");
                        }
                    });
                    break;
                case 2:
                    myAgent.addBehaviour(new OneShotBehaviour(myAgent) {
                        public void action() {
                            System.out.println("krok drugi");
                        }
                    });
                    break;
                case 3:
                    Behaviour b = new OneShotBehaviour() {
                        @Override
                        public void action() {
                            System.out.println("krok trzeci");
                            removeBehaviour(this);
                        }
                    };
                    myAgent.addBehaviour(b);
                    break;
            }
            step++;
        }

        public boolean done() {
            return step == 4;
        }

    }

}