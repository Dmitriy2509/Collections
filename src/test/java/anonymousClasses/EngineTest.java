package anonymousClasses;

public class EngineTest {
    public static void main(String[] args) {
        EngineClass engine = new EngineClass();
        engine.startEngine();

        EngineClass webasto = new EngineClass(){
            @Override
            public void startEngine() {
                System.out.println("Webasto is started");
            }
        };

        System.out.println("The 'startEngine' method of anonymous class is used");
        webasto.startEngine();

        System.out.println("Example of anonymous class with interface");

        EngineInterface engineSystem = new EngineInterface() {
            @Override
            public void startEngine() {
                System.out.println("Engine is started after pressing the 'start' button");
            }
        };
        engineSystem.startEngine();

        EngineInterface engineWebasto = new EngineInterface() {
            @Override
            public void startEngine() {
                System.out.println("Webasto is started");
            }
        };

        engineWebasto.startEngine();
    }
}
