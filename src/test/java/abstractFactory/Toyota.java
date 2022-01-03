package abstractFactory;

public class Toyota implements Car{
    @Override
    public void createCar() {
        System.out.println("Create Toyota");
    }
}
