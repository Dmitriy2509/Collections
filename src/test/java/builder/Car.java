package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private int carLength;
    private int carWidth;
    private int carHeight;
    private int cost;
    private String name;
    private List<String> options;
    private List<String> serviceOptions;

    @Override
    public String toString() {
        return "Car{" +
                "carLength=" + carLength +
                ", carWidth=" + carWidth +
                ", carHeight=" + carHeight +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", options=" + options +
                ", serviceOptions=" + serviceOptions +
                '}';
    }

    public static class Builder{
        private Car car;

        public Builder(){
            car = new Car();
        }

        public Builder carLength (int carLength) {
            car.carLength = carLength;
            return this;
        }

        public Builder carWidth(int carWidth) {
            car.carWidth = carWidth;
            return this;
        }

        public Builder carHeight(int carHeight) {
            car.carHeight = carHeight;
            return this;
        }

        public Builder carCost(int carCost) {
            car.cost = carCost;
            return this;
        }

        public Builder carName(String carName) {
            car.name = carName;
            return this;
        }

        public Builder carOptions(List<String> listOption){
            car.options = listOption;
            return this;
        }

        public Builder carServiceOptions(List<String> serviceOption) {
            car.serviceOptions = serviceOption;
            return this;
        }

        public Car build() {
            return car;
        }

    }

    public static void main(String[] args) {
         int carLength = 4300;
         int carWidth = 1800;
         int carHeight = 2000;
         int cost = 15000;
         String name = "goodCar";
         List<String> options = new ArrayList<>();
         options.add("first option");
         options.add("second option");
         List<String> serviceOptions = Arrays.asList("first option", "second option", "third option");

        Car firstCar = new Car.Builder()
                .carLength(carLength)
                .carWidth(carWidth)
                .carHeight(carHeight)
                .carCost(cost)
                .build();
        System.out.println(firstCar.toString());

        Car secondCar = new Car.Builder()
                .carLength(carLength)
                .carWidth(carWidth)
                .carHeight(carHeight)
                .carCost(cost)
                .carName(name)
                .carOptions(options)
                .carServiceOptions(serviceOptions)
                .build();

        System.out.println(secondCar);
    }
}
