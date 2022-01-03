package abstractFactory;

public class GM implements Car{
    @Override
    public void createCar() {
        System.out.println("Create GM");
    }
}
