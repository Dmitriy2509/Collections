package abstractFactory;

public class VW implements Car{
    @Override
    public void createCar() {
        System.out.println("Create VW");
    }
}
