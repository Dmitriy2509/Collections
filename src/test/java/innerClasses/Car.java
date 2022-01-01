package innerClasses;

public class Car {

    private String nameCar;
    private static String nameAlarm = "SomeAlarmSystem";

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    public class Engine {
        public void startEngine() {
            System.out.println("Start engine " + nameCar);
        }

        public void stopEngine() {
            System.out.println("Stop engine " + nameCar);
        }
    }

    public class Multimedia {
        public void turnOnRadio() {
            System.out.println("Radio is turned on " + nameCar);
        }

        public void turnOffRadio() {
            System.out.println("Radio is turned off " + nameCar); //to show both fields
        }
    }

    public static class HiJackAlarm {
        public void turnOnAlarmSystem(){
            System.out.println("Alarm system is activated " + nameAlarm); //to show only static fields
        }

        public void turnOffAlarmSystem() {
            System.out.println("Alarm system is turned off " + nameAlarm);
        }
    }
}
