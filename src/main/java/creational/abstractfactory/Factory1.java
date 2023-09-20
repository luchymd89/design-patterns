package creational.abstractfactory;

public class Factory1 implements AbstractFactory {


    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB1();
    }
}
