package abstractFactory;

public class CarFactory {

    public Car getCar(Brands brands) {
        Car returnCar = null;

        switch (brands) {
            case TOYOTA:
                returnCar = new Toyota();
                break;
            case VW:
                returnCar = new VW();
                break;
            case GM:
                returnCar = new VW();
                break;
            default:
                System.out.println("Wrong type");
        }

        return returnCar;
    }
}
