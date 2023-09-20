package creational.abstractfactory;

public class ProductA1 implements ProductA {

    public ProductA1() {
        System.out.println("new ProductA1");
    }

    public void doSomething() {
        System.out.println("ProductA1 -> DoSomething()");
    }
}
