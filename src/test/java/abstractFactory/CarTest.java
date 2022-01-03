package abstractFactory;

public class CarTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car toyota = carFactory.getCar(Brands.TOYOTA);
        Car vw = carFactory.getCar(Brands.VW);
        Car gm = carFactory.getCar(Brands.GM);

        toyota.createCar();
        vw.createCar();
        gm.createCar();
    }
}
