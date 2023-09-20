package creational.abstractfactory;

public class ClientSideFactory {

        private ProductA productA;
        private ProductB productB;


        public ClientSideFactory(AbstractFactory abstractFactory) {

            productA = abstractFactory.createProductA();
            productB = abstractFactory.createProductB();
        }

        public void doStuff(){
            productA.doSomething();
            productB.doSomething();
        }

}
