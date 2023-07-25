interface Firstinterface {
    public void startSound();
    public void stopSound();
}

interface Secondinterface {
    public void sleep();
}
class First_interface implements Firstinterface, Secondinterface {
    @java.lang.Override
    public void startSound() {
        System.out.println("Starting sounds");
    }

    @java.lang.Override
    public void stopSound() {
        System.out.println("Stopping sounds");
    }

    @Override
    public void sleep() {
        System.out.println("It's Sleeping, zzzz®");
    }
}

public class Interface_main {
    public static void main(String[] args) {
        First_interface dog = new First_interface();
        dog.startSound();
        dog.stopSound();
        dog.sleep();
    }
}
