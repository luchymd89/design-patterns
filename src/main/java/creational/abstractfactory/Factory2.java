package creational.abstractfactory;

public class Factory2 implements AbstractFactory {


    public ProductA createProductA() {
        return new ProductA2();
    }

    public ProductB createProductB() {
        return new ProductB2();
    }

}
