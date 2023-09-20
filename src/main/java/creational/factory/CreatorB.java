package creational.factory;

public class CreatorB extends Creator{


    public Product createProduct() {
        return new ProductB();
    }
}
