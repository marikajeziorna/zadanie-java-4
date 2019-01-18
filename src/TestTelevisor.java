public class TestTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.showStatus();
        televisor.turnOff();
        System.out.println("TV is Off: " + " status: " + false);
        televisor.turnOn();
        System.out.println("TV is On: " + " status: " + true);
    }
}
