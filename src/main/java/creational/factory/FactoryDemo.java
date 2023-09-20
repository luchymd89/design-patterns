package creational.factory;

public class FactoryDemo {

    private static Product product;

    public static void main(String[] args){

        // Create ProductA
        configure(ProductType.A);
        runBusinessLogic();

        // Create ProductB
        configure(ProductType.B);
        runBusinessLogic();


    }

    static void configure(ProductType type){
        switch (type){
            case A:
                product = new ProductA();
                break;
            case B:
                product = new ProductB();
                break;

        }

    }

    static void runBusinessLogic(){
        product.doSomething();
    }
}
