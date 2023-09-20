package creational.factory;

public abstract class Creator {

    public void someOperation(){

        Product product = createProduct();
        product.doSomething();

    }


    public abstract Product createProduct();

}
