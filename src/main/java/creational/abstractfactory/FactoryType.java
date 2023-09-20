package creational.abstractfactory;

public enum FactoryType {

    UNO("1"), DOS("2");

    private final String text;

    FactoryType( String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
