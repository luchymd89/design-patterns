package creational.abstractfactory;

public class ProductB1 implements ProductB {

    public ProductB1() {
        System.out.println("new ProductB1");
    }

    public void doSomething() {
        System.out.println("ProductB1 -> DoSomething()");
    }
}
