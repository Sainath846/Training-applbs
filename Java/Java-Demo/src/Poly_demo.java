public class Poly_demo {
    public void animalSound() {
        System.out.println("starts sounds");
    }
}

class Dog extends Poly_demo {
    public void animalSound() {
        System.out.println("dog Starts Sounds");
    }
}

class Cat extends Poly_demo {
    public void animalSound() {
        System.out.println("cat Starts Sounds");
    }
}

class Poly {
    public static void main(String[] args) {
        Poly_demo[] animal = new Poly_demo[2];
        animal[0] = new Dog();
        animal[1] = new Cat();

        for (Poly_demo i : animal) {
            i.animalSound();
        }
    }
}
