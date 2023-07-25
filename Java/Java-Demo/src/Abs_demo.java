abstract class Abs_demo {
    abstract void startSound();
    protected void stopSound() {
        System.out.println("Stopping sounds");
    }
}

class Pig extends Abs_demo {
    protected void startSound() {
        System.out.println("Started sounds");
    }
}

class Abs_main {
    public static void main (String[] args) {
        Pig start = new Pig();
        start.startSound();
        start.stopSound();
    }
}