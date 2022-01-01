package innerClasses;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Car.Engine carEngine = car.new Engine();
        Car.Multimedia carMultimedia = car.new Multimedia();
        Car.HiJackAlarm carHijackAlarm = new Car.HiJackAlarm();

        carHijackAlarm.turnOffAlarmSystem();
        carEngine.startEngine();
        carMultimedia.turnOnRadio();

        carMultimedia.turnOffRadio();
        carEngine.stopEngine();
        carHijackAlarm.turnOnAlarmSystem();
    }
}
