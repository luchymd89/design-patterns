package creational.abstractfactory;




public class AbstractFactoryDemo {



    public static ClientSideFactory configureClientSideFactory(FactoryType type){
        AbstractFactory factory = null;
        ClientSideFactory clientSideFactory;

        switch (type){
            case UNO:
                factory = new Factory1();
                break;
            case DOS:
                factory = new Factory2();
                break;


        }
        clientSideFactory = new ClientSideFactory(factory);

        return clientSideFactory;

    }


    public static void main(String[] args){

        // Create Products From Factory1: ProdcutA1, ProductB1
        ClientSideFactory clientSideFactory1 = configureClientSideFactory(FactoryType.UNO);
        clientSideFactory1.doStuff();


        // Create Products From Factory2: ProdcutA2, ProductB2
        ClientSideFactory clientSideFactory2 = configureClientSideFactory(FactoryType.DOS);
        clientSideFactory2.doStuff();


    }






}
