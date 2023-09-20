package creational.factory;

public enum ProductType {

    A("A"), B("B");

    private final String text;

    ProductType( String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
