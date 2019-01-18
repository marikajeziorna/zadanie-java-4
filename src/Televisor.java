public class Televisor {
    boolean tvOn;

    void showStatus() {
        System.out.println("TV is Off: " + " and it has status: " + getTvStatus());
    }

    boolean getTvStatus() {
        return tvOn;
    }

    void turnOn() {
        tvOn = true;
    }

    void turnOff() {
        tvOn = false;
    }
}







