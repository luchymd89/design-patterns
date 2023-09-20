package creational.factory;

public class CreatorA extends Creator {

    public Product createProduct() {
        return new ProductA();
    }
}
