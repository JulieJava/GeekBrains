public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length > 200) {
            System.out.println("Котик столько пробежать не может");
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Котик плавать не умеет :(");
    }
}
